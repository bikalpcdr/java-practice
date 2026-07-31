package tranning.array_basic;

/**
 * @author bikalpa.chaudharii
 * @project java-practice
 * @created 26/7/28
 */
public class ArrayDemo {
    static void main() {
        // declaring and initialization
        int[] numbers = new int[5];  // default values: 0,0,0,0,0
        int[] scores = {90, 85, 77, 60, 100};

        // access and update
        System.out.println(scores[0]);
        scores[1]=88;

        // length
        System.out.println(scores.length);

        // iteration
        for (int i = 0; i< scores.length; i++) {
            System.out.println(scores[i]);
        }

        // inhance iteration
        for (int score : scores) System.out.println(score);

        int[][] matrix = {{1,2,3}, {4,5,6}};
        System.out.println(matrix[1][2]);
    }
}
