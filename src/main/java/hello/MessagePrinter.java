package hello;

import org.springframework.stereotype.Component;

/**
 * 打印机
 */
@Component
public class MessagePrinter {

    public MessagePrinter() {
        super();
        System.out.println("随便打印 无参2");
    }

    /**
     * 建立和message关联关系
     */
    private MessageService service;

    /**
     * 设置service值
     * @param service
     */
    public void setService(MessageService service) {
        this.service = service;
    }

}
