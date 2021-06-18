import java.util.Scanner;
class Grades 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,sum=0,avg=0;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();

		sum=a+b+c;
		avg=sum/3;
		System.out.println("Your average is :"+avg);


		if(avg>=90 && avg<=100){
			System.out.println("Grade A");
		}

		else if(avg>=80 && avg<=89){
			System.out.println("Grade B");
		}

		else if(avg>=70 && avg<=79){
			System.out.println("Grade C");
		}

		else if(avg>=60 && avg<=69){
			System.out.println("Grade D");
		}

		else if(avg<60){
			System.out.println("Grade F");
		}
	}
}