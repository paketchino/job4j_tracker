package condition;

public class Max {

    public  static int max(int left, int right) {
        int max = 0;
        if (left > right) {
            max = left;
        } else {
            max = right;
        } if (left == right) {
            max = left;
        }
        return max;
    }
}
