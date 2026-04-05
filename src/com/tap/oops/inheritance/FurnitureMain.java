package com.tap.oops.inheritance;
import java.util.*;

//Base class
class Furniture {
 private String material;
 private String price;

 // Getters and Setters
 public String getMaterial() {
     return material;
 }

 public void setMaterial(String material) {
     this.material = material;
 }

 public String getPrice() {
     return price;
 }

 public void setPrice(String price) {
     this.price = price;
 }

 // Method to override
 public String getInfo() {
     return "Furniture Details: Material: " + material +
            ", Price: " + price;
 }
}

//Subclass Chair
class Chair extends Furniture {
 private String type;

 public String getType() {
     return type;
 }

 public void setType(String type) {
     this.type = type;
 }

 @Override
 public String getInfo() {
     return "Furniture Details: Material: " + getMaterial() +
            ", Price: " + getPrice() +
            ", Type: " + type;
 }
}

//Subclass Table
class Table extends Furniture {
 private String shape;

 public String getShape() {
     return shape;
 }

 public void setShape(String shape) {
     this.shape = shape;
 }

 @Override
 public String getInfo() {
     return "Furniture Details: Material: " + getMaterial() +
            ", Price: " + getPrice() +
            ", Shape: " + shape;
 }
}

//Main class
public class FurnitureMain {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     String type = sc.nextLine().trim();
     String[] data = sc.nextLine().trim().split(",");

     if (type.equalsIgnoreCase("Chair")) {
         Chair ch = new Chair();
         ch.setMaterial(data[0].trim());
         ch.setPrice(data[1].trim());
         ch.setType(data[2].trim());

         System.out.println(ch.getInfo());

     } else if (type.equals("Table")) {
         Table tb = new Table();
         tb.setMaterial(data[0].trim());
         tb.setPrice(data[1].trim());
         tb.setShape(data[2].trim());

         System.out.println(tb.getInfo());
     }

     sc.close();
 }
}