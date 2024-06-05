package Assgn2;

class Student2 {
    private int age;

    // Method to set the age of the student
    public void getData(int age) {
        this.age = age;
    }

    // Method to display the age of the student
    public void printData() {
        System.out.println("Age is: " + age);
    }

    public static void main(String[] args) {
        // Creating objects of the Student2 class
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();

        // Setting data for the first student using getData() method
        s1.getData(22);

        // Setting data for the second student using getData() method
        s2.getData(25);

        // Displaying data for the first student using printData() method
        System.out.println("Data for Student 1:");
        s1.printData();

        // Displaying data for the second student using printData() method
        System.out.println("\nData for Student 2:");
        s2.printData();
    }
}
