package tranning.string;

/**
 * @author bikalpa.chaudharii
 * @project java-practice
 * @created 26/7/28
 */
public class StringDemo {
    static void main() {
        String s1 = "Java";
        String s2 = "Java";

        String s3 = new String("Java");

        System.out.println(s1 == s3);


        System.out.println(s1 == s3);

        System.out.println(s1.equals(s3));

    }
}
