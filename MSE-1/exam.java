import java.util.Arrays;
import java.util.Scanner;

class hello {
    int a;

    void cool() {
        System.out.println("fejfnjen");
    }
}

public class exam {

    static String scan() {
        return (new Scanner(System.in)).nextLine();
    }

    public static void main(String args[]) {
        // StringBuffer sb = new StringBuffer();
        int occurence[] = new int[26];
        Arrays.fill(occurence, 0);
        int initialCharIndex = (int) 'a';
        String user = scan().toLowerCase();
        for (int i = 0; i < user.length(); i++) {

            int temp = (int) user.charAt(i);
            occurence[temp - initialCharIndex] += 1;
        }
        System.out.println("Now the occurence...");
        for (int i = 0; i < 26; i++) {
            if (occurence[i] != 0) {
                char character = (char) (i + initialCharIndex);
                System.out.println("" + character + " : " + occurence[i]);
            }
        }
        // sb.append("");
        // System.out.println(sb.capacity());
        // System.out.println("cool: " + scan());

        // hello a = new hello();
        // a.cool();
    }
}
