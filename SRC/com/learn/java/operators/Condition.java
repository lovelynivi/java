import java.util.Scanner;

public class Condition{
 public static void main(String[] args){
  //Find the biggest of 3 numbers.
  //int  con = (condition)? a | c : b ;//which one is biggest.
int a = 7;
int b = 6;
int c = 5;
int d = 4;
int biggest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

System.out.println("the biggest no is = "+ biggest);
System.out.println("");

//Find the biggest of 2 numbers
int max = (c>b)?c:b;
System.out.println("the biggest of two no is = "+ max);
System.out.println("");


//Check whether the given number is odd or even.
// creates an object of Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your odd number: ");
      int number1 = input.nextInt();
    System.out.print("Enter your even number: "); 
    int number2 = input.nextInt();
  // prints the name
   System.out.println("is "+number1 +" odd number  : "+ (number1%2==1));
   System.out.println("is "+number2 +" even number : "+(number2%2==0));  
    
   System.out.println("");
   
   
//Check whether the person is eligible to vote or not.

  String name          = "Raja" ;
  String gender        = "meal";
  System.out.println("Enter your age : ");
  int age              = input.nextInt();	// byte or short will also be appropriate here

  
  boolean  isEligibleToVote  = ((age >= 21)? true : false );
  
 System.out.println("Name                  :" + name);
 System.out.println("Gender                :" + gender);
 System.out.println("Age                   :" + age);
 System.out.println("Eligible to vote      :" + isEligibleToVote); 
 System.out.println("");

  
  System.out.println("");
 
  
  
//  the scanner close  
   input.close();
  }
}      