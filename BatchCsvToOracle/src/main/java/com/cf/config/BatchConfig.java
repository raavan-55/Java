package com.cf.config;




import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.cf.model.User;

@Configuration
@EnableBatchProcessing
public class BatchConfig {
	
	

	@Autowired
	private DataSource dataSource;
	@Autowired
	private JobBuilderFactory jobBuilderFactory;
	@Autowired
	private StepBuilderFactory stepBuiderFactory;
	@Bean
	public FlatFileItemReader<User> reader(){
		
		FlatFileItemReader<User> reader=new FlatFileItemReader<>();
		ClassPathResource cpr=new ClassPathResource("user.csv");
		reader.setResource(cpr);
		reader.setLineMapper(getLineMapper());
		reader.setLinesToSkip(1);
		return reader;
		
		
	}
	private LineMapper<User> getLineMapper() {
		
		DefaultLineMapper<User> lineMapper=new DefaultLineMapper<>();
		DelimitedLineTokenizer dlt=new DelimitedLineTokenizer();
		dlt.setNames(new String[] {"userId","name","salary"});
		dlt.setIncludedFields(new int[] {0,1,3});
		
		BeanWrapperFieldSetMapper<User> fieldSetter=new BeanWrapperFieldSetMapper<>();
		fieldSetter.setTargetType(User.class);
		
		lineMapper.setLineTokenizer(dlt);
		lineMapper.setFieldSetMapper(fieldSetter);
		
		return lineMapper;
	}
	
	@Bean
	public ItemProcessor<User ,User> processor() {
		return new UserItemProcessor();
	}
	
	public JdbcBatchItemWriter<User> writer(){
		JdbcBatchItemWriter<User> writer=new JdbcBatchItemWriter<>();
		writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<User>());
		writer.setSql("insert into user1(userId,name,salary) values(:userId,:name,:salary)");
		writer.setDataSource(this.dataSource);
		return writer;
	}
	@Bean
	public Job importUserJob() {
		return this.jobBuilderFactory.get("User-import-job")
				.incrementer(new RunIdIncrementer())
				.flow(step1()).end().build();
		
	}
	@Bean
	public Step step1() {
	return	this.stepBuiderFactory.get("step1")
		.<User,User>chunk(10).reader(reader())
		.processor(processor())
		.writer(writer())
		.build();
		
	}
	
}
