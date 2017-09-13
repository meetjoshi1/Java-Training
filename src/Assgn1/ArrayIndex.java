package Assgn1;

public class ArrayIndex {

	public static void main(String[] args) {
		int[] A= {2,1,7,5,9,0,5,3,4}; 
		int[] B= {4,9,1,5};
	    
		
        System.out.println("Index for the number are as under :- ");
        
        System.out.println("-----------------------------------");
        
        for(int i=0;i<B.length;i++)
        {
            for(int j=0;j<A.length;j++)
            {
	             if (B[i] == A[j])
	             {
	            	 System.out.println("Index of "+ B[i] + " is :- "+j);
	             }
	        }
         }
	}
}


