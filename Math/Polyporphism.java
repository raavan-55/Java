class Teacher{
	void teach() {
		System.out.println("Teacher is teacher.");
	}
}
class PhyTeacher extends Teacher{
	void teach() {
		System.out.println("Physics Teacher is teacher.");
	}
}
class ChemTeacher extends Teacher{
	void teach() {
		System.out.println("Chemistry Teacher is teacher.");
	}
}
class BioTeacher extends Teacher{
	void teach() {
		System.out.println("Bio Teacher is teacher.");
	}
}
public class Polyporphism {
  public static void main(String[] args) {
	  Polyporphism ref=new Polyporphism(); 
	  Teacher t=new Teacher();
	  PhyTeacher p=new  PhyTeacher();
	  ChemTeacher c=new  ChemTeacher();
	  BioTeacher b=new  BioTeacher();
	 
	  ref.accept(p);
	  ref.accept(c);
	  ref.accept(b);
  }
	  void accept(Teacher t1) {
		t1.teach();  
	  }
	  
	  

}
