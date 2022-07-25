package part_1;

public class Area_of_rectangle{
		
		 int area(int x, int y)
		 {	
			int z= x*y; 
			return z;
		 }
		 
		 

		public static void main(String[] args) {
			
			Area_of_rectangle a = new Area_of_rectangle();
			int Area = a.area(5, 10);
			System.out.println("area of rectangle : "+Area);

		}

}
