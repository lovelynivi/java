import java.util.Scanner;
 public class SimpleInterest {
  public static void main(String[] args){
   Scanner reader =new Scanner (System.in);
   System.out.println("enter the principal amount : " );
   long  principal = reader.nextLong();
   System.out.println("enter the percentage of intrest : " );
    int intrest = reader.nextInt();
     System.out.println("dureation to loan recive : " );
    long noOfDay = reader.nextLong();
   double calculation = principal*intrest/100; 
   System.out.println(principal +"amount the rate of interest "+intrest+"% is : "+ calculation +" for "+noOfDay+"days.");
   double calculat =(principal + calculation);
   System.out.println("the total paid amount is : "+calculat);
   reader.close();
  }
}
 
 