public class main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(3, "Alice", "123 Main St");
        students[1] = new Student(1, "Bob", "456 Elm St");
        students[2] = new Student(5, "Charlie", "789 Oak St");
        students[3] = new Student(2, "David", "321 Maple St");
        students[4] = new Student(4, "Eve", "654 Pine St");


        //Section will print the names of the students before and after sort using Selection Sort.
        System.out.println("Before sorting by name:");
        for (Student student : students) {
            System.out.println(student.getName());
        }

        NameComparator.selectionSort(students);

        System.out.println("\nAfter sorting by name:");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
