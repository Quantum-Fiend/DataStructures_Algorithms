package arrays;

public class DifferenceArray {
    public static void main(String[] args) {
        int[] a = {5,4,3,2,1};
        int[] diff = new int[a.length];
        diff[0] = a[0];
        for (int i = 1; i < a.length; i++) diff[i] = a[i] - a[i-1];
        System.out.println("Difference array first element = " + diff[0]);
    }
}
