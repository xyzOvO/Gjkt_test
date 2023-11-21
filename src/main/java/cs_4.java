import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author xyz66 Email:2910223554@qq.com
 * @date 2023/11/20 17:07
 */
public class cs_4 {
//    abstract class cs{public abstract void cs1();}

    public static void main(String[] args) throws MalformedURLException {
        URL c  = new URL("http://www.baidu.com");
        System.out.println(c);
        try {
            int i =1 ;
            float f = 2;
            System.out.println(i / f);
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
