/********************************************************************************
 * This file is part of the project topic: 				     				    *
 * Project to check for a string of the form wwR 							    *
 *																				*	
 * Application:																    *
 * 	1) Compiler Design															*  
 *	2) String matching															*
 *	3) Used in DNA Marking														*
 ********************************************************************************/

/**
* @file Main.java
* @author Nityam
* @date 10 March,2020
* @bug No bugs
*/

package com.company;

import java.util.*;// Importing the necessary packages

public class Main {	// Declaring  a class the - Main class


    private int top; // declaring the variables
	int r=1;	// declaring the flag variable
    public int f1(int arr[],String s1,int j)
    {					// function used to pop and simultaneously check for centre of the string 
        top=j-1;
        try {
            for (int i = j; i < s1.length(); i++) {	// check for palindrome
                if (arr[top] == (s1.charAt(i) - '0')) {
                    top--;
                }
            }
            if (top == -1)
                return 1;
        }		// Handle Array Out oF bounds( if possible)
        catch(Exception e)
        {
            return 0;
        }

        return 0;
    }
    public void f(int arr[],String s1)
    {					// Function to push characters onto the stack
        for(int j=1;j<s1.length();j++)
        {
            if(arr[j-1]==(s1.charAt(j)-'0'))
            {
                int l = f1(arr,s1,j);	// Calling f1 to check if it has reached the centre of the string 
                if(l==1)
                {
		    r=0;
                    return;
                }

            }

            arr[j]=(int)(s1.charAt(j)-'0');
        }
    }	

    public static void main(String[] args) {
	    System.out.println("Enter the string of any character set to be checked for wwR form\n");
            
        while(true) {
            Main m = new Main();  // Creating an object of this class
            m.top = -1; 	// Initializing variables
            int arr[] = new int[20];
            Scanner sc = new Scanner(System.in);
            String s1 = sc.next();
            int d = s1.charAt(0) - '0';
            arr[0] = d;
            m.f(arr, s1);	// r becomes zero if it is a plaindrome
		if(m.r==0)
		{
			System.out.println("The given pushdown automata is of the form wwR"); // Displaying appropriate output
		}
		else
		{
			System.out.println("The given pushdown automata is not of the form wwR");
		}
		break;
        }// End of while
    }// End of main Function
}// End of main class
