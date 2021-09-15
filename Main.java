import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       for(int i=0; i<t; i++) {
    	   int p = sc.nextInt();
    	   if(p%4==0) System.out.println("North");
    	   else if(p%4==1) System.out.println("East");
    	   else if(p%4==2) System.out.println("South");
    	   else if(p%4==3) System.out.println("West");
       }
	}
}
