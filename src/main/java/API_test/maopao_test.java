package API_test;

import java.util.Arrays;

public class maopao_test {
    public static void main(String[] args) {
        int[] array = {6, 3, 8, 9, 1};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = 0;
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
