import java.util.Scanner;
 public class  WeekDay{
  public static void main (String[] args){
  Scanner reader = new Scanner(System.in);
  
  System.out.print("Enter the weekdays in number  : ");
    byte num = reader.nextByte();
  /*
  switch (num){
  case 1:
    System.out.println("Day "+num+" is Monday .");
    break;
  case 2:
    System.out.println("Day "+num+" is Tuesday .");
    break;
  case 3:
    System.out.println("Day "+num+" is Wednesday .");
    break;
  case 4:
    System.out.println("Day "+num+" is Thursday .");
    break;
     case 5:
    System.out.println("Day "+num+" is Friday .");
    break;
  case 6:
    System.out.println("Day "+num+" is Saturday .");
    break;
     case 7:
    System.out.println("Day "+num+" is Sunday .");
    break;
  default:
    System.out.println("Invalid input .");
}
System.out.println();
*/
 reader.close ();
 
 String[] days = new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
  	System.out.println("Day "+num+" is " + days[num-1] +".");
     
 
 //printDay(num);	// Function Call
  }
  
  /** Function Definition - Print Day function gets a byte as input and prints the day of that number **/
  public static void printDay(byte num) {
  	String[] days = new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
  	System.out.println("Day "+num+" is " + days[num-1] +".");
  }
}