public class BasicMath{
 public static void main(String[] args){
 //basic arithmetic operaters.
 int n = 1+5;
 int i = n*3;
 int v = i-2;
 int e = v/3;
 int t= -e;
 
 //basic arithmetic dobule.
 double mn = 1+6;
 double mi = mn*4;
 double mv = mi-3;
 double me = mv/4;
 double mt = -me;
 
 //modulus % operaters.
 int h = 85;
 double a = 85.5;
 
 //several assignment operaters.
 int x = 5;
 int y = 6;
 int z = 7;
 x += 5;
 y *= 3;
 z += x *y;
 z %= 4;
 
 //Increment and Decrement.
 int s = 8;
 int u = 7;
 int p = 9;
 int r = 6;
 int w = s++;
 int j = ++u;
 int o = --p;
 int q = r--;
 int b = s++ + ++s - p-- - --p;
 

 
  
 System.out.println("n = "+n);
 System.out.println("i = "+i);
 System.out.println("v = "+v);
 System.out.println("e = "+e);
 System.out.println("t = "+t);
 System.out.println("      ");
 
 System.out.println("mn = "+mn);
 System.out.println("mi = "+mi);
 System.out.println("mv = "+mv);
 System.out.println("me = "+me);
 System.out.println("mt = "+mt);
 System.out.println("      ");
 
 System.out.println("h modl 10 = "+h % 10);
 System.out.println("a modl 10 = "+a % 10);
 System.out.println("      ");
 

System.out.println("x ="+x);
System.out.println("y ="+y);
System.out.println("z ="+z);
System.out.println("      ");

System.out.println("w = "+ w++);
System.out.println("j = "+ ++j);
System.out.println("o = "+ o--);
System.out.println("q = "+ --q);
System.out.println("      ");
System.out.println("b = "+ b);
System.out.println("s = "+ s);
System.out.println("p = "+ p);


 }
}