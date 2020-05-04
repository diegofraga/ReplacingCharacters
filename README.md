# ReplacingCharacters

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
