package com.ys.simple;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.QueueingConsumer;
import com.ys.utils.ConnectionUtil;


/**
 * Create by hadoop
 */
public class Recv {

    private final static String QUEUE_NAME = "LOVE丶C丶";

    public static void main(String[] args) throws Exception{
        //1、获取连接
        Connection connection = ConnectionUtil.getConnection("127.0.0.1",5672,"/","guest","guest");
        //2、声明通道
        Channel channel = connection.createChannel();
        //3、声明队列
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        //4、定义队列的消费者
        QueueingConsumer queueingConsumer = new QueueingConsumer(channel);
        //5、监听队列
        channel.basicConsume(QUEUE_NAME,true,queueingConsumer);
        //6、获取消息
        while (true){
            QueueingConsumer.Delivery delivery = queueingConsumer.nextDelivery();
            String message = new String(delivery.getBody());
            System.out.println(" [x] Received '" + message + "'");
        }
    }

}