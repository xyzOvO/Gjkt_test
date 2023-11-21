package bishi;

import java.util.Arrays;

public class test_01 {
    //给一个字符串，不改变原顺序，大写字母排字符串后面
    public static void main(String[] args) {
        System.out.println(scase("aBcDeFGhIjklMnOp"));
    }
    public static String scase(String s){
        int len = s.length();
        char[] chars = s.toCharArray();
        for (int i =0 ; i<len;i++){
            for (int j = 1; j <len-i; j++) {
                if (Character.isUpperCase(chars[j-1])){
                    // chars[i]为大写字母
                    if (chars[j]>=97 && chars[j]<=122){
                        // chars[j] 是小写字母
                        char temp = chars[j];
                        chars[j] = chars[j-1];
                        chars[j-1] = temp;
                    }
                }
            }
        }
        return Arrays.toString(chars);
    }
}
