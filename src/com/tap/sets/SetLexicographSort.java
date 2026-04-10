package com.tap.sets;
import java.util.*;

public class SetLexicographSort {
    public static int countWord(String str)
    {
        int count = 0;
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==',')
            {
                count++;
            }
        }
        return count+1;
    }
    public static String[] split(String str)
    {
        int wordCount = countWord(str);
        String[] arr = new String[wordCount];
        String t="";
        int j=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=',')
            {
                t+=str.charAt(i);
            }
            else if(t.length()>0)
            {
                arr[j] = t;
                j++;
                t="";
            }
        }
        arr[j] = t;
        return arr;
    }
    public static void sortLexicographically(String[] arr)
    {
        TreeSet<String> set = new TreeSet<String>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        for(String url:set)
        {
            System.out.println(url);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] urls = split(input);
        sortLexicographically(urls);
    
    }
}


/*
 * public static String[] split(String str)
{
    ArrayList<String> list = new ArrayList<>();
    StringBuilder t = new StringBuilder();

    for(int i = 0; i < str.length(); i++)
    {
        if(str.charAt(i) != ',')
        {
            t.append(str.charAt(i));
        }
        else
        {
            if(t.length() > 0)
            {
                list.add(t.toString());
                t.setLength(0);
            }
        }
    }

    if(t.length() > 0)
    {
        list.add(t.toString());
    }

    return list.toArray(new String[0]);
}
 */
