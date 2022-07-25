package part_2;

import part_2.Test_M;
import part_2.Test_P;
import part_2.Test_N;
public class Test_Z extends Test_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test_X().PublicMethod();
		new Test_N().PublicMethod();
		new Test_M().PublicMethod();
		
		new Test_Z().ProtectedMethod();
		new Test_P().MethodInP();
		System.out.println( "value of long in class X is "+new Test_X().l);
		System.out.println( "value of float in class X is "+new Test_X().f);
		System.out.println( "value of char in class X is "+new Test_X().c);
	
	}

}

