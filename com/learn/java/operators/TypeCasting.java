public class TypeCasting{
 public static void main(String[] args){
 // Byte to int & Int to byte.
 byte a = 1;
 int b = (int)a;
 int c = 10;
 byte d = (byte)c;
 
 //Int to float & float to int.
float e = 2.91f;
int f = (int)e;
float g = (float)c;

//Int to long & long to int.
long h = 2489l;
int i =(int) h;
long j=(long)c;

//Float to double & double to float.
double k = 29.5678;
float l =(float) k;
double m =(double) e;

//Int to double & double to int.
double n =(double) c; 
int o = (int)k;

//Char to int & int to char
char p = 'a';
int q = (int)p;
char r =(char)c;

//Int to boolean & boolean to int.
boolean s= true;
//int t = (int)s;
//boolean u =(boolean)c; 

 //Char to string & string to char.
 String v ="nivetha";
 //char w =(char) v;
 //String x = (String)p;
 
 
 System.out.println("byte to int value = "+b );
 System.out.println("int to byte value = "+d);
 System.out.println("int to float value = "+g);
 System.out.println("float to int value = "+f);
 System.out.println("int to long value = "+i);
 System.out.println("long to int value = "+j);
 System.out.println("float to double value = "+m); 
 System.out.println("double to float value = "+l);
 System.out.println("int to double value = "+n);
 System.out.println("double to int value = "+o);
 System.out.println("char to int value = "+q);
 System.out.println("int to char value = "+r);
 //System.out.println("int to boolean value = "+u); 
 //System.out.println("boolean to int value = "+t);  
 //System.out.println("char to string value = "+x); 
 //System.out.println("String to char value = "+w); 
   }
  }
 
    