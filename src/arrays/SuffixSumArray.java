package arrays;

public class SuffixSumArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] suf = new int[a.length];
        suf[a.length-1] = a[a.length-1];
        for (int i = a.length-2; i >= 0; i--) suf[i] = suf[i+1] + a[i];
        System.out.println("Suffix sums computed, first = " + suf[0]);
    }
}
