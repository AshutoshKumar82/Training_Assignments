import java.util.Scanner;
class Software{
	public static void main(String args[]){
		int packages=0;
		Scanner sc=new Scanner(System.in);

		packages=sc.nextInt();

		if(packages < 10){
			System.out.println("Discount: " + (packages * 99));
		}

		if(packages > 99){
			System.out.println("Discount:" + (packages * 99 * .5) + " Total:" + (packages * 99));
		}

		if (packages >= 10 && packages <= 19) {
        System.out.println("Discount:" + (packages * 99 * .2) + " Total:" + (packages * 99));
      } else if (packages >= 20 && packages <= 49) {
        System.out.println("Discount:" + (packages * 99 * .3) + " Total:" + (packages * 99));
      } else {
        System.out.println("Discount:" + (packages * 99 * .4) + " Total:" + (packages * 99));
      }
			
	}
}