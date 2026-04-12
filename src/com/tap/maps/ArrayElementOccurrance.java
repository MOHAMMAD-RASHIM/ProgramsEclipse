package com.tap.maps;
import java.util.HashMap;
import java.util.*;
import java.util.Scanner;

public class ArrayElementOccurrance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        // Your code here
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++)
        {
            
            
            if(map.containsKey(arr[i]))
            {
                int count = map.get(arr[i]);
                map.put(arr[i],count+1);
            }
            else
            {
                map.put(arr[i],1);
            }
            
        }
        Set<Integer> keys = map.keySet();
        for(int key:keys)
        {
            System.out.print(key+":"+map.get(key)+" ");
        }
    }
}