import java.util.Scanner;

public class Uints {
 public static void main(String[] args){
 Scanner input = new Scanner(System.in);
 

 //cms to metres vice versa.
  double valueInCM = 200;
  double valueInCMs =40.8;
  double metre = valueInCM /100;
  double metres = valueInCMs /100;
  System.out.println("cm into metres = "+metre);
  System.out.println("cm into metres conversiton = "+metres);
  System.out.println("");
  
  //metres to kms/miles vice versa.
  double km = 5;
  double met = km*1000; //(m=km*1000, 1000 meter is equal to 1 kilometer)
  double metToKm =1000/km;
  System.out.println("km to metre = "+met) ; 
  System.out.println("metre to km = "+ metToKm);
  System.out.println("");

  //inches to feet vice versa.  
  double inc = 14;
  double feet = inc/12;
  double incFeet= 12*inc;
  System.out.println( "inches to feet : "+ feet);
  System.out.println( "feet to inches : "+ incFeet);
  System.out.println("");
  
  //sqft to cent
  double cent = 5;
  double sqft = cent*435.6;
  double centSqft = 0.0023*cent;
  System.out.println("sqft to cent : "+sqft);
  System.out.println("cent to sqft : "+centSqft);
  System.out.println("");
  
  //grams to kgs
  double gram = 6;
  double kg = gram*1000;
  double gramToKg =1000/gram ;
  System.out.println("gram to kg : "+kg);
  System.out.println("kg to gram : "+gramToKg);
  System.out.println("");
  
  //rupees to dollar
   double rupees = 500;
   double dollarI =10;
   double dollar = rupees / 76.75;
   double dollars = dollarI*76.75;
   System.out.println("rupees to Dollars : "+dollar);
   System.out.println("Dollars to rupees : "+dollars);
   System.out.println("");
  
  // fahrenheit to celsius
  double fahre = 53 ;
  double celsius = 15;
  double celsiu = (fahre-32)*5/9;
  double fahren = ((celsius*9)/5)+32;
  System.out.println("fahrenheit to celsisus : "+celsiu);
  System.out.println("culsisus to fahrenheit : "+fahren);
  System.out.println("");
  
  
  //Use units kilometre, metre, feet, centimetres (cms)
  //Sample Input : 12,34,567
   System.out.println("Enter the input to km in centimetres : ");
  long kms = input.nextLong();
 double cms = kms/100000;
 System.out.println(km+"cm to kilometre is : "+cms);
   System.out.println("Enter the input to metre in centimetres : ");
  long m = input.nextLong();
 double cmsMetre = m/100;
 System.out.println(m+"cm to metre is : "+ cmsMetre);
   System.out.println("Enter the input to feet in centimetres : ");
  long foot = input.nextLong();
 double  cmToft = foot/30.48;
 System.out.println(foot+"cm to feet is : "+cmToft);
   System.out.println("Enter the input to  centimetres : ");
  long cm = input.nextLong();
  System.out.println(cm+"cms is to : "+cm);
  System.out.println(cms+ " Kilometers,"+cmsMetre+"metres,"+cmToft+"feets,"+cm+"cms.");
 
 System.out.println("");
 
  
  //Sample Input : 9876(meter,feet,cm).
   System.out.println("Enter the input to metre in centimetres : ");
  long mt = input.nextLong();
 double cmMet = mt/100;
  System.out.println(mt+"cm to metre is : "+ cmMet);
   System.out.println("Enter the input to feet in centimetres : ");
  long ft = input.nextLong();
 double cmToFt =ft /30.48;
 System.out.println(ft+ "cm to feet is : "+cmToFt);
  System.out.println("Enter the input to  centimetres : ");
  long cm1 = input.nextLong();
  System.out.println(cm1+"cms is to : "+cm1);
  System.out.println(cmMet+"metres,"+ft+"feets,"+cm1+"cms.");
   System.out.println("");
   
   
 //  the scanner close  
   input.close();
  }
}      