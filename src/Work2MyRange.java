// ************************
//This file code by Thana.Y
//*** THIS BAD SOLUTION ***
//*** Good solution please see:NewMyRange ***
//Bad because Not validate input and can't enter a value greater than ten or minus ten

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

        if(new Character('(').equals(arrayInput[0])){
            start= start+1;
        }if(new Character(')').equals(arrayInput[4])){
            end= end-1;
        }

        for(int i= start; i <end+1 ; i++){
            System.out.println(i);
        }
    }

}
