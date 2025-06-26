class CapacityMethod {

	public static void main(String[] args) {
		
StringBuilder sb=new StringBuilder("1234567890");
// sb.ensureCapacity(60);
System.out.println(sb.capacity());
sb.append("1234567890123456");
System.out.println(sb.capacity());
sb.append("1");
System.out.println(sb.capacity());
sb.append("123456789012345");
System.out.println(sb.capacity());
sb.append("123456789012345678901234567890123456789012345678901234567890");
System.out.println(sb.capacity());


	}

}
