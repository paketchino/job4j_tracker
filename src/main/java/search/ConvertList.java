package search;

import java.util.LinkedList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new LinkedList<>();
        for (int[] row : list) {
            for (int cell : row) {
                rsl.add(cell);
            }

        }
            return rsl;
        }
    }
