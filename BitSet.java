/*
Output - 
B1 :{0, 3}
B2 :{1, 4}
*/

import java.util.*;
public class BitsetDemo {
		public static void main(String[] args) {
				BitSet b1 = new BitSet(5);
				BitSet b2 = new BitSet(5);
				b1.set(0,true);
				b1.set(1, false);
				b1.set(2, false);
				b1.set(3, true);
				b1.set(4, false);
				b2.set(0,true);
				b2.set(1,true);
				b2.set(2,false);
				b2.set(3,true);
				b2.set(4,true);
				b1.and(b2);
				System.out.println("B1 :"+b1);
				b2.xor(b1);
				System.out.println("B2 :"+b2);
	}
}
