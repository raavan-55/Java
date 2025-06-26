 class InternMethod {

	public static void main(String[] args) {
		 String s1=new String("Anubhav");
		 String s2=s1.intern();
		 System.out.println(s2);
		 String s3="Anubhav";
		 if(s2==s3){
			 System.out.println("References are equal");
		 }
		 else{
			 System.out.println("References are not equal");
		 }

	}

}
