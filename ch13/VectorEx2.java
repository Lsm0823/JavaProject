package ch13;

import java.util.Vector;

public class VectorEx2 {

   public static void main(String[] args) {
      String str[] = {"�븣����","������","��������","����ũ","ĳ����"};
      
      Vector vlist1 = new Vector();
      Vector<String> vlist2 = new Vector<String>();
      for (int i = 0; i < str.length; i++) {
         vlist1.add(str[i]);
         vlist2.add(str[i]);
      }	//for(str)
      for (int i = 0; i < vlist1.size(); i++) {
         String s = (String)vlist1.get(i);
         String s1 = vlist2.get(i);
      }	//for(vlist1)	�Ϲ� for��
      
      for (Object obj : vlist1) {
         
      }	//for(vlist1), Object Ÿ�� for��
      for(String string : vlist2) {
         
      }		//for(vlist2)
   }	//main
}