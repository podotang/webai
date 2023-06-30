package com.example.demo.conf;

import com.example.demo.obj.AA;
import com.example.demo.obj.BB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//개발환경설정
@Configuration
public class MyConfigration {
//    객체담는 통안에 AA라는 객체가 담김

//    @Bean(name = "aa")라는 식으로 적어도 되고 안적어도 자동 aa로 잡아줌
    @Bean
    public AA aa(){
        return  new AA("하...");

    }

    @Bean
    public BB bb(){
        return new BB();


    }
}
