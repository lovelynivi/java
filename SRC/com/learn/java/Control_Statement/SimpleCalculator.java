import java.util.Scanner;
 public class SimpleCalculator {
  public static void main (String[] args){
  Scanner reader = new Scanner(System.in);
  System.out.println("enter the number 1 : ");
    double num1 = reader.nextDouble();
    
  System.out.println("enter the number 2 : ");
    double num2 = reader.nextDouble();
  
    System.out.println("enter the operator : ");
    String operator = reader.next();
  
  if (operator.equals("+")){
  System.out.println(num1+" + "+num2+" = ; "+(num1+num2));
  }
  else if (operator.equals("-")){
  System.out.println(num1+" - "+num2+" = ; "+(num1-num2));
  }
  else if (operator.equals("*")){
  System.out.println(num1+" * "+num2+" = ; "+(num1*num2));
  }
   else if  (operator.equals("/")){
  System.out.println(num1+" / "+num2+" = ; "+(num1/num2));
  }
   else if  (operator.equals("%")) {
  System.out.println(num1+" % "+num2+" = ; "+(num1%num2));
  }
  else {
  System.out.println("Invalid output .");
  }
  
  
  
  
  
  reader.close ();    
  }
}

/*String a = "5";
5==5
a==5
a==b

data types
byte
short
int
long

float
double

char
String

boolean

5
5.5
'+'
"abc"
true
false



int a123 = 5;

I

Input 1 - +, -, *, /, % - 
Input 2 - 24,-infinity to +infinity - double
Input 2 - 56,-infinity to +infinity - double

char operator;
double operand1;
double operand2;

operand1 == 
if(operator == '+') {

}

if(operator.equals("+") {

}*/

