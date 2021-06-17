import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MySortTest {
    List<Integer> input = new ArrayList<>();
    List<Integer> expect = new ArrayList<>();
    List<Integer> result=new ArrayList<>();

    public void clearList() {
        input.clear();
        expect.clear();
        result.clear();
    }


    @Test
    @DisplayName("Empty ")
    public void emptyList() {
        MySort mySort = new MySort(input);
        result = mySort.sort();
        assertEquals(expect, result);
    }

    @Test
    @DisplayName("Input 1 ")
    public void one() {
        clearList();
        input.add(1);
        expect.add(1);

        MySort mySort = new MySort(input);
        result = mySort.sort();
        assertEquals(expect, result);
    }

    @Test
    @DisplayName("Input 1 , 2 ")
    public void twoValOneTwo() {
        clearList();

        input.add(1);
        input.add(2);
        expect.add(1);
        expect.add(2);

        MySort mySort = new MySort(input);
        result = mySort.sort();
        assertEquals(expect, result);
    }

    @Test
    @DisplayName("Input 2 , 1 ")
    public void twoValTwoOne() {

        clearList();
        input.add(2);
        input.add(1);
        expect.add(1);
        expect.add(2);

        MySort mySort = new MySort(input);
        result = mySort.sort();
        assertEquals(expect, result);
    }

    @Test
    @DisplayName("Input 1 , 2 , 3 ")
    public void threeValOneTwoThree() {
        clearList();

        input.add(1);
        input.add(2);
        input.add(3);
        expect.add(1);
        expect.add(2);
        expect.add(3);

        MySort mySort = new MySort(input);
        result = mySort.sort();
        assertEquals(expect, result);
    }

    @Test
    @DisplayName("Input 2 , 1 , 3 ")
    public void threeValTwoOneThree() {
        clearList();

        input.add(2);
        input.add(1);
        input.add(3);
        expect.add(1);
        expect.add(2);
        expect.add(3);

        MySort mySort = new MySort(input);
        result = mySort.sort();
        assertEquals(expect, result);
    }

    @Test
    @DisplayName("Input 1 , 3 , 2 ")
    public void threeValOneThreeTwo() {
        clearList();

        input.add(1);
        input.add(3);
        input.add(2);
        expect.add(1);
        expect.add(2);
        expect.add(3);

        MySort mySort = new MySort(input);
        result = mySort.sort();
        assertEquals(expect, result);
    }

    @Test
    @DisplayName("Input 3 , 2 , 1 ")
    public void threeVal() {
        clearList();

        input.add(3);
        input.add(2);
        input.add(1);
        expect.add(1);
        expect.add(2);
        expect.add(3);

        MySort mySort = new MySort(input);
        result = mySort.sort();
        assertEquals(expect, result);
    }

    @Test
    @DisplayName("Input 5 , 4 , 3 , 2 , 1 ")
    public void fiveVal() {
        clearList();

        input.add(5);
        input.add(4);
        input.add(3);
        input.add(2);
        input.add(1);
        expect.add(1);
        expect.add(2);
        expect.add(3);
        expect.add(4);
        expect.add(5);

        MySort mySort = new MySort(input);
        result = mySort.sort();
        assertEquals(expect, result);
    }
}