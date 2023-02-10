import java.util.Scanner;
 public class Denomin {
  public static void main (String[] args){
  Scanner reader = new Scanner(System.in);
  
  System.out.println("Enter the total amount : ");
    int  amount = reader.nextInt();
 int noOf2kNotes = amount/2000;
 int balance = amount %2000;
   System.out.println("balance value is "+balance);

  
 int noOf500Notes = balance/500;
  balance = balance %500;
  System.out.println("balance value is "+balance);
   
 int noOf200Notes = balance/200;
  balance = balance %200;
  System.out.println("balance value is "+balance);
 
   int noOf100Notes = balance/100;
  balance =balance %100;
  System.out.println("balance value is "+balance);
  
  
   int noOf50Notes = balance/50;
  balance = balance %50;
  System.out.println("balance value is "+balance);
   
    int noOf10Notes = balance/10;
  balance = balance %10;
  System.out.println("balance value is "+balance);
  
  int noOfCoins= balance/1;
System.out.println("balance value is "+balance);


   System.out.println("2000 * "+noOf2kNotes+"="+2000*noOf2kNotes+"." );
   
   System.out.println("500 * "+noOf500Notes+"="+500*noOf500Notes+".");
   
   System.out.println("200 * "+noOf200Notes+"="+200*noOf200Notes+".");
   
   System.out.println("100 * "+noOf100Notes+"="+100*noOf100Notes+".");
   
   System.out.println("50 * "+noOf50Notes+"="+50*noOf50Notes+".");
   
   System.out.println("10 * "+noOf2kNotes+"="+10*noOf2kNotes+".");
   
   System.out.println("1 * "+noOfCoins+"="+1*noOf2kNotes+".");
  
  
   //System.out.println("you have "+noOf2kNotes+" 2000Rs note & "+noOf500Notes+" 500Rs note & "+noOf200Notes+" 200Rs note "+noOf100Notes+" 100Rs note & "+noOf10Notes+" 10Rs note & "+noOf50Notes+" 50Rs note & "+noOfCoins+" 1Rs coins .");
  
   System.out.println("");
 
reader.close ();    
  }
}