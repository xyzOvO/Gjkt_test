package BigDecimal;

import org.junit.Test;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * @author xyz66 Email:2910223554@qq.com
 * @since 2023/11/24 15:24
 */
public class cs {
    @Test
    public void cs1() {
        // 利用BigDecimal的构造方法，将一个double类型的数值转换成BigDecimal类型
        // 具有不可预知性-实际值：0.1000000000000000055511151231257827021181583404541015625
        BigDecimal bigDcimal = new BigDecimal(0.1);
        System.out.println(bigDcimal);
        // String构造是可预知的
        // 通常建议优先使用String构造方法,写好多是好多
        BigDecimal bigDecimal1 = new BigDecimal("0.1");
        System.out.println(bigDecimal1);
    }

    @Test
    public void cs2() {
        BigDecimal bigDecimal1 = new BigDecimal("0.551");
        BigDecimal bigDecimal2 = new BigDecimal("1");
        // 加法 .add
        System.out.println("加法:" + bigDecimal1.add(bigDecimal2));
        // 减法 .subtract
        System.out.println("减法:" + bigDecimal1.subtract(bigDecimal2));
        // 乘法 .multiply
        System.out.println("乘法:" + bigDecimal1.multiply(bigDecimal2));
        // 除法 .divide
        System.out.println("除法:" + bigDecimal1.divide(bigDecimal2,2,BigDecimal.ROUND_UP));
        // 比较 .compareTo
        System.out.println("比较:" + bigDecimal1.compareTo(bigDecimal2));
    }

    @Test
    public void cs3() {
        // 转换测试
        BigDecimal bigDecimal = new BigDecimal("0.9");
        System.out.println(bigDecimal.intValue());
    }

    @Test
    public void cs4() {
        NumberFormat currency = NumberFormat.getCurrencyInstance(); //建立货币格式化引用 
        NumberFormat percent = NumberFormat.getPercentInstance();  //建立百分比格式化引用
        // 设置百分比格式化的最大小数位数为3
        percent.setMaximumFractionDigits(3);
        System.out.println(currency.format(0.1));// ￥0.10
        System.out.println(percent.format(0.1));// 10%
    }
    @Test
    public void cs5(){
        // 测试BigDecimal的工具类
        System.out.println(ArithmeticUtils.add(0.333333, 1.222222));
        System.out.println(ArithmeticUtils.div(1,3));
    }
}
