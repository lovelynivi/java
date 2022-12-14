public class LimitCheck1{
 public static void main(String[] args){
 // assign a big value (exceeding the range) to the data type and note behaviour.
 // error occurs, note the error in program comments.
 
 //error: <identifier> expected
 int a = 2,147,483,6578;
 //error: <identifier> expected.
 long b =  9,223,372,036,854,775,8079l; 
 // error: floating-point number too large
 float c = 3.4e+0385f;
 //floating-point number too large
 double d = 1.8e+3085;
 byte e = 129;
 //error: <identifier> expected
 short f = 32,787;
 
 
  System.out.println("int value is = "+a); 
  System.out.println("long value is = "+b); 
  System.out.println("float value is = "+c); 
  System.out.println("double value is = "+d); 
  System.out.println("byte value is = "+e); 
  System.out.println("short value is = "+f); 
   }
  } 