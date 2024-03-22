package journal;

public class Person {
	String Name;
	int Age;
	//Joylin D'Cunha RollNo: 203
	public Person(String Name,int Age) {
		this.Name= Name;
		this.Age= Age;
	}
	public String getName() {
		return Name;
	}
	public int getAge() {
		return Age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Main.java
		
	   Person person1 = new Person("Joylin", 20);
	   Person person2 = new Person("Noela", 20);
       System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
       System.out.println(person2.getName() + " is " + person2.getAge() + " years old.\n");
		    


	}


}