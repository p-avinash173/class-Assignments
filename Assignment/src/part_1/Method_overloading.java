package part_1;

public class Method_overloading {
	
	public int calculate(int x, int y)
	{	
		int z=x+y;
		return z;
	}
	public int calculate(int x)
	{	
		int m= (int)3.14*x*x;
		return m;
	}
	public int calculate(float c, float d)
	{	
		int m = (int) ((int)c*d);
		return m;
	}
	public int calculate(float d)
	{	
		int j= (int)((int)d*d);
		return j;
	}
	

	public static void main(String[] args) {
		Method_overloading C = new Method_overloading();
		int q=C.calculate(2,6);
		int w=C.calculate(1);
		int e=C.calculate(2f,6f);
		int r=C.calculate(2f);
		
		System.out.println("add:"+ q);
		System.out.println("circle:"+ w);
		System.out.println("rect:"+ e);
		System.out.println("sq:"+ r);
	}

}

