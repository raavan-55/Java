 class StringcompareTo {

	public static void main(String[] args) {
		String s1="Saurav";
		String s2="Saurav";
		if (s1.compareTo(s2)>0) {
			System.out.println(s1+" is greater than "+s2);
		}
		else if (s1.compareTo(s2)<0) {
			
			System.out.println(s1+" is smaller than "+s2);
		}
		else{
			System.out.println(s1+" is equal to  "+s2);
		}

	}

}
