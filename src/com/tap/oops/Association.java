package com.tap.oops;
class Heart // composite class 
{
	private int weight;
	private int bpm;
	
	public Heart() {
		super();
	}

	public Heart(int weight, int bpm) {
		super();
		this.weight = weight;
		this.bpm = bpm;
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getBpm() {
		return bpm;
	}
	public void setBpm(int bpm) {
		this.bpm = bpm;
	}
	
}

class Brain // composite class
{
	private int weight;
	private String color;
	public Brain() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Brain(int weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}

class Bike // aggregate class
{
	private String brand;
	private int mileage;
	public Bike(String brand, int mileage) {
		super();
		this.brand = brand;
		this.mileage = mileage;
	}
	public Bike() {
		super();
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
}

class Book // aggregate class
{
	private String name;
	private String author;
	
	public Book()
	{
		super();
	}
	public Book(String name, String author)
	{
		this.name  = name;
		this.author = author;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public String getAuthor()
	{
		return author;
	}
}

class Student // primary class
{
	Heart h = new Heart(5,72);
	Brain b = new Brain(5,"Red");	
	
	public void hasABike(Bike bike)
	{
		System.out.println(bike.getMileage());
		System.out.println(bike.getBrand());
	}
	
	public void hasABook(Book book)
	{
		System.out.println(book.getAuthor());
		System.out.println(book.getName());
	}
}
public class Association {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		Bike bi = new Bike();
		Book bo = new Book();
		
	
		System.out.println(s.h.getBpm());
		System.out.println(s.h.getWeight());
		
		System.out.println(s.b.getColor());
		System.out.println(s.b.getWeight());
		
		
		bi.setMileage(10);
		bi.setBrand("Honda");
		bo.setAuthor("Rashim");
		bo.setName("Machine Learning");
		
		s = null;
//		s.hasABike(bi); java.lang.NullPointerException
//		s.hasABook(bo);  java.lang.NullPointerException
		
		System.out.println(bi.getBrand());
		
		
		

	}

}
