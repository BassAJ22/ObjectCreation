package practice;

public class CounterTest2 {
	/*A class is a blueprint for an object
	 * the instance variable (or fields) are the attributes of the object
	 * the methods are the actions/behaviors we want our object to do
	 */
	private int count;
	
	public CounterTest2() {//this is the constructor signature/ header
		count =0;
}
	/*
	 * 1. visibility
	 * 2. return type (void, int, double, boolean, string, etc...)
	 * 3. method name (with or without parameters
	 * 4. method body
	 */
	public void click() {// method signature
		System.out.println("The dice were rolled.")
		count = count +1;
}
	public int getCOunt() {// a method that returns an integer value count
		return count;
	}
	public void reset() {
		count=0;
	}
	
	public void countSatus() {
		System.out.println("The value of the dice is currently"+count+".");
	}
}
