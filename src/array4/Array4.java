//4th assignment in arrays
package array4;

/**
 *
 * @author Kim Vammen
 */
public class Array4 {

    public static void main(String[] args) {

        int[] numbers = new int[50];

        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index + 1;
        }

        for (int i = 39; i > 0; i--) {
            int temp = numbers[i];
            numbers[i] = numbers[i - 1];
            numbers[i - 1] = temp;
        }
        
        for (int i = 49; i > 0; i--) {
            int temp = numbers[i];
            numbers[i] = numbers[i - 1];
            numbers[i - 1] = temp;
        }
        
        for (int i = 29; i > 0; i--) {
            int temp = numbers[i];
            numbers[i] = numbers[i - 1];
            numbers[i - 1] = temp;
        }

        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index] + " ");
        }
    }
}
