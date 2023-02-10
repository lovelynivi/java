import java.util.Scanner;
public class GeoMetricalCalculations{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
//area of circle.
  float radius ;
  double pi =3.141;
 System.out.print("Enter the value of radius of circle : ");
  radius = input.nextFloat();
  double cArea =pi*(radius*radius);
 
 // area of rectangle.
 //don't give the negative numbers.
  float width ;
  System.out.print("Enter the value of width of rectangle : ");
  float height = input.nextFloat();
  System.out.print("Enter the value of hight of rectangle : ");
  width = input.nextFloat();
  double rArea =width*height;
  
// area of square.
  float length ;//length of said.
  System.out.print("Enter the value of length of said to square : "); 
  length = input.nextFloat();
  double sArea =length*length;


System.out.println("Area of the circle: "+ cArea);

System.out.println("      ");
System.out.println("Area of the rectangle: "+ rArea);

System.out.println("      ");
System.out.println("Area of the square: "+ sArea);

 //  the scanner close  
   input.close();
 }
}
