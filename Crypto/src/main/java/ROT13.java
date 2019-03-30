import com.sun.tools.javac.util.ArrayUtils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ROT13  {

    ROT13(Character cs, Character cf) {
    }

    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {
        return rotate(text,'n');
    }

    public String encrypt(String text) {
        return rotate(text,'n');
    }

    public String decrypt(String text) {
        return rotate(text,'n');
    }

//    public static String rotate(String s, Character c) {
//
//        int asciiOff = (int) c;
//        int zeroOff = selectRange(c,asciiOff);
//        int ascii;
//        int upStr;
//        int upAsc;
//        String codedMessage = "";
//
//        for ( Character x : s.toCharArray() ){
//            if ( x.toString().matches("[a-zA-Z]") ) {
//                ascii = (int) x;
//                upStr = ascii + zeroOff;
//                upAsc = ((ascii > 95) ? (97 + ((upStr - 19) % 26)) : (65 + ((13 + upStr) % 26)));
//                codedMessage += ((char) upAsc);
//            }
//            else {
//                codedMessage += x;
//            }
//        }
//        return codedMessage;
//    }
    public static String rotate(String s, Character c) {
        String alphabetL = "abcdefghijklmnopqrstuvwxyz";
        String alphabetC = alphabetL.toUpperCase(); // "ABCDE..."
        // c -> 'n'
//        Integer indexToMove = !(alphabetL.indexOf(c.toString()) == -1) ? alphabetL.indexOf(c.toString()) : alphabetC.indexOf(c.toString());

//        c.toString().toLowerCase()

        Integer indexToMove;
        if( alphabetL.indexOf(c.toString()) == -1 ){
            indexToMove = alphabetC.indexOf(c.toString());
        }
        else {
            indexToMove = alphabetL.indexOf(c.toString());
        }

        String codedMessage = "";
        String oneLetter;
        for (int i = 0; i < s.length(); i++) {
            oneLetter = s.substring(i, i + 1);
                if (oneLetter.matches("[a-zA-Z]")) {
                    // oneLetter -> onluy one letter from the message
                    Integer indexOneLetter = alphabetL.indexOf(oneLetter) == -1 ? alphabetC.indexOf(oneLetter) : alphabetL.indexOf(oneLetter);
                    Integer indexUp = (indexOneLetter + indexToMove) % 26;
//                    System.out.println("indexUp: " + indexUp + " - indexOneLetter: " + indexOneLetter + " - indexToMove: " + indexToMove);
                    codedMessage += Character.isUpperCase(oneLetter.charAt(0)) ? alphabetC.substring(indexUp, indexUp + 1) : alphabetL.substring(indexUp, indexUp + 1);
                } else {
                    codedMessage += oneLetter;

                }
        }
        return codedMessage;
    }

    public static int selectRange(Character c, int asciiOff){
        if ( c.toString().matches("[a-z]") ){
            return asciiOff - 97;
        }
        else if( c.toString().matches("[A-Z]") ){
            return asciiOff - 65;
        }
        else{
            System.out.println("Not valid");
            return 9999;
        }
    }


//    public static void main(String[] args) {
//        for (int i = 22; i < 100; i++) {
//            System.out.print( i % 26  + " ");
//        }
//    }


}
