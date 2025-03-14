
/**
 * SkillBuilder5 is a class for completing the Skill
 * Builder 5 assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder4 {
    public static String findTYPattern(String s) {
        int state = 0;
        int i = 0;
        StringBuilder substring = new StringBuilder();

        while (i < s.length()) {
            char c = s.charAt(i);
            if (state == 0 && (c == 't' || c == 'T')) {
                state = 1;
                substring.append(c);
            } else if (state == 1) {
                substring.append(c);
                if (c == 'y' || c == 'Y') {
                    return "Substring found: " + substring;
                } else {
                    state = 2;
                }
            } else if (state == 2) {
                substring.append(c);
                if (c == 'y' || c == 'Y') {
                    return "Substring found: " + substring;
                }
            }
            i++;
        }
        return "Substring not found";
    }

    public static void main(String[] args) {
        System.out.println(findTYpattern("abcTxyz")); // Substring found: Txy
        System.out.println(findTYpattern("random texty")); // Substring found: texty
        System.out.println(findTYpattern("xyz")); // Substring not found
        System.out.println(findTYpattern("tHelloY")); // Substring found: tHelloY
        System.out.println(findTYpattern("ty")); // Substring found: ty
    }
}




