import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class MySort {

    private final List<Integer> input;

    public MySort(List<Integer> input) {
        this.input = input;
    }


    public List<Integer> sort() {
        List<Integer> result = new ArrayList<>();
        int temp;
        for (int i = 0; i < input.size(); i++) {
            for (int j = i + 1; j < input.size(); j++) {
                if (input.get(i) > input.get(j)) {
                    temp = input.get(i);
                    input.set(i, input.get(j));
                    input.set(j, temp);
                }
            }
        }
        return input;
    }
}



