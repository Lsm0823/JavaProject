package ch04;

import java.util.Iterator;
import java.util.TreeSet;

public class LottoLucky2 {

	public static void main(String[] args) {
		Object lotto[] = getLotto();
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i] + "\t");
		}
		}
	
	//자료구조 : Collechtion 기능 --> 중복을 허용하지 않는 자료구조
	
	public static Object[] getLotto() {
		//데이터를 저장해주는 바구니 역할 TreeSet<자료형>
		TreeSet<Integer> tr = new TreeSet<Integer>();
		for(int i=0; tr.size() < 6; i++) {
			tr.add((int)(Math.random()*45+1));
		}
		Object lotto[] = tr.toArray();
		return lotto;
	}
}
