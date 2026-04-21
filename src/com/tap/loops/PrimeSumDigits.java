package com.tap.loops;
import java.util.Scanner;

class PrimeSumDigits {
    public static boolean isPrime(int num)
    {
        if (num<=1) 
            return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primeSumDigits(int n){
        int sum = 0;
        while(n!=0){
            int lastDigit = n%10;
            sum+=lastDigit;
            n/=10;
        }
        if(isPrime(sum)){
            System.out.print("Prime");
        }else{
            System.out.print("Not Prime");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        primeSumDigits(n);
        scanner.close();
    }
}