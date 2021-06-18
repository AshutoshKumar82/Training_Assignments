class Area1 {
	 public void calculateShapeArea(int N,int side) {
		 switch(N){
			 case 3:
				 double c=0.433*side*side;
				 System.out.println("The area of triangle is "+c);
				 break;
			 case 4:
				 int d=side*side;
				 System.out.println("the area of the square is"+d);
		 }
	 }
	

}
 public class Area{
	 public static void main(String args[]) {
		 Area1 ob=new Area1();
		 ob.calculateShapeArea(3,12);
		 Area1 ob1=new Area1();
		 ob1.calculateShapeArea(4,15);
	 }
	 
 }