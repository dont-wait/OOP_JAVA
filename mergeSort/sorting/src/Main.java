import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2,4, 6, 8, 10};
        int[] newArray = merge(a, b);
        for (int i = 0; i < newArray.length; i++)
            System.out.print(newArray[i] + " ");
    }
        public static int[] merge(int[] a1, int[] a2) {

            int n = a1.length + a2.length;
            int[] result = new int[n];

            int i = 0, i1 = 0, i2 = 0;
            while (i < n) {
                if (i1 < a1.length && i2 < a2.length) {//a1 va a2 khac rong
                    if (a1[i1] <= a2[i2]) {//a1 nho hon
                        result[i] = a1[i1];
                        i++;
                        i1++;
                    } else {//a2 nho hon
                        result[i] = a2[i2];
                        i++;
                        i2++;
                    }
                } else { // a1 or a2 rong~
                    if (i1 < a1.length) { //a1 ok
                        result[i] = a1[i1];
                        i++; i1++;

                    } else { //a2 ok
                        result[i] = a2[i2];
                        i++; i2++;
                    }
                }
            }
            return result;
        }
        public static int[] mergeSort(int[] a, int L, int R) {
            //THDB DKD
            if (L > R)
                return new int[0];
            if (L == R) {
                int[] singleElement = {a[L]};
                return singleElement;
            }


            //chia ra
            System.out.println("Chia: " + L + " - " + R);
            int k = (L + R) / 2;
            int[] a1 = mergeSort(a, L, k);
            int[] a2 = mergeSort(a, k + 1, R);

            //tron vao: a2 va a1 la cac mang da duoc sap xep
            //int[] result = merge(a1, a2); return result;

            int[] result = merge(a1, a2);
            System.out.println("Ket qua merge: " + Arrays.toString(result));
            return result;
    }
//        public static int[] sortArray(int[] nums) {
//
//            return mergeSort(nums, 0, nums.length);
//        }

}