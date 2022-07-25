package part_1;

public class call_by_value {
	
		int val = 150;
		int operation(int val)
		{
			val=val*10/100;
			return val;
		}

	public static void main(String[] args) {
		
		call_by_value a = new call_by_value();
		
		System.out.println("before:"+ a.val);
		int x= a.operation(100);
		System.out.println("after:"+ x);

	}

}

