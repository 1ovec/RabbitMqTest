package com.ys.simple;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.ys.utils.ConnectionUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create by hadoop
 */
public class Send {
    private final static String QUEUE_NAME = "LOVE丶C丶";

    public static void main(String[] args) throws Exception{
        //1、获取连接
        Connection connection = ConnectionUtil.getConnection("127.0.0.1",5672,"/","guest","guest");
        //2、声明通道
        Channel channel = connection.createChannel();
        //3、声明(创建)队列
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        //4、定义消息内容
        String message = "hello rabbitmq ";
        List<Integer>list = new ArrayList<>(Arrays.asList(1,2,3,5,99));
        //5、发布消息
        channel.basicPublish("",QUEUE_NAME,null,list.toString().getBytes());
        System.out.println("[x] Sent'"+message+"'");
        //6、关闭通道和连接
        channel.close();
        connection.close();
    }
}