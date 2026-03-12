package arrays;

public class CircularArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int n = a.length;
        int idx = 0;
        for (int i = 0; i < 8; i++) {
            System.out.print(a[idx] + " ");
            idx = (idx + 1) % n;
        }
        System.out.println();
    }
}
