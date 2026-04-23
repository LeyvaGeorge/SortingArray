import java.util.ArrayList;
public class main {
    public static void main(String [] args) {
        ArrayList<Student> studentList = new ArrayList<Student>();
        
        studentList.add(new Student(456, "George", "123 Main St"));
        studentList.add(new Student(369, "Ivy", "456 Elm St"));
        studentList.add(new Student(10, "Cein", "789 Oak St"));
        studentList.add(new Student(49, "Raider", "321 Maple St"));
        studentList.add(new Student(66, "Cidious", "654 Pine St"));
        studentList.add(new Student(25, "Quatro", "987 Cedar St"));
        studentList.add(new Student(335, "Valerie", "111 Birch St"));
        studentList.add(new Student(200, "Eve", "222 Spruce St"));
        studentList.add(new Student(1010, "Bob", "333 Willow St"));
        studentList.add(new Student(10, "Grace", "444 Aspen St"));


        //Section will print the names of the students before and after sort using Selection Sort.
        System.out.println("Before sorting:");
        for (Student student : studentList) {
            System.out.print("No: " + student.getRollNo() + ", Name: " + student.getName() + ", Address: " + student.getAddress());
            System.out.println();}

        NameComparator.selectionSort(studentList);

        System.out.println("\nSorting by name:");
        for (Student student : studentList) {
            System.out.print("No: " + student.getRollNo() + ", Name: " + student.getName() + ", Address: " + student.getAddress());
            System.out.println();
        }

        //Section will print the roll numbers of the students before and after using Merge Sort.
        System.out.println("\nSorting by roll number:");
        RollNoComparator.mergeSort(studentList);
        for (Student student : studentList) {
            System.out.print("No: " + student.getRollNo() + ", Name: " + student.getName() + ", Address: " + student.getAddress());
            System.out.println();
        }
    }
}
