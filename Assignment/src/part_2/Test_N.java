package part_2;

public class Test_N {


	public void PublicMethod(){
		DefaultMethod();
		new Test_M().ProtectedMethod();
	}
	void DefaultMethod(){
		System.out.println( "value of double in class N is"+ d);
	}
	protected void ProtectedMethod(){
		System.out.println( "value of long in class N is "+ l1);
	}
	
	protected long l1=33l;
	public int k=29;
	double d =45.6d;

}

