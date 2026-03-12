package arrays;

//? Problem = 1 [DONE]
//? Find The Largest in the Array
public class ArrayBasics {

    public static void main(String[] args) {
        int[] array = {2, 3, 1, 9, 6, 8, 15, 4};
        int findLargest = array[0];

        for (int i : array) {
            if (i > findLargest) {
                findLargest = i;
            }
        }
        System.out.println(findLargest);
    }
}