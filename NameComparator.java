import java.util.Comparator;
import java.util.ArrayList;
public class NameComparator implements Comparator<Student> {
    /* 
     *This method will compare the names of two students and return a negative integer, zero,
     * or a positive integer as the first argument is less than, equal to, or greater than the second.
    */
   @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }

    /*
     * This method will sort through the array starting from the beggining and will find the min
     * value and swap it with the current element 'i' and will repeat the process until the end 
     * of the array is reached comapring the last to elements.
     */
    public static void selectionSort(ArrayList<Student> stuArr) {
        // Traverse through all array elements
        for (int i = 0; i < stuArr.size() - 1; i++) {
            int minIndex = i;           // Find the minimum element in unsorted array
            for (int j = i + 1; j < stuArr.size(); j++) {
                // if stuArr[j] second name is less than stuArr[minIndex] second name, then update minIndex
                if (stuArr.get(j).getName().compareTo(stuArr.get(minIndex).getName()) < 0) {
                    minIndex = j;
                }
                
            }
            // Swap the found minimum element with the first element
            Student temp = stuArr.get(minIndex);
            stuArr.set(minIndex, stuArr.get(i));
            stuArr.set(i, temp);
        }
    }
}
