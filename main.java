public class main {
    public static void main(String [] args) {
        Student[] students = new Student[10];
        students[0] = new Student(456, "George", "123 Main St");
        students[1] = new Student(369, "Ivy", "456 Elm St");
        students[2] = new Student(10, "Cein", "789 Oak St");
        students[3] = new Student(49, "Raider", "321 Maple St");
        students[4] = new Student(66, "Cidious", "654 Pine St");
        students[5] = new Student(25, "Quatro", "987 Cedar St");
        students[6] = new Student(335, "Valerie", "111 Birch St");
        students[7] = new Student(200, "Eve", "222 Spruce St");
        students[8] = new Student(1010, "Bob", "333 Willow St");
        students[9] = new Student(10, "Grace", "444 Aspen St");


        //Section will print the names of the students before and after sort using Selection Sort.
        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.print("No: " + student.getRollNo() + ", Name: " + student.getName() + ", Address: " + student.getAddress());
            System.out.println();}

        NameComparator.selectionSort(students);

        System.out.println("\nSorting by name:");
        for (Student student : students) {
            System.out.print("No: " + student.getRollNo() + ", Name: " + student.getName() + ", Address: " + student.getAddress());
            System.out.println();
        }

        //Section will print the roll numbers of the students before and after using Merge Sort.
        System.out.println("\nSorting by roll number:");
        RollNoComparator.mergeSort(students);
        for (Student student : students) {
            System.out.print("No: " + student.getRollNo() + ", Name: " + student.getName() + ", Address: " + student.getAddress());
            System.out.println();
        }
    }
}
