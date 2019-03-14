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

    public static String rotate(String s, Character c) {

        int asciiOff = (int) c;
        int zeroOff = selectRange(c,asciiOff);
        int ascii;
        int upStr;
        int upAsc;
        String codedMessage = "";

        for ( Character x : s.toCharArray() ){
            if ( x.toString().matches("[a-zA-Z]") ) {
                ascii = (int) x;
                upStr = ascii + zeroOff;
                upAsc = ((ascii > 95) ? (97 + ((upStr - 19) % 26)) : (65 + ((13 + upStr) % 26)));
                codedMessage += ((char) upAsc);
            }
            else {
                codedMessage += x;
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


}
