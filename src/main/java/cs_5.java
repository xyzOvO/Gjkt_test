import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author xyz66 Email:2910223554@qq.com
 * @date 2023/11/21 9:28
 */
public class cs_5 {
    public static void main(String[] aegs) {
        Employee s = new Employee("123");
        String empID = s.name;
        System.out.println(empID);
    }
    
    @Test
    public void test(){
        List<String> list = Arrays.asList("cs", "cs2", "cs3");
        System.out.println(list);
    }
    @Test
    public void test1(){
        // 随机数
        Random random = new Random();
        int i = random.nextInt(5);
        List<Integer> list = Arrays.asList(82,106,136,149,2324);
        int num = 20001225;
        int zy = num % 1225;
        while (zy>=4){
            zy %= i;
        }
        System.out.println(list.get(zy));
    }
}

