package condition;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[] result = new int[n];
        result[0] = a;
        result[1] = b;
        int temp = a + b;
        for (int i = 2; i < n; i++) {
            result[i] = temp;
            temp = temp + result[i];
        }
        return result;
    }
}
