public class LimitCheck{
 public static void main(String[] args){
 //total,average and percentage of the student marks. 
 int subject[][]=new int[6][2];
 
 subject[0][1]= 125;
 subject[1][1]= 120;
 subject[2][1]= 110;
 subject[3][1]= 115;
 subject[4][1]= 130;
 subject[5][1]= 145;
   
 //simple interest and compound interest.
   double principal =1000.0;
   double rate = 8;
   double time = 2;
   double simpleInterest = (principal*time*rate)/100; 
   
   int number = 2;
   double compound = principal*((1 + rate/100)*(time * number))- principal;
   
 //Find the square, cube values for the given number.
   int num =12;
   
 //circumference, perimeter of the dimensions (circle, square, rectangle.. etc)  
   //rectangle.
   float length,width,perimeter;
   length = 10;
   width = 14;
   perimeter = 2*(length+width);
   //circle.
   int r = 8;
   double pi =3.141;
   double cperimeter = 2*pi*r;
   
   //distance and average speed then find the duration to reach the destination.
     float time1,distance,speed;
      time1 = 2;//(hr)
      speed = 120;//(km)
      distance =300;//(km)
      double aSpeed = distance/time1;
      double aDistance = speed*time1;
      double aTime = distance/speed; 
   
   
   
   System.out.println("Subject 3 mark is"+ subject[2][1]);
   System.out.println("Simple Interest: "+ simpleInterest);
   System.out.println("Compound Interest: "+ compound);
   System.out.println("Square of "+ num + "is: "+(num* 12));
   System.out.println("Cube of "+ num + "is: "+(num*12*12));
   System.out.println("Perimeter of rectangle is = "+perimeter);
   System.out.println("Perimeter of circle is = "+perimeter);
   System.out.println("The average speed is = "+aSpeed);
   System.out.println("The average distance is = "+aDistance);
   System.out.println("The average time is = "+aTime);
   //System.out.println("");         
   }
  }