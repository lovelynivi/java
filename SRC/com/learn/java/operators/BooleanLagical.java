public class BooleanLagical{
 public static void main(String[] args){
	//var varName = (condition) ? what to do if condition is true : what to do if condition is false
	// double biggest = (a > b) || (b < c) ? a : b
	// boolean result = (a == b) && (a>b) 
	double val1 = 5;
	double val2 = 10;
  	boolean result = myFun(val1,val2);	// Function call
  	System.out.println("Function gave a result of " + result);
  }
  
  public static boolean myFun(double a, double b) {	// Function Definition
  	boolean result = a > b ? true : false;
  	//int continueLoop = a;
  	return result;
  }
}
 
 
 