package journal;
//Joylin D'Cunha RollNo: 203

class Teachers {
    protected String type;

    // Constructor for Teachers class
    public Teachers() {
    }

    // Method to indicate teaching
    public void teaches() {
        System.out.println("The teacher is teaching.");
    }
}

// TeacherTeaches class as a separate class
class TeacherTeaches extends Teachers {
    private String name;

    // Method to specify the subject being taught
    public void subjects(String subject) {
        System.out.println("The teacher " + name + " is teaching " + subject + ".");
    }

    // Setter for teacher's name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for teacher's name
    public String getName() {
        return name;
    }
}

public class TeacherMain {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Instantiating TeacherTeaches class
        TeacherTeaches teacher = new TeacherTeaches();

        System.out.print("Enter the teacher's name: ");
        String name = scanner.nextLine();
        teacher.setName(name);

        System.out.print("Enter the subject the teacher is teaching: ");
        String subject = scanner.nextLine();
        teacher.subjects(subject);

        scanner.close();
    }
}
