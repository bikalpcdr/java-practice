package reverse_string;

/**
 * @author bikalpa.chaudharii
 * @project java-practice
 * @created 26/7/27
 */
public class ByTraditionalLoop {
    static void main() {
        String str = "bikalpa";
        String revesed = "";

        /* loop backward from the last index to 0*/
        for (int i = str.getBytes().length - 1; i >= 0; i--) {
            revesed += str.charAt(i);
        }
        IO.println(revesed);
    }
}
