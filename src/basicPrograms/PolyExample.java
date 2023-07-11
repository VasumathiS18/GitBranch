/*Create a class Person and create two private variables age and gender. 
 *  Create getters and setters for both variables.
 * call them in main method to initialize the variables and display the data.
 * */

package basicPrograms;

public class PolyExample {
private int age;
private String gender;
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public static void main(String[] args)
{
	PolyExample pe=new PolyExample();
	pe.setAge(55);
	pe.setGender("Female");
	System.out.println("the age of the person is "+pe.getAge());
	System.out.println("The gender of the person is "+pe.getGender());
}
}
