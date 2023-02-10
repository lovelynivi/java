import java.util.Scanner;
 public class  PositiveOrNegtive{
  public static void main (String[] args){
  Scanner reader = new Scanner(System.in);
  
  System.out.println("Enter the number  : ");
    double num = reader.nextDouble();
  
  if (num >=0){
   System.out.println(num+" Number is positive .");
  }
  else if(num <0){
   System.out.println(num+" Number is negtive .");
  }
  else{
   System.out.println("Invalid input .");
  }
  
  
  
  
     System.out.println("");
 reader.close ();    
  }
}