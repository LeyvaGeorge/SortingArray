import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
    /*
     * This method will sort through the array starting from the beggining and will find the min
     * value and swap it with the current element 'i' and will repeat the process until the end 
     * of the array is reached comapring the last to elements.
     */
    public static void selectionSort(Student[] stuArr) {
        // Traverse through all array elements
        for (int i = 0; i < stuArr.length -1; i++) {
            int minIndex = i;           // Find the minimum element in unsorted array
            for (int j = i +1; j < stuArr.length; j++) {
                // if stuArr[j] second name is less than stuArr[minIndex] second name, then update minIndex
                if (stuArr[j].getName().compareTo(stuArr[minIndex].getName()) < 0) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            Student temp = stuArr[minIndex];
            stuArr[minIndex] = stuArr[i];
            stuArr[i] = temp;
        }
    }
}
