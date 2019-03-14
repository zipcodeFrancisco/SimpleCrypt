public class Playing {


    public static void main(String[] args) {


        for (int i = 65; i < 95; i++) {
            System.out.print( i + " ");
        }
        System.out.println("");
        for (int i = 65; i < 95; i++) {
            System.out.print( i+2 + " ");
        }
        System.out.println("");
        for (int i = 65; i < 95; i++) {
            System.out.print( (65 + 0 + ((13+i)%26)) + " ");
        }
        System.out.println("--");
        for (int i = 65; i < 95; i++) {
            System.out.print( (65 + 0 + ((13+i+1)%26)) + " ");
        }
        System.out.println("--");
        for (int i = 97; i < 122; i++) {
            System.out.print( (97 + 0 + ((19+i)%26)) + " ");
        }
        System.out.println("--");

        for (int i = 97; i < 127; i++) {
            System.out.print( (((i-19)%26)) + " ");
        }
        System.out.println("--");
        for (int i = 97; i < 127; i++) {
            System.out.print( (97+((i-19)%26)) + " ");
        }



    }


}
