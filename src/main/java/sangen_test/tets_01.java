package sangen_test;

public class tets_01 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {3,2,1};
        int[] arr3 = {3,2,1};
        System.out.println(eqArray(arr1, arr2));
        System.out.println(eqArray(arr2, arr3));
        System.out.println(eqArray(null,null));

    }

    public static boolean eqArray(int[] arr1,int[] arr2){
        boolean temp = true;
        if (arr1==null||arr2==null){
            return false;
        }
        if (arr1.length!=arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]!=arr2[i]){
                temp=false;
            }
        }
        return temp;
    }
}
