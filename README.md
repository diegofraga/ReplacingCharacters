# ReplacingCharacters

1. Replacing characters in place:
Given an array of characters, write a method to replace all the spaces with “&32”.
You may assume that the array has sufficient slots at the end to hold the additional
characters, and that you are given the “true” length of the array. (Please perform this
operation in place with no other auxiliary structure).
Example:
Input: “User is not allowed
“, 19
Output: “User&32is&32not&32allowed”

Function T(n) = O(n)

	static void replacing(char vector[],int n) {
		 int j= n-1;                                 1
		 for(int i=vector.length-1;i>=0;i--)  {      n
			 if (vector[j]== ' ') {                    n
				 vector[i] = '2';                        n
				 vector[i-1] = '3';                      n
				 vector[i-2] = '&';                      n
				 j--;                                    n
				 i= i-2;                                 n
				 
			 }else {                                   n
				 vector[i]= vector[j];                   n
				 j--;                                    n
				 
			 }                
		 }                                           = 10n +1 
		 System.out.println("\nResult: \n\n");
		 for(int i=0;i<vector.length;i++) {
			 System.out.print(vector[i]); 
		 }
	}
