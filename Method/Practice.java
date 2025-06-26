class Prac 
{
int a;
int b;
Prac(){
	this(5);
a=20;
b=30;
}
Prac(int a){
a=40;
b=50;
}
void disp(){
	System.out.println(a);
System.out.println(b);

   
}
}

class Practice
{

public static void main(String[] args){
	Prac ref=new Prac();
    ref.disp();
Prac ref2=new Prac();
ref2.disp();
}
}
