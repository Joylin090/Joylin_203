package journal;
//Joylin D'Cunha RollNo: 203

public class Student {
    
	 private String name;
	    private int age;
	    private String address;

	    // Constructor with default values
	    public Student() {
	        this.name = "Unknown";
	        this.age = 0;
	        this.address = "Not available";
	    }

	    // Method to set name and age
	    public void setInfo(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Method to set name, age, and address
	    public void setInfo(String name, int age, String address) {
	        this.name = name;
	        this.age = age;
	        this.address = address;
	    }

	    // Method to get student information
	    public void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Address: " + address);
	        System.out.println();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an array of Student objects
        Student[] students = new Student[3];

        // Initializing objects and setting information
        students[0] = new Student();
        students[0].setInfo("Carol", 20, "Margao");

        students[1] = new Student();
        students[1].setInfo("Maralyne", 22);

        students[2] = new Student();
        students[2].setInfo("Shevon", 21, "Vasco");

        // Displaying information of all students
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + " details:");
            students[i].displayInfo();
        }
    }

}
