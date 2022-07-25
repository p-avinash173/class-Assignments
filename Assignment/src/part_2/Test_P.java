package part_2;

public class Test_P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Test_M().PublicMethod();
		new Test_M().ProtectedMethod();
		//new M().defaultMethod();
		//new N().PublicMethod();
		new Test_N().ProtectedMethod();
		new Test_N().DefaultMethod();
		new Test_P().MethodInP();
		

}
	public void MethodInP(){
		System.out.println( "value of int in class N is "+ new Test_N().k);
	}
}


