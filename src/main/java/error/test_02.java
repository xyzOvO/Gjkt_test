package error;

public class test_02 {
    /*
     *自定义异常：整数在0~10的范围内
     */
    public static void main(String[] args) {
        int num = 11;
        try {
            getInt(num);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getInt(int num) throws IntException {
        if (num >= 0 || num <= 10) {
            throw new IntException("不在0~10范围内");
        }
    }
}

class IntException extends Exception {
    public IntException() {
    }

    public IntException(String s) {
        super(s);
    }
}
