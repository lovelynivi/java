import java.util.Scanner;
 public class ConditionalIf {
  public static void main (String[] args){
  Scanner reader = new Scanner(System.in);
  
  
//Find the biggest 2 numbers
  int one ,two ,biggest;
  System.out.println("enter the first number : ");
  one = reader.nextInt();
  System.out.println("enter the second number : ");
   two =reader.nextInt();
  if (one>two){
  biggest = one ;
  }
   else 
  biggest =two ;
  System.out.println("the biggest number is : " +biggest);
  
//Find the biggest, smallest of 3 numbers
    int x ,y ,z ;
  System.out.println("enter the  number of x : ");
     x = reader.nextInt();
  System.out.println("enter the  number of y : ");
     y =reader.nextInt();           
  System.out.println("enter the  number of z : ");
     z = reader.nextInt();
  if (x>y && x>z)
 	 System.out.println("the biggest number is x : " +x);
  
  else if (y>z)
  System.out.println("the biggest number is y : " +y);
  
  else
  System.out.println("the biggest number is z : " +z);
  
  
//Check whether the given number is odd or even
    System.out.print("Enter your odd or even number: ");
      int num = reader.nextInt();
      if (num%2==1)
         System.out.println("the odd number is : "+num);
      else 
         System.out.println("the even number is : "+num);
  
  
//Check whether the given character is uppercase or lowercase character
    System.out.print("Enter the character : ");
     char c = reader.next().charAt(0);
     if (Character.isUpperCase(c))
     System.out.println("the character "+c+" is uppercase .");
     else
   
     System.out.println("the character "+c+" is lowercase .");
     
     
     
//Check whether the candidate is eligible to vote or not.
   System.out.println("Enter your age : ");
   int age = reader.nextInt();
   if (age>=21)
      System.out.println("you are eligible to vote ");
   else 
      System.out.println("you are not eligible to vote ");   


//Get five marks of the student to check whether the student is eligible for the next grade.
  System.out.println("enter the mark of subject 1 : ");
   int sub1 = reader.nextInt();
    
  System.out.println("enter the mark of subject 2 : ");
   int sub2 = reader.nextInt();
    
  System.out.println("enter the mark of subject 3 : ");
   int sub3 = reader.nextInt();
    
  System.out.println("enter the mark of subject 4 : ");
   int sub4 = reader.nextInt();
    
  System.out.println("enter the mark of subject 5 : ");
   int sub5 = reader.nextInt(); 
  
   //System.out.println("You've entered invalid input, please enter marks between 0 and 100");
  int totalMark =  (sub1 +  sub2 +  sub3 +  sub4 +  sub5) ;
   System.out.println("the student total mark is : "+totalMark);
   
//      455         56          76       84       56            455f         56           76            84           56
 if (sub1>100 || sub2>100 || sub3>100 || sub4>100 || sub5>100)
   System.out.println("You've entered invalid input, please enter marks between 0 and 100");
   
  else if (sub1>=35 && sub2>=35 && sub3>=35 && sub4>=35 && sub5>=35)
   System.out.println("Congrats! the student is eligible for the next grade .");
 else 
   System.out.println("Sorry, the student is not eligible for the next grade .");








  System.out.println("");
  
 reader.close ();   
  }
}