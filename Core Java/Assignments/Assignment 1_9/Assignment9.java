class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// Test case #1:
		KidUsers kidUsers = new KidUsers();
		
		kidUsers.setAge(10);
		kidUsers.setBookType("Kids");
		kidUsers.registerAccount();
		kidUsers.requestBook();
		
		kidUsers.setAge(18);	
		kidUsers.setBookType("Fiction");		
		kidUsers.registerAccount();
		kidUsers.requestBook();

		System.out.println();
		
		// Test case #2:
		AdultUser adultUser = new AdultUser();
		
		adultUser.setAge(5);
		adultUser.setBookType("Kids");
		adultUser.registerAccount();
		adultUser.requestBook();
		
		adultUser.setAge(23);	
		adultUser.setBookType("Fiction");		
		adultUser.registerAccount();
		adultUser.requestBook();
		
	}

}
 class AdultUser implements LibraryUser {
	private int age;
	private String bookType; 

	public void setAge(int age) {
		this.age = age;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		if (age > 12)
			System.out.println("You have successfully registered under a Adult Account");
		
		if (age <= 12)
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");

	}

	@Override
	public void requestBook() {
		if (bookType.equals("Fiction"))
			System.out.println("Book Issued successfully, please return the book within 7 days");
		else
			System.out.println("Oops, you are allowed to take only adult Fiction books");

	}

}
 class KidUsers implements LibraryUser {
	private int age;
	private String bookType; 

	public void setAge(int age) {
		this.age = age;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		if (age <= 12)
			System.out.println("You have successfully registered under a Kids Account");
		
		if (age > 12)
			System.out.println("Sorry, Age must be less than 12 to register as a kid");

	}

	@Override
	public void requestBook() {
		if (bookType.equals("Kids"))
			System.out.println("Book Issued successfully, please return the book within 10 days");
		else
			System.out.println("Oops, you are allowed to take only kids books");
	}

}
 interface LibraryUser {
	public void registerAccount();
	public void requestBook();
}