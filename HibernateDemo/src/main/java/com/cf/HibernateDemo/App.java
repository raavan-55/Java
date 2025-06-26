package com.cf.HibernateDemo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
       SessionFactory sf=cfg.buildSessionFactory();
       Session s=sf.openSession();
       Studentaa stu=new Studentaa(1,"akansha",78,78,78);
        Transaction tx=s.beginTransaction();
        s.save(stu);
        tx.commit();
        s.close();
    }
}
