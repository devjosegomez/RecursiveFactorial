package com.recursion.app;

/*
 * 	 Factorial !
     1! = 1 * 0! = 1
     2! = 2 * 1 = 2 * 1!
     3! = 3 * 2 * 1 = 3 * 2!
     4! = 4 * 3 * 2 * 1 = 4 * 3!
	 
	 Formula:
     n! = n *(n - 1)!
*/
public class RecursionApp {

    public static void main(String[] args) {
    	breakln("*** Factorial ***");
    	breakln("Classic way (Iterative):");
        System.out.println(iterativeFactorial(3));
        breakln("Recursive way:");
        System.out.println(recursiveFactorial(3));
    }
    

    public static int recursiveFactorial(int num) {

        if (num == 0) {
            return 1;
        }

        return num * recursiveFactorial(num - 1);

    }
    
    //Classic way (Iterative)
    public static int iterativeFactorial(int num) {

        if (num == 0) {
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;

    }
    
    public static void breakln(String m) {
    	System.out.println(m);
    }

}
