package com.tap.maps;
import java.util.HashMap;
import java.util.*;
import java.util.Scanner;

public class CharOccurrenceCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Your code here
        String str = scanner.nextLine().toLowerCase();
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch!=' ')
            {
                if(map.containsKey(ch))
                {
                    int count = map.get(ch);
                    map.put(ch,count+1);
                }
                else
                {
                    map.put(ch,1);
                }
            }
        }
        Set<Character> keys = map.keySet();
        for(char key:keys)
        {
            System.out.print(key+":"+map.get(key)+" ");
        }
    }
}