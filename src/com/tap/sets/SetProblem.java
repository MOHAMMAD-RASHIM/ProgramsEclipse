package com.tap.sets;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetProblem {
    public static LinkedHashSet<Integer> filterUniqueIntegers(int[] arr)
    {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        return set;
    }
    public static void main(String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scanner.nextInt();
        }
        LinkedHashSet<Integer> set = filterUniqueIntegers(arr);
        for(Integer value:set)
        {
            System.out.print(value+" ");
        }
        scanner.close();
    }
}