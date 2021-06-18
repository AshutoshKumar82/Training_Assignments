import java.util.Scanner;
class Books{
	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);
	int num_of_books;
	int points;
	num_of_books=sc.nextInt();

	if(num_of_books==0){
		points=0;
		System.out.println("The number points awarded="+points);
	}

	else if(num_of_books==1){
		points=5;
		System.out.println("The number of points awarded="+points);
	}

	else if(num_of_books==2){
		points=15;
		System.out.println("The number of points awarded="+points);
	}

	else if(num_of_books==3){
		points=30;
		System.out.println("The number of points awarded="+points);
	}

	else if(num_of_books==4){
		points=60;
		System.out.println("The number of points awarded="+points);
	}

	}
}
