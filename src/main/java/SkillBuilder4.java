
/**
 * SkillBuilder5 is a class for completing the Skill
 * Builder 5 assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder4 {

    // replace this line with your constants
        public static String containsTtoY(String s) {
            int state = 0;
            int i = 0;

            while (i < s.length()) {
                char c = s.charAt(i);
                if (state == 0 && (c == 't' || c == 'T')) {
                    state = 1;
                } else if (state == 1) {
                    if (c == 'y' || c == 'Y') {
                        return "Substring found";
                    } else {
                        state = 2;
                    }
                } else if (state == 2 && (c == 'y' || c == 'Y')) {
                    return "Substring found";
                }
                i++;
            }
            return "Substring not found";
        }

        public static void main(String[] args) {
            System.out.println(containsTtoY("abcTxyz")); // Substring found
            System.out.println(containsTtoY("random texty")); // Substring found
            System.out.println(containsTtoY("xyz")); // Substring not found
            System.out.println(containsTtoY("tHelloY")); // Substring found
            System.out.println(containsTtoY("ty")); // Substring found
        }
    }

