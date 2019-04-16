package ade.jmsqueue.jmsqueue;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by adewale adeleye on 03/04/2019
 **/
@RestController
public class QueueController {
    private JmsTemplate jmsTemplate;

    public QueueController(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @RequestMapping("/generate-queue")
    public void generateQ(){
        Map<String, String> actionMap = new HashMap<>();
        actionMap.put("name", "Adewale");
        System.out.println("This is sending the queue to ActiveMQ");
        jmsTemplate.convertAndSend("receive.queue", actionMap);
    }
}
