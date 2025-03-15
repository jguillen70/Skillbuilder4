
/**
 * SkillBuilder5 is a class for completing the Skill
 * Builder 5 assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder4 {

    public static final String STATE_INITIAL = "initial";
    public static final String STATE_TFOUND = "T-FOUND";
    public static final String STATE_YFOUND = "Y-FOUND";

    public static String findTYPattern(String s) {
        String current_state = STATE_INITIAL;
        int TFOUND = -1;
        int YFOUND = -1;
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (current_state.equals(STATE_INITIAL) && (ch == 't' || ch == 'T')){
                current_state = STATE_TFOUND;
                TFOUND = i;
            } else if (current_state.equals(STATE_TFOUND) && (ch == 'y' || ch == 'Y')) {
                current_state = STATE_YFOUND;
                YFOUND = i;
                break;
            }
        }
        if (current_state.equals(STATE_YFOUND) && (TFOUND < YFOUND)){
            result = s.substring(TFOUND,YFOUND+1);
        }

        return result;

    }
    }




