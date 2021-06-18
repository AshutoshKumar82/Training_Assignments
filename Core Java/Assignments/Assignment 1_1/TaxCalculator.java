package Assignment1;

public class TaxCalculator {
	
	 float basicSalary;
	 boolean citizenShip;
	 float tax;
	 int netSalary;
	 
	 TaxCalculator(float basicSalary,boolean citizenShip){
		 this.basicSalary=basicSalary;
		 this.citizenShip=citizenShip;
	 }
	
	public void calculateTax() {
		tax = (30*basicSalary)/100;
		System.out.println("The tax of the employee for the "+(int)basicSalary+" is "+(int)tax);
	}
	
	public void deductTax() {
		netSalary=(int) (basicSalary-tax);
		System.out.println("The Net Salary of the employee "+netSalary);
	}
	
	public void validateTax() {
		if((basicSalary>100000) && (citizenShip==true)) {
			System.out.println("The salary and citizenship eligibility: true");
		}else {
			System.out.println("The salary and citizenship eligibility: false");
		}
	}
	
	public static void main(String []args) {
		TaxCalculator tc=new TaxCalculator(25000,true);
		tc.calculateTax();
		tc.deductTax();
		tc.validateTax();
		
		TaxCalculator tc1=new TaxCalculator(125000,true);
		tc1.calculateTax();
		tc1.deductTax();
		tc1.validateTax();
	}

}
