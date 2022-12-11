public class MDArray{
 public static void main(String[] args){
 // MultiDimensional Array.
   int MDArray [][] =new int[7][8];
   int A,B,C =0;
    
    for (A=0; A<7; A++){
		for (B=0; B<8; B++) {
    		MDArray [A][B] = C; 
     		C++ ;
 		}
     }

    for (A=0; A<7; A++){
       for (B=0; B<8; B++) {
         System.out.print(MDArray [A][B] + "  ");
        System.out.println() ;
      }
     }
   }
 }
