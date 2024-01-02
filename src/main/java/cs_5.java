import org.junit.Test;

import java.util.Arrays;
import java.util.List;

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
}

