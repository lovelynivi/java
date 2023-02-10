import java.util.Scanner;
 public class IfElse {
  public static void main (String[] args){
  Scanner reader = new Scanner(System.in);
  int subjects[][]= new int [2][4];
   
  System.out.println("enter the mark of subject 1 : ");
    subjects[0][0] = reader.nextInt();
    
  System.out.println("enter the mark of subject 2 : ");
    subjects[0][1] = reader.nextInt();
    
  System.out.println("enter the mark of subject 3 : ");
   subjects[0][2] = reader.nextInt();
   
 System.out.println("enter the mark of subject 4 : ");
    subjects[0][3] = reader.nextInt();
   
   System.out.println("enter the mark of subject 5 : ");
    subjects[1][0] = reader.nextInt();
    
  System.out.println("enter the mark of subject 6 : ");
  subjects[1][1] = reader.nextInt();
    
  System.out.println("enter the mark of subject 7 : ");
   subjects[1][2] = reader.nextInt();
   
 System.out.println("enter the mark of subject 8 : ");
   subjects[1][3] = reader.nextInt();
   int totalG1 = (subjects[0][0] + subjects[0][1] + subjects[0][2] + subjects[0][3]);
   int totalG2 = (subjects[1][0] + subjects[1][1] + subjects[1][2] + subjects[1][3]);
	boolean check =(totalG1>=200 && totalG2>=200);
  boolean passInG1;
  boolean passInG2;
  
  if ((subjects[0][0]>=40 && subjects[0][1]>=40 && subjects[0][2]>=40 && subjects[0][3]>=40)){
    passInG1 = true;
  	//System.out.println("you are pass in group 1 ");
  }
  else {
    passInG1 = false;
   	//System.out.println("you are fail in group 1"); 
   }
  if ((subjects[1][0]>=40 && subjects[1][1]>=40 && subjects[1][2]>=40 && subjects[1][3]>=40)) {
	passInG2 = true;
   	//System.out.println("you are pass in group 2");
   }
  else{
    passInG2 = false;
   	//System.out.println("you are fail in group 2");
   }
   
   if (passInG1  &&  passInG2){
   		System.out.println("you are pass in both group ");
   } else if  (passInG1) {
   		System.out.println(" you passed only in G1");
   } else if (passInG2) {
   		System.out.println(" you passed only in G2");
   } else {
   		System.out.println("you are fail in both group ");
   }
   
   
   /*if ((subjects[0][0]>=40 && subjects[0][1]>=40 && subjects[0][2]>=40 && subjects[0][3]>=40) && (subjects[1][0]>=40 && subjects[1][1]>=40 && subjects[1][2]>=40 && subjects[1][3]>=40) ){
  System.out.println("you are pass in both group ");
  }
  else {
  System.out.println("you are fail in both group ");
  }*/
  
  
  
  
  
//  F && (T || F) && T && T -> F
  
  
  
  
  
   System.out.println(""); 
  
 reader.close ();   
  }
}