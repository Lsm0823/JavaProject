package ch11;

public class StringEx2 {

	public static void main(String[] args) {
		String str = "Java Programming";
		
		int len = str.length();
		System.out.println("len : " + len);
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		String str2 = str.substring(5);
		String str3 = str.substring(5,10);
		
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
		char c1 = str.charAt(8);
		System.out.println(c1);
		//짝수 자리 문자만 출력
		for(int i =0; i < str.length(); i++) {
			if(i%2 == 0) {
				System.out.println(str.charAt(i));
			}
		}
		int idx1 = str.indexOf('a');
		System.out.println("\n" + " idx1 : " +idx1);
		int idx2 = str.lastIndexOf('a');
		System.out.println("\n" + " idx2 : " +idx2);
		int s = str.compareTo(str3);

		System.out.println(str.replace('a', 'e'));
		
		/*
		 * for(int i = 0; i< str.length(); i++) { if(str.charAt(i) == 'a')
		 * System.out.println('q'); else System.out.print(str.charAt(i)); }
		 */
		
		// str을 반대로 출력 charAt,?
		
		for(int i = len-1;  i >= 0;  i--) {
			System.out.print(str.charAt(i));
		}
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println("\n" + sb.reverse());
		
		String str5 = "Java&JSP&Android&Iot&Spring";
		String str6[] = str5.split("&");
		for(int i = 0; i<str6.length; i++) {
			System.out.println(str6[i]);
		}
		String str7 = "                    JSPStrudy               ";
		System.out.println("***" + str7.trim() + " ***");
		int idx3 = 22;
		String str8 = String.valueOf(idx3);
		String str9 = idx3 +"";
		System.out.println(str8 + " : " + str9);
		
		
		
		}
}
