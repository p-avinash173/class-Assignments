package part_1;

public class Find_greater_value {
	
	int greater(int x, int y)
	{	int z;
		if(x>y)
			z=x;
		else 
			z=y;
		return z;
	}

	public static void main(String[] args) {
		
		Find_greater_value g = new Find_greater_value();
		int i = g.greater(9, 2);
		System.out.println("greater value is : "+i);
	}

}

