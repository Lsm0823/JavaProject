package ch11;

//import java.util.Arrays;

//public class WrapperEx2 {
//	public static void main(String[] args) {
/*
 * char c1 = 'J'; System.out.println(c1); if(Character.isLetter(c1))
 * System.out.println(c1 +" : 문자입니다");
 * 
 * char c2 = 'a'; if(Character.isLetter(c2)) System.out.println(c2 +
 * " : 소문자입니다");
 * 
 * 
 * char c3 = '2'; if(Character.isDigit(c3)) System.out.println(c3 + " : 숫자입니다");
 * 
 * char c4 = ' '; if(Character.isWhitespace(c4)) System.out.println(c4 +
 * " : 공백입니다");
 * 
 * //Long i; Boolean b; Short s; Double d; Float f; Byte bt; Integer j;
 * Character c;
 * 
 * int sum = 0;
 * 
 * for(int i = 0; i < 100000; i++) { String str = String.valueOf(i);
 * StringBuffer sb = new StringBuffer(str); String reversdeStr =
 * sb.reverse().toString();
 * 
 * if(str.equals(reversdeStr)) sum += (Integer)i; }
 * 
 * int sum1 = 0;
 * 
 * for(int i1 = 0; i1 < 100000; i1++) { String b1 = Integer.toBinaryString(i1);
 * //10진수 2진수로 변환 StringBuffer sb = new StringBuffer(b1); String reversdeStr =
 * sb.reverse().toString();
 * 
 * if(b1.equals(reversdeStr)) sum1 += (Integer)i1; }
 */

/*
 * 2진수와 10진수의 대칭되는 숫자를 더하는 문제 int sum = 0;
 * 
 * for(int i = 0; i < 100000; i++) { String str = String.valueOf(i); // 정수를 문자열로
 * 변환 String b1 = Integer.toBinaryString(i); // 정수를 2진수로 변환 StringBuffer sb1 =
 * new StringBuffer(str); String reversdeStr = sb1.reverse().toString();
 * StringBuffer sb2 = new StringBuffer(b1); String reversdeStr2 =
 * sb2.reverse().toString();
 * 
 * if( str.equals(reversdeStr) && b1.equals(reversdeStr2)) sum += (Integer)i; }
 * System.out.println(sum); //System.out.println(sum);
 * //System.out.println(sum1);
 */

/*
 * static final int MAX = 100000;
 * 
 * public static void main(String[] args) {
 * 
 * 앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 합니다. 대칭수(palindrome)인
 * 585는 2진수로 나타내도 1001001001가 되어 여전히 대칭수입니다.
 * 
 * 
 * // 문제1.10진법의 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
 * 
 * // 문제2.2진법의 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
 * 
 * // 문제3.10진법과 2진법으로 모두 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
 * 
 * int[] answer = new int[3]; PalindromeEx1 pe = new PalindromeEx1(); for (int i
 * = 1; i <= MAX; i++) { if (pe.isPalindrome(i, 10)) { answer[0] += i; } if
 * (pe.isPalindrome(i, 2)) { answer[1] += i; } if (pe.isPalindrome(i, 2) &&
 * pe.isPalindrome(i, 10)) { answer[2] += i; } }
 * System.out.println(Arrays.toString(answer)); }
 * 
 * public boolean isPalindrome(int x, int numberType) { StringBuilder sb = new
 * StringBuilder(Integer.toString(x, numberType)); if
 * (sb.toString().equals(sb.reverse().toString())) { return true; } else return
 * false; } }
 * 
 * 
 * }
 * 
 * }
 */