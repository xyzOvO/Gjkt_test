package API_test;

import java.util.Arrays;

public class ef_test {
    //二分查找
    public static void main(String[] args) {
        int[] arr = {7,23,79,81,103,127,131,147,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int num = 79;
        int mid = 0,l=-1,r=arr.length;
        while(l+1<r){
            mid=(l+r)/2;
            if (arr[mid]<num){
                l=mid;
            }else{
                r=mid;
            }
        }
        if (arr[mid]==num) {
            System.out.println(arr[mid]);
        }else {
            System.out.println("未找到");
        }
        // Arrays封裝的算法
        System.out.println(Arrays.binarySearch(arr, 2));
    }
}
