package Test;

// Write a program to reverse a String
import javax.print.attribute.standard.MediaSize;


public class ReverseString {
    public static void main(String[] args) {
        String NAME = "HELLO WORLD";
        String reversedNAME = " ";
        for (int i = NAME.length()-1 ; i >= 0 ; i--){
            reversedNAME +=  NAME.charAt(i);


        }
        System.out.println("original :" + NAME);
        System.out.println(("Reversed: "+ reversedNAME));


    }



}
