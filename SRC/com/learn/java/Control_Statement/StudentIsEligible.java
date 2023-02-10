import java.util.Scanner;
 public class StudentIsEligible {
  public static void main (String[] args){
  Scanner reader = new Scanner(System.in);
  int subjects[][]= new int [1][4];
  
  /** Read Inputs **/
  System.out.println("enter the group Name of (MBBS/BE) : ");
    String group = reader.nextLine();
    
  System.out.println("Enter the mark of subject 1 : ");
    subjects[0][0] = reader.nextInt();
    
  System.out.println("Enter the mark of subject 2 : ");
    subjects[0][1] = reader.nextInt();
    
  System.out.println("Enter the mark of subject 3 : ");
   subjects[0][2] = reader.nextInt();
   
  System.out.println("Enter the mark of subject 4 : ");
    subjects[0][3] = reader.nextInt();
    
  System.out.println("Enter the cut-off mark for BE : ");
     int beCutOff = reader.nextInt();
     
  System.out.println("Enter the cut-off mark for MBBS : ");
     int mbbsCutOff = reader.nextInt();
    
    /** Business Logic **/
   int  mbbsCutOffActual = (subjects[0][0] + subjects[0][1] + subjects[0][2] );
    int  beCutOffActual = mbbsCutOffActual + subjects[0][3];
     System.out.println("total mark is be 	"+beCutOffActual+ ".");
     System.out.println("total mark is mbbs "+ mbbsCutOffActual+ "."); 

    boolean check1 = (mbbsCutOffActual>=mbbsCutOff );
    boolean check2 = (beCutOffActual>=beCutOff );
   System.out.println("print the cut-offf mark is eligible for MBBS "+check1+ ".");
   System.out.println("print the cut-offf mark is eligible for BE "+check2+ ".");
    
    if("MBBS".equals(group.toUpperCase())) {
      System.out.println("your goroup is  MBBS .");
       if ((subjects[0][0]>=40 && subjects[0][1]>=40 && subjects[0][2]>=40)&&(check2)){
          System.out.println("you are eligible for MBBS .");
         }else{
          System.out.println("you are not eligible for MBBS .");
          }
    }else if("be".equals(group.toLowerCase())) {
      System.out.println("your group is  BE .");
        if ((subjects[0][0]>=40 && subjects[0][1]>=40 && subjects[0][2]>=40 && subjects[0][3]>=40)&&(check2)){
         System.out.println("you are eligible for BE .");
       }
      else{
         System.out.println("you are not eligible for BE .");
       }
    }else {
      System.out.println("your goroup is not MBBS/BE .");
    }
   
   
   /** boolean check1 = (mbbsCutOffActual>=mbbsCutOff );
    boolean check2 = (beCutOffActual>=beCutOff );
    
     if ((subjects[0][0]>=40 && subjects[0][1]>=40 && subjects[0][2]>=40 && subjects[0][3]>=40)&&(check1)){
         System.out.println("you are eligible for BE .");
       }
      else{
         System.out.println("you are not eligible for BE .");
       }
   

     if ((subjects[0][0]>=40 && subjects[0][1]>=40 && subjects[0][2]>=40)&&(check2)){
       System.out.println("you are eligible for MBBS .");
     }
     else{
       System.out.println("you are not eligible for MBBS .");
     }**/
    
    
    

    
   }
  } 