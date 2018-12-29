package dubbo.test;

import com.example.demo.dubbo.service.DubboDemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class DemoTest {
    public static void main(String[] args) throws Exception {
        String filePath = "dubbo/dubbo-consumer.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{filePath});
        context.start();
        DubboDemoService demoService = (DubboDemoService) context.getBean("dubboDemoService"); // 获取远程服务代理
        String hello = demoService.sendDemo("Test" + System.currentTimeMillis()); // 执行远程方法
        System.out.println(hello); // 显示调用结果
    }
}
