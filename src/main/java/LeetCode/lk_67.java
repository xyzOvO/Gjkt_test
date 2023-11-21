package LeetCode;

public class lk_67 {
    public static void main(String[] args) {

    }

    public String addBinary(String a, String b) {
        int alen = a.length();
        int blen = b.length();
        int maxlen = Math.max(alen, blen);
        StringBuilder sbA = new StringBuilder(a).reverse();// 反转便于进位
        StringBuilder sbB = new StringBuilder(b).reverse();
        while (sbA.length() < maxlen) {
            sbA.append("0");
        }
        while (sbB.length() < maxlen) {
            sbB.append("0");
        }
        int carry = 0;// 进位
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < maxlen; i++) {
            int num1 = sbA.charAt(i) - '0';// 字符转整形
            int num2 = sbB.charAt(i) - '0';// 字符转整形
            if (num1 + num2 + carry > 1) {
                res.append(carry + num1 + num2 - 2);// 构建字符串
                carry = 1;
            } else {
                res.append(carry + num1 + num2);
                carry = 0;
            }
        }
        if (carry == 1) {
            res.append("1");
        }
        return res.reverse().toString();// 反转回正常字符串
    }
}


