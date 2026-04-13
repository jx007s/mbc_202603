package lang_p;

public class StringMain {

	public static void main(String[] args) {
		//   "나는무너"   문자열 인스턴스를 생성하여 주소를 리턴한다. 
		String s1 = "나는무너";
		String s2 = "나는무너";
		String s3 = s1;
		String s4 = new String(s1);
		char [] arr = {'나','는','무','너'};
		String s5 = new String(arr);

		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		System.out.println("s4 : "+s4);
		System.out.println("s5 : "+s5);
		
		System.out.println("s1.toString() : "+s1.toString());
		System.out.println("s1.length() : "+s1.length()); //글자길이
		System.out.println("s1.equals(s2) : "+s1.equals(s2));
		System.out.println("s1==s2 : "+(s1==s2));
		System.out.println("s1.equals(s4) : "+s1.equals(s4));
		System.out.println("s1==s4 : "+(s1==s4));
		
		System.out.println("\"나는무너\".toString() : "+"나는무너".toString());
		
		System.out.println("\"나는무너\".length() : "+"나는무너".length()); //글자길이
		System.out.println("\"나는무너\".equals(s2) : "+"나는무너".equals(s2));
		System.out.println("\"나는무너\"==s2 : "+("나는무너"==s2));
	}

}
