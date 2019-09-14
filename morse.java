import java.util.*;

public class morse {
    public static void main(String[] args) {
        char[] alfa = {' ', 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String[] morse = {" ", ".-","-...","-.-.","-..",".","..-.","--.","....","..", ".---","-.-",".-..","--","-.","---",".--.",
                           "--.-",".-.","...","-", "..-","...-",".--","-..-","-.--","--.."};

        Scanner s = new Scanner(System.in);

        String text = s.nextLine().toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            System.out.print(morse[Arrays.binarySearch(alfa, text.charAt(i))]+" ");
        }
        System.out.println();

    }
}