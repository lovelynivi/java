public class Array {
 public static void main(String[] args){
  // Demonstrate a one-dimensional array
  int Salary_monthy[];
  Salary_monthy = new int[12];
   Salary_monthy [0]= 3000;
   Salary_monthy [1]= 2000;
   Salary_monthy [2]= 3000;
   Salary_monthy [3]= 3100;
   Salary_monthy [4]= 3000;
   Salary_monthy [5]= 3100;
   Salary_monthy [6]= 3000;
   Salary_monthy [7]= 3100;
   Salary_monthy [8]= 3000;
   Salary_monthy [9]= 3100;
   Salary_monthy [10]= 3000;
   Salary_monthy [11]= 3100;
   long salary_monthy[] = {60000l,70000l,80000l,90000};
   // Average an array of values.
   float No []={10.5f,11.5f,12.5f,13.5f,14.5f};
   float Result =0;
   int A;
   for (A=0; A<3; A++)
   Result =Result +No[A];
   
   System.out.println("I got salary "+ Salary_monthy [4]+" in may month.");
   System.out.println("my january month salary is "+ Salary_monthy [0]);
   System.out.println("my march month salary is "+salary_monthy [2]);
   System.out.println("Average is "+ Result /3);
  }
}