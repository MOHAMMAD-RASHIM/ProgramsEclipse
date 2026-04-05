package com.tap.oops.inheritance;
import java.util.*;

//Base class
class Course {
 private String courseName;
 private String courseCode;

 // Getters and Setters
 public String getCourseName() {
     return courseName;
 }

 public void setCourseName(String courseName) {
     this.courseName = courseName;
 }

 public String getCourseCode() {
     return courseCode;
 }

 public void setCourseCode(String courseCode) {
     this.courseCode = courseCode;
 }

 // Method to override
 public String getDetails() {
     return "Course Details: Course Name: " + courseName +
            ", Course Code: " + courseCode;
 }
}

//Subclass OnlineCourse
class OnlineCourse extends Course {
 private String platform;

 public String getPlatform() {
     return platform;
 }

 public void setPlatform(String platform) {
     this.platform = platform;
 }

 @Override
 public String getDetails() {
     return "Course Details: Course Name: " + getCourseName() +
            ", Course Code: " + getCourseCode() +
            ", Platform: " + platform;
 }
}

//Subclass OfflineCourse
class OfflineCourse extends Course {
 private String location;

 public String getLocation() {
     return location;
 }

 public void setLocation(String location) {
     this.location = location;
 }

 @Override
 public String getDetails() {
     return "Course Details: Course Name: " + getCourseName() +
            ", Course Code: " + getCourseCode() +
            ", Location: " + location;
 }
}

//Main class
public class CourseMain {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     String type = sc.nextLine().trim();
     String[] data = sc.nextLine().trim().split(",");

     if (type.equals("OnlineCourse")) {
         OnlineCourse oc = new OnlineCourse();
         oc.setCourseName(data[0].trim());
         oc.setCourseCode(data[1].trim());
         oc.setPlatform(data[2].trim());

         System.out.println(oc.getDetails());

     } else if (type.equals("OfflineCourse")) {
         OfflineCourse ofc = new OfflineCourse();
         ofc.setCourseName(data[0].trim());
         ofc.setCourseCode(data[1].trim());
         ofc.setLocation(data[2].trim());

         System.out.println(ofc.getDetails());
     }

     sc.close();
 }
}