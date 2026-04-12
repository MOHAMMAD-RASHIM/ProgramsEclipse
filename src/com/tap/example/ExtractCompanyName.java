package com.tap.example;
import java.util.Scanner;
import java.util.TreeSet;

public class ExtractCompanyName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the entire line of URLs
        if (!scanner.hasNextLine()) return;
        String input = scanner.nextLine();
        
        // Split the input by commas
        String[] urls = input.split(",");
        
        // TreeSet automatically handles uniqueness and alphabetical sorting
        TreeSet<String> companyNames = new TreeSet<>();
        
        for (String url : urls) {
            String company = extractCompanyName(url);
            if (company != null) {
                companyNames.add(company);
            }
        }
        
        // Print each unique company name on a new line
        for (String name : companyNames) {
            System.out.println(name);
        }
        scanner.close();
    }
    
    /**
     * Extracts the company name from a standard URL format.
     * Example: "https://www.google.com" -> "google"
     */
    public static String extractCompanyName(String url) {
        // Remove the protocol (http:// or https://)
        String cleanedUrl = url.replaceFirst("https?://", "");
        
        // Remove "www." if it exists
        if (cleanedUrl.startsWith("www.")) {
            cleanedUrl = cleanedUrl.substring(4);
        }
        
        // Find the index of the first dot after the company name (e.g., .com)
        int dotIndex = cleanedUrl.indexOf('.');
        
        if (dotIndex != -1) {
            return cleanedUrl.substring(0, dotIndex);
        }
        
        return null;
    }
}