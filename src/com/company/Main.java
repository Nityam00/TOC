package com.company;

import java.util.*;

public class Main {


    private int top;
    public int f1(int arr[],String s1,int j)
    {
        top=j-1;
        System.out.println("Top of stack is "+ arr[top] +" Yo is "+ s1.charAt(top));
        try {
            for (int i = j; i < s1.length(); i++) {
                if (arr[top] == (s1.charAt(i) - '0')) {
                    System.out.println("I match");
                    top--;
                }
            }
            System.out.println("Value of top is " + top);
            if (top == -1)
                return 1;
        }
        catch(Exception e)
        {
            return 0;
        }

        return 0;
    }
    public void f(int arr[],String s1)
    {
        for(int j=1;j<s1.length();j++)
        {
            if(arr[j-1]==(s1.charAt(j)-'0'))
            {
                int l = f1(arr,s1,j);
                if(l==1)
                {
                    System.out.println("Yo");
                    return;
                }

            }

            arr[j]=(int)(s1.charAt(j)-'0');

            System.out.println("Contents of stack\n");
            for(int k = 0;k<=j;k++)
            {
                System.out.println(arr[k]);
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
        while(true) {
            Main m = new Main();
            m.top = -1;
            int arr[] = new int[20];
            System.out.println("Enter the string of any character set to be checked for wwR form\n");
            Scanner sc = new Scanner(System.in);
            String s1 = sc.next();
            int d = s1.charAt(0) - '0';
            arr[0] = d;
            m.f(arr, s1);
        }
    }
}
