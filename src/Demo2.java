import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        //String
        String name1 ="Thana";
        String name2 = new String("Thana") ;

        if("Thana".equals(name1)){
            System.out.println("Ok 1");
        }

        if("Thana".equals(name2)){
            System.out.println("Ok 2");
        }

        int[] score = new int[]{10,20,30,40};

        Arrays.stream(score).forEach(System.out::println);

    }
}
