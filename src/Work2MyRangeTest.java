import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Work2MyRangeTest {
    @Test
    public void startWithInclude() { // [
        Work2MyRange MyRange = new Work2MyRange("[1,5]");
        boolean isInclude = MyRange.checkStartWithInclude();
        assertTrue(isInclude);
    }

    @Test
    public void endWithInclude() { // [
        Work2MyRange MyRange = new Work2MyRange("[1,5]");
        boolean isInclude = MyRange.checkEndWithInclude();
        assertTrue(isInclude);
    }

    @Test
    public void startWithExclude() { // [
        Work2MyRange MyRange = new Work2MyRange("(1,5]");
        boolean isInclude = MyRange.checkStartWithInclude();
        assertFalse(isInclude);
    }
    @Test
    public void endWithExclude() { // [
        Work2MyRange MyRange = new Work2MyRange("[1,5)");
        boolean isInclude = MyRange.checkEndWithInclude();
        assertFalse(isInclude);
    }

    @Test
    public void getFirstNumberAndStartWithInclude() { // [
        Work2MyRange MyRange = new Work2MyRange("[1,5]");
        int firstNumber = MyRange.getFirstNumber();
        assertEquals(1, firstNumber);
    }

    @Test
    public void getFirstNumberAndStartWithExclude() { // [
        Work2MyRange MyRange = new Work2MyRange("(1,5]");
        int firstNumber = MyRange.getFirstNumber();
        assertEquals(2, firstNumber);
    }


    @Test
    public void result01() { // [
        Work2MyRange MyRange = new Work2MyRange("[1,5]");
        String result = MyRange.getResult();
        assertEquals("1 , 2 , 3 , 4 , 5", result);
    }

    @Test
    public void result02() { // [
        Work2MyRange MyRange = new Work2MyRange("(1,5)");
        String result = MyRange.getResult();
        assertEquals("2 , 3 , 4", result);
    }

}