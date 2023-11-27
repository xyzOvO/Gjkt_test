package test;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author xyz66 Email:2910223554@qq.com
 * @since 2023/11/27 11:48
 */
public class test_09 {
    
    @Test
    public void cs1() throws MalformedURLException {
        // 获取请求
//        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        // url 测试
//        URL cs1 = new URL("https://baidu.com");
        URL cs1 = new URL("https://localhost:8080/cs.com");
        System.out.println(cs1.getProtocol());// 获取URL协议
        System.out.println(cs1.getHost());// 获取URL主机
        System.out.println(cs1.getPort());// 获取URL端口
    }
}
