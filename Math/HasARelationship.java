
class Brain{
	String color;
	int weight;
	public Brain(String color,int weight) {
		this.color=color;
		this.weight=weight;
	}
	public String getColor() {
		return color;
		}
	public int getWeight() {
	 return weight;
		}
}
class Heart{
	String color;
	int weight ;
	Heart(int weight,String color){
		this.weight=weight;
		this.color=color;
	}
	int getweight() {
		return weight;
	}
	String getcolor() {
		return color;
	}
	
}
class Bike{
	int mileage;
	String brand;
	Bike(int mileage,String brand){
		this.brand=brand;
		this.mileage=mileage;
	}
	int getMileage() {
		return mileage;
	}
    String getBrand() {
    	return brand;
    }
}
class Book{
	String author;
	int page;
	Book(String author,int page){
		this.author=author;
		this.page=page;
	}
	int getPage() {
		return page;
		}
	String getAuthor() {
		return author;
	}
	}

 class Student{
	 Brain b=new Brain("red",5);
	 Heart h=new Heart(20,"red");
	 void bike(Bike b) {
		 System.out.println(b.brand);
		 System.out.println(b.getMileage());
	 }
	 void book(Book b) {
		 System.out.println(b.author);
		 System.out.println(b.page);
	 }
 }

 
class HasARelationship{
	public static void main(String[] args) {
	Student s=new Student();
	System.out.println(s.h.color);
	System.out.println(s.h.weight);
	System.out.println(s.b.color);
	System.out.println(s.b.weight);
	
	Bike b=new Bike(35,"Classic 350");
	Book bk=new Book("ramdhari singh dinkar",500);
	s.bike(b);
	s.book(bk);
	s=null;
	
	
}
}




