package com.tap.sortedarrays;

import java.util.Scanner;

class LastRepeatingElement { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt(); 
        int[] arr = new int[n]; 
        
        for (int i = 0; i < arr.length; i++) { 
            arr[i] = scanner.nextInt(); 
        } 
        
        findLastRepeatingElement(arr); 
    } 

    static void findLastRepeatingElement(int[] arr) { 
        // Iterate from the back of the sorted array to find the last occurrence
        for (int i = arr.length - 1; i > 0; i--) { 
            // Since the array is sorted, duplicates are adjacent
            if (arr[i] == arr[i - 1]) { 
                System.out.println(arr[i]); 
                return; // Exit early as we found the last repeating element
            } 
        } 
        
        // If the loop finishes without returning, no duplicates exist
        System.out.println("None"); 
    }
}