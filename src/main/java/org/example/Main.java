package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.springframework.web.reactive.function.client.WebClient;

import java.nio.charset.StandardCharsets;

public class Main {


    public static void main(String[] args) {
        BeanFactory context = new AnnotationConfigApplicationContext("org.example");
        World world = context.getBean("world", World.class);
        System.out.println(world);
        world.attack();
    }

//        System.out.println("Hello world!");

        //    加载 Spring 配置文件
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("world.xml");
//
//        //    获取配置创建的对象
//        World world = applicationContext.getBean("world", World.class);
//        System.out.println(world);
//
//        world.attack();
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("restTemplate.xml");;
//        RestTemplate restTemplate = applicationContext.getBean("restTemplate", RestTemplate.class);

//设置请求头
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
//        headers.add("key1", "value1");
//        headers.add("key2", "value2");
//
//        HttpEntity<String> entity = new HttpEntity<>(new String(), headers);
////
//        String url = "https://www.baidu.com/sugrec?prod=pc_his&from=pc_web&json=1&sid=36545_38093_38057_38116_38147_38177_38170_38220_36802_37936_38088_26350_37284_38102_38008_37881&hisdata=&_t=1677134243651&csor=0";
//        //发送post请求
//        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
//        String r = responseEntity.getBody();
//
//        System.out.println("响应结果" + r);

//
//        WebClient webClient = WebClient.create(url);
//
//        Mono<String> result = webClient.get()
//                .uri("/article/index/arcid/{id}.html", 256)
//                .acceptCharset(StandardCharsets.UTF_8)
//                .accept(MediaType.TEXT_HTML)
//                .retrieve()
//                .bodyToMono(String.class);
//        result.subscribe(System.err::println);



    }
