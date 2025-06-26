class ConstructorStatiVariabl 
{
    static int a=10;
       ConstructorStatiVariabl(int a)
       {
		//this.a=a;
       }
    void method(){
		 System.out.println(a);
    } 
     
}

class ConstructorStatiVariable 
{
	public static void main(String[] args) 
	{
 
//ConstructorStatiVariabl ref=new ConstructorStatiVariabl();
 System.out.println(ConstructorStatiVariabl.a);
ConstructorStatiVariabl ref1=new ConstructorStatiVariabl(20);
       System.out.println(ConstructorStatiVariabl.a);
ref1.method();
ConstructorStatiVariabl ref=new ConstructorStatiVariabl(30);
		 System.out.println(ref1.a);
ref.method();
       
	}
}
