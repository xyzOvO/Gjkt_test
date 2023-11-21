package API_test;

import java.util.Arrays;

public class xuanze_test {
    public static void main(String[] args) {
        int[] array = {5,1,3,2};
        System.out.println(array.length);
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if (array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
