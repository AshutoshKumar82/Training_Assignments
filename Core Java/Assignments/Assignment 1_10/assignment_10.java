class TaxCalculator{
	String empname=null;
	public void calculateTax(String empname, boolean isIndian, double empSal){
		
	double taxAmount;
try {
		if (isIndian != true) {
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
		}
		if (empname==null) {
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		}
		if (empSal > 100000 && isIndian == true) {
			taxAmount=empSal*8/100;
			System.out.println("Tax amount is "+taxAmount);
		}
		else if (empSal < 100000 && empSal > 50000 ) {
			taxAmount = empSal*6/100;
			System.out.println("Tax amount is "+taxAmount);
		}
		else if (empSal > 30000 && empSal < 50000 ) {
				taxAmount = empSal*5/100;
				System.out.println("Tax amount is "+taxAmount);
		}
		else if (empSal >10000 && empSal <30000) {
			taxAmount =empSal*4/100;
			System.out.println("Tax amount is "+taxAmount);
			
		}
		else {
			throw new TaxNotEligibleException("The employee does not need to pay tax");
		}
		
	}
catch(CountryNotValidException e) {
	System.out.println(e.getMessage());
}
catch(TaxNotEligibleException e) {
	System.out.println(e.getMessage());
}
catch( EmployeeNameInvalidException e) {
	System.out.println(e.getMessage());
}

	}
		
	public void calculateTax(boolean isIndian, double empSal){
		try {
		if (empname==null){
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		}
		}
		catch(EmployeeNameInvalidException e) {
			System.out.println(e.getMessage());
		}
	
	}
}
	class EmployeeNameInvalidException extends Exception{
		public EmployeeNameInvalidException(String e) {
			super(e);
		}
	}
	class CountryNotValidException extends Exception{
		public CountryNotValidException(String e) {
			super(e);
		}
	}
	class TaxNotEligibleException extends Exception{
		public TaxNotEligibleException(String e) {
			super(e);
		}
	}
public class assignment_10 {
public static void main(String args[]) {
	TaxCalculator calc= new TaxCalculator();
	calc.calculateTax("Ron", false, 34000);
	calc.calculateTax("Tim", true, 1000);
	calc.calculateTax("Jack", true, 55000);
	calc.calculateTax(null, true, 30000);
}
}
