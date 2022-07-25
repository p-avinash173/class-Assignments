package part_2;

import part_2.Test_N;
import part_2.Test_M;
public class Test_Y extends Test_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test_X().PublicMethod();
		new Test_N().PublicMethod();
		new Test_M().PublicMethod();
		
		new Test_Y().ProtectedMethod();
		System.out.println( "value of int in class N is "+ new Test_N().k);
		System.out.println( "value of long in class X is "+new Test_X().l);
		System.out.println( "value of float in class X is "+new Test_X().f);
		System.out.println( "value of char in class X is "+new Test_X().c);
	}

}

