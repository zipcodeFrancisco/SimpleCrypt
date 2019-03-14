public class ROT13ver1 {


    public static String rotate(String s, Character c) {
        String alphabetL = "abcdefghijklmnopqrstuvwxyz";
        String alphabetC = alphabetL.toUpperCase();
        Integer indexToMove = alphabetL.indexOf(c.toString()) == -1 ? alphabetC.indexOf(c.toString()) : alphabetL.indexOf(c.toString());
        String codedMessage = "";
        String oneLetter = "";
        for (int i = 0; i < s.length(); i++) {
            oneLetter = s.substring(i, i + 1);
            if( !oneLetter.equals(" ")) {
                Integer indexOneLetter = alphabetL.indexOf(oneLetter) == -1 ? alphabetC.indexOf(oneLetter) : alphabetL.indexOf(oneLetter);
                Integer indexUp = (indexOneLetter + indexToMove) % 26;
                codedMessage += Character.isUpperCase(oneLetter.charAt(0)) ? alphabetC.substring(indexUp, indexUp + 1) : alphabetL.substring(indexUp, indexUp + 1);
            }else {
                codedMessage += " ";
            }
        }
        return codedMessage;
    }


}
