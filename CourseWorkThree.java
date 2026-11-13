import java.util.Scanner;
public class CourseWorkThree{
	public static void main (String[]args){
		Scanner input = new Scanner (System.in);
		System.out.println("+" + "-".repeat(54) + "+") ;
		System.out.println("|               SALARY INFORMATION SYSTEM              |");
		System.out.println("+" + "-".repeat(54) + "+");
		
		System.out.println();
		System.out.println();
		
		System.out.println("\t[1]  Calculate Income Tax ");
		System.out.println("\t[2]  Calculate Anual Bouns ");
		System.out.println("\t[3]  Calculate Loan Amount ");
		
		System.out.println();
		System.out.println();
		
		System.out.print("Enter an option to continue > ");
		int option = input.nextInt();
		switch(option){
			case 1 :
				System.out.println("+" + "-".repeat(54) + "+");
				System.out.println("|               Calculate Income Tax                   |");
				System.out.println("+" + "-".repeat(54) + "+") ;				System.out.println();
				System.out.print("Enter Your Name : ");
				String name = input.next();
				System.out.print("Enter Your montly Income : ");
				double sal = input.nextDouble();
				double tax ;
				
				if (sal <= 100000) {
					tax = 0;
				} else if (sal <= 141667) {
					tax = (sal - 100000) * 0.06;
				} else if (sal <= 183333) 
				
				{
					tax = (41667 * 0.06) + (sal - 141667) * 0.12;
				} else if (sal <= 225000) 
				{
					tax = (41667 * 0.06) + (41667 * 0.12) + (sal - 183333) * 0.18;
				} else if (sal <= 266667) 
				{
					tax = (41667 * 0.06) + (41667 * 0.12) + (41667 * 0.18) + (sal - 225000) * 0.24;
				} else if (sal <= 308333) 
				{
					tax = (41667 * 0.06) + (41667 * 0.12) + (41667 * 0.18) + (41667 * 0.24) + (sal - 266667) * 0.30;
				} else 
				{
					tax = (41667 * 0.06) + (41667 * 0.12) + (41667 * 0.18) + (41667 * 0.24) + (41667 * 0.30) + (sal - 308333) * 0.36;
				}
				
				System.out.println("Hello " + name + ". You have to pay Income Tax per month : " + (int)tax);
				break;
				
			case 2 :
				System.out.println("+" + "-".repeat(54) + "+") ;
				System.out.println("|               Calculate Annual Bonus                 |");
				System.out.println("+" + "-".repeat(54) + "+") ;
				System.out.println();
				System.out.print("Enter Your Name : ");
				String name2 = input.next();
				System.out.print("Enter Your montly Income : ");
				double sal2 = input.nextDouble();
				double bonus = 0;
				
				if (sal2 < 100000) {
					bonus = 5000;
				} else if (sal2 < 200000) {
					bonus = sal2 * 0.10;
				} else if (sal2 < 300000) {
					bonus = sal2 * 0.15;
				} else if (sal2 < 400000) {
					bonus = sal2 * 0.20;
				} else {
					bonus = sal2 * 0.35;
				}
				System.out.println("Annual bonus   - " + bonus);
				break;
					
			case 3:
			    System.out.println("+" + "-".repeat(54) + "+") ;
				System.out.println("|               Calculate Loan amount                  |");
				System.out.println("+" + "-".repeat(54) + "+") ;
				System.out.println();
				System.out.println();
				System.out.print("Input employee Name - ");
				String name3 = input.next();
				System.out.print("Input your salary : ");
				double sal3 = input.nextDouble ();
								
				if (sal3<=50000){
				 System.out.print("You can not get a loan because your salary lessthan RS. 50 000...");
			 }
			 
			 
			 
			    else {
				System.out.print("Enter number of Year : ");
				int year = input.nextInt();
				switch (year) {
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
					double r = 0.15;
					int n = year * 12;
					double MI = sal3 * 0.60;
					double LA = (int)(MI * (1 - (1 / Math.pow(1 + (r / 12), n))) / (r / 12));
					
				System.out.println("You can get Loan Amount : " + LA);
            break;
        default:
            System.out.print("Please Enter 1-5 year ");
    }
}
				 

				  
				  
				  break;
				
			default :
				System.out.print("Plese Select Only 1,2 or 3");
			}
		}
		} 
	

