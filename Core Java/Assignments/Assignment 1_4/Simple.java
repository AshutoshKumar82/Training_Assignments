
class SimpleInterestCalculator {
		double p;
		int N;
	public void	calculatorSimpleInterest(double p, int N){
		if(p>100000) {
			if(N>10) {
				double simple_interest= (p*N*10)/100;
				System.out.println(""+simple_interest);
			}
			else
			{
			double Simple_interest=(p*N*9.5)/100;
			System.out.println(""+Simple_interest);
			}
		}
		else if(p<100000) {
			if(N>10) {
				double Simple_interest=(p*N*5)/100;
				System.out.println(""+Simple_interest);
			}
			else {
				double Simple_interest=(p*N*4.5)/100;
				System.out.println(""+Simple_interest);
			}
		}
		
	}
}
 public class Simple{
	 public static void main(String args[]) {
		 SimpleInterestCalculator ob=new SimpleInterestCalculator();
		 ob.calculatorSimpleInterest(200000,12);
		 SimpleInterestCalculator ob1=new SimpleInterestCalculator();
		 ob1.calculatorSimpleInterest(50000,12);
		 SimpleInterestCalculator ob2=new SimpleInterestCalculator();
		 ob2.calculatorSimpleInterest(50000,5);
		 
	 }
 }