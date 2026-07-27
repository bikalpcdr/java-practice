package reverse_string;

/**
 * @author bikalpa.chaudharii
 * @project java-practice
 * @created 26/7/27
 */
public class ByCharArrayPlaceSwapping  {
    static void main() {
        String str = "bikalpa";
        char[] chars = str.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        /* swap characters util pointers meet in the middle*/
        while (left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        String revesed = new String(chars);
        IO.println(revesed);
    }
}
