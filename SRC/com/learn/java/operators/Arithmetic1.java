public class Arithmetic1{
 public static void main(String[] args){
  int e = -5;
  int f = 8;
  int g = 6;
  int h = 55;
  int i = 9;
  int j = -3;
  int k = 5;
  
  double a = e+f*g;
  double b = (h+i)%i;
  double c = 20+j*k/f;
  double d = k+15/3*2-f%3; 
    
  double d2 = (((double)k+15)/(3*2)- f%3); 
  double d3 = (k+15)/6;
  //20/6-8%3
  //3.33-8%3
  //3.33-2
  //1.33
  System.out.println("a value is = "+ a);
  System.out.println("b value is = "+ b);
  System.out.println("c value is = "+ c);
  System.out.println("d value is = "+ d);
  System.out.println("d2 value is = "+ d2);
    System.out.println("d3 value is = "+ d3);
  }
 } 