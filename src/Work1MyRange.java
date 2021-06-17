import java.util.Scanner;

public class Work1MyRange {
    public static void main(String[] args) {
        String input;
        Scanner scanInput = new Scanner(System.in);

        System.out.println("Enter Range : ");
        input = scanInput.nextLine();
        char[] arrayInput = input.toCharArray();

        int start =Integer.parseInt(String.valueOf(arrayInput[1]));
        int end =Integer.parseInt(String.valueOf(arrayInput[3]));

        if(arrayInput[0] =='('){
            start= start+1;
        }if(arrayInput[4] ==')'){
            end= end-1;
        }

        for(int i= start; i <end+1 ; i++){
            System.out.println(i);

        }
    }

}
