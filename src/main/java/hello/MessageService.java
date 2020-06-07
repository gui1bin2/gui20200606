package hello;

import org.springframework.stereotype.Component;

/**
 * 打印服务
 */
@Component
public class MessageService {

    public MessageService() {
        super();
        System.out.println("随便打印个什么 无参构造方法");
    }


    /**
     * 随便写点什么 返回测试
     * @return
     */
    public String getMessage(){
        return "测试";
    }
}
