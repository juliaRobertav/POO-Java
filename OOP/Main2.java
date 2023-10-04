import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

        int[] array = new int[]{1,2,3,4,5};
        int[] array2 = array.clone();
        array[0] = 10;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
}
