package com.imooc.order.starter;

import com.alibaba.fastjson.JSONObject;
import com.imooc.order.pojo.Orders;
import com.imooc.order.service.OrdersService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemApplication {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]
                {"spring/spring-context.xml"});
        context.start();
        OrdersService ordersService = (OrdersService) context.getBean("ordersService");
        Orders orders = ordersService.getOrder("1");
        System.out.println("orders:{} "+ JSONObject.toJSONString(orders));
        System.in.read();

    }
}
