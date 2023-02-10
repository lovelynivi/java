import java.util.Scanner;
 public class Denomination{
  public static void main (String[] args){
  Scanner reader = new Scanner(System.in);
   int denominations[]= new int [5];
   System.out.println("Enter the no of Notes on 2000 : ");
   denominations[0] = reader.nextInt();
    
  System.out.println("Enter the no of Notes on 500 : ");
    denominations[1] = reader.nextInt();
    
  System.out.println("Enter the no of Notes on 200  : ");
   denominations[2] = reader.nextInt();
   
 System.out.println("Enter no of Notes on 100 : ");
    denominations[3] = reader.nextInt();
   
   System.out.println("Enter the no of Notes on 50 : ");
    denominations[4] = reader.nextInt();
    
  int total = denominations[0]*2000;
  total =(denominations[1]*500)+total;  
  
  total =(denominations[2]*200)+total;
  total =(denominations[3]*100)+total;
  total =(denominations[4]*50)+total;
  
  
  System.out.println("your total amount is : "+total+".");
  
  
  
  
  
  
  
  
  
  
  
  
  
  
   System.out.println("");
 
reader.close ();    
  }
}