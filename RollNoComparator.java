import java.util.Comparator;

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
    public static void mergeSort(Student[] stuArr) {
        if (stuArr.length < 2) {
            return; // Base case: array is already sorted
        }
        int mid = stuArr.length / 2;
        Student[] left = new Student[mid];
        Student[] right = new Student[stuArr.length - mid];

        // Split the array into two halves
        System.arraycopy(stuArr, 0, left, 0, mid);
        System.arraycopy(stuArr, mid, right, 0, stuArr.length - mid);

        // Recursively sort both halves
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves
        merge(stuArr, left, right);
    }

    public static void merge(Student[] stuArr, Student[] left, Student[] right) {
        int leftPos = 0, rightPos = 0, mergePos = 0;    //Position for Left, Right and Merged array
        while (leftPos < left.length && rightPos < right.length) {
            if (left[leftPos].getRollNo() <= right[rightPos].getRollNo()) {
                stuArr[mergePos++] = left[leftPos++];
            } else {
                stuArr[mergePos++] = right[rightPos++];
            }
        }
        while (leftPos < left.length) {
            stuArr[mergePos++] = left[leftPos++];
        }
        while (rightPos < right.length) {
            stuArr[mergePos++] = right[rightPos++];
        }
    }
}
