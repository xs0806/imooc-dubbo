package com.imooc.item.starter;

import com.imooc.item.service.ItemsService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemApplication {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]
                {"spring/spring-context.xml"});
        context.start();
        ItemsService itemsService = (ItemsService) context.getBean("itemsService");
        System.out.println(itemsService.getItemCounts("2"));
        System.in.read();

    }
}
