import java.util.Comparator;
import java.util.ArrayList;

public class RollNoComparator implements Comparator<Student>{
    /*  
     * This method will compare the roll numbers of two students and return a negative integer, zero,
     * or a positive integer as the first argument is less than, equal to, or greater than the second.
    */
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getRollNo(), s2.getRollNo());
    }

    /*
     * This method will sort through the array using Merge Sort.
     * It will divide the array into two halves, sort them recursively and then merge the sorted halves.
    */
    public static void mergeSort(ArrayList<Student> stuArr) {
        if (stuArr.size() < 2) {
            return; // Base case: array is already sorted
        }
        int mid = stuArr.size() / 2;
        ArrayList<Student> left = new ArrayList<>(mid);
        ArrayList<Student> right = new ArrayList<>(stuArr.size() - mid);

        // Split the array into two halves
        System.arraycopy(stuArr, 0, left, 0, mid);
        System.arraycopy(stuArr, mid, right, 0, stuArr.size() - mid);

        // Recursively sort both halves
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves
        merge(stuArr, left, right);
    }

    public static void merge(ArrayList<Student> stuArr, ArrayList<Student> left, ArrayList<Student> right) {
        int leftPos = 0, rightPos = 0, mergePos = 0;    //Position for Left, Right and Merged array
        while (leftPos < left.size() && rightPos < right.size()) {
            if (left.get(leftPos).getRollNo() <= right.get(rightPos).getRollNo()) {
                stuArr.set(mergePos++, left.get(leftPos++));
            } else {
                stuArr.set(mergePos++, right.get(rightPos++));
            }
        }
        while (leftPos < left.size()) {
            stuArr.set(mergePos++, left.get(leftPos++));
        }
        while (rightPos < right.size()) {
            stuArr.set(mergePos++, right.get(rightPos++));
        }
    }
}
