package Assgn1;

public class SecondLargest {
	    static int secondLargest(int[] input)
	    {
	        int firstLargest, secondLargest;
	       
	        if(input[0] > input[1])
	        {
	            firstLargest = input[0];
	            secondLargest = input[1];
	        }
	        else
	        {
	            firstLargest = input[1];
	            secondLargest = input[0];
	        }
	 
	        for (int i = 2; i < input.length; i++)
	        {
	            if(input[i] > firstLargest)
	            {
	                secondLargest = firstLargest;
	                firstLargest = input[i];
	            }
	            else if (input[i] < firstLargest && input[i] > secondLargest)
	            {
	                secondLargest = input[i];
	            }
	        }
	 
	        return secondLargest;
	    }
	 
	    
	public static void main(String[] args) {
		System.out.println("Second Largest Element is :- "+secondLargest(new int[] {46, 50, 28, 75, 72, 42}));
	}


}