import java.util.Scanner;
 public class CalculatEbBill{
  public static void main (String[] args){
  Scanner reader = new Scanner(System.in);
  
  System.out.println("Enter the eb bill units : ");
     int units = reader.nextInt();
     
   if (units<=100){
     System.out.println(units+" your eb bill is free . ");
     }
   else if (units<=300) {
     System.out.println(units+" your bill is "+((units-100)*2.50)+".");
   }  
   else if (units<=500) {
     System.out.println(units+" your bill is "+(((300-100)*2.50)+((units-300)*3))+".");
   }
   else if (units<=1000){
     System.out.println(units+" your bill is "+(((300-100)*2.50)+((500-300)*3)+((units-1000)*5))+".");
   }
   else if (units>1000){
     System.out.println(units+" your bill is "+(((300-100)*2.50)+((500-300)*3)+((1000-1000)*5)+((units-1000)*7))+".");
   }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  reader.close ();  
  }
}