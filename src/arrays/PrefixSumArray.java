package arrays;

public class PrefixSumArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] pref = new int[a.length];
        pref[0] = a[0];
        for (int i = 1; i < a.length; i++) pref[i] = pref[i-1] + a[i];
        System.out.println("Prefix sums computed, last = " + pref[pref.length-1]);
    }
}
