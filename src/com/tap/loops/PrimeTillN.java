package com.tap.loops;
import java.util.Scanner;

class PrimeTillN {

    public static boolean isPrime(int num)
    {
        if(num<=1){
            return false;
        }
        for(int i=2;i*i<=num;i++){
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void firstNPrimes(int n,int m)
    {
        int count = 0;
        int currentNumber = m+1;
        while(count<n)
        {
            if(isPrime(currentNumber))
            {
                System.out.print(currentNumber+" ");
                count++;
            }
            currentNumber++;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Your code here
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        firstNPrimes(n,m);
        scanner.close();
    }
}