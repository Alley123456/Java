interface Ia {
    int max(int[] a);
}

interface Ib {
    int min(int[] a);
}

class Test2 implements Ia, Ib {
    @Override
    public int max(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    @Override
    public int min(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }
}

public class Score {
    public static void main(String[] args) {
        int[] score = { 88, 89, 82, 90, 98 };
        Test2 t = new Test2();
        System.out.println("Max score is" + t.max(score));
        System.out.println("Min score is" + t.min(score));
    }

}