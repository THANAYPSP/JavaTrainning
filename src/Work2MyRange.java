// ************************
//This file code by Thana.Y
//Edit for Work1MyRange


public class Work2MyRange {

    private final String input;

    public Work2MyRange(String input) {
        this.input = input;
    }

    public boolean checkStartWithInclude() {
        return input.startsWith("[");
    }

    public boolean checkEndWithInclude() {
        return input.endsWith("]");
    }

    public int getFirstNumber() {
        int start = Integer.parseInt(String.valueOf(input.charAt(1)));
        if (checkStartWithInclude()) {
            return start;
        } else {
            return start + 1;
        }

    }

    public int getLastNumber() {
        int end = Integer.parseInt(String.valueOf(input.charAt(3)));
        if (checkStartWithInclude()) {
            return end + 1;
        } else {
            return end;
        }

    }

    public String getResult() {
        String result = "";
        for (int i = getFirstNumber(); i < getLastNumber(); i++) {
            result = result + i;
            if(i < getLastNumber()-1){
                result = result + " , " ;
            }
        }
        return result;
    }

}
