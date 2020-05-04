package cesar1;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	

	public static void main(String args[]) throws IOException {

		System.out.println("test 1: \n");
		 
		 //Input  $Diego Rodrigues Fraga
		 int n=21;
		 char vector[]=new char[25];
		 
		 // Input $User is not allowed
		 int n1=19;
		 char vector1[]=new char[25];
		 
		 
		 // Input $Diego Fraga 
		 int n2=11;
		 char vector2[]= new char[13];
		 
		 
		 
		 scan(vector2);
		 
		 replacing(vector2,n2);
		 
	 
	
	  
	}
	
	static void replacing(char vector[],int n) {
		 int j= n-1;
		 for(int i=vector.length-1;i>=0;i--)  {
			 if (vector[j]== ' ') {
				 vector[i] = '2';
				 vector[i-1] = '3';
				 vector[i-2] = '&';
				 j--;
				 i= i-2;
				 
			 }else {
				 vector[i]= vector[j];
				 j--;
				 
			 }
		 }
		 System.out.println("\nResult: \n\n");
		 for(int i=0;i<vector.length;i++) {
			 System.out.print(vector[i]); 
		 }
	}
	static void scan(char vector[]) {
		 Scanner scan=new Scanner(System.in); 
		 
		 String s = scan.nextLine();
		 
		 for(int i=0;i<s.length();i++)  {
			 vector[i]=s.charAt(i);  
		 }
		 System.out.println("Vector: ");
		 for(int i=0;i<s.length();i++) {
			 System.out.print(vector[i]); //Output of CharArray
		 }
		 
	}
	
}
