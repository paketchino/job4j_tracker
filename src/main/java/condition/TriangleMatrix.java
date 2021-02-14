package condition;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int num = 1;
        int[][] triangle = new int[count][];
            for (int i = 0; i < count; i++) {
                    triangle[i] = new int[i + 1];
                for (int j = 0; j <= i; j++) {
                    triangle[i][j] = num;
                    num++;
                }

                }
            return triangle;
        }
    }

