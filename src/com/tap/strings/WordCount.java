package com.tap.strings;
import java.util.Scanner;

public class WordCount{
	
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int res = countWords(s);
		System.out.println(res);
		scan.close();
	}

    public static int countWords(String s)  {
        int count = 0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
            {
                count++;
            }
        }
        return s.charAt(0)!=' '?count+1:count;

	}
}
