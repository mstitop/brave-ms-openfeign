package com.fs.brave;

import com.fs.brave.client.FeignServer;
import com.fs.brave.jackson.JacksonDecoder;
import com.fs.brave.jackson.JacksonEncoder;
import feign.Feign;
import feign.Request;
import feign.Retryer;
import feign.codec.Encoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App1 {
    public static void main(String[] args) {
        SpringApplication.run(App1.class,args);
    }

    @Bean
    FeignServer init(){
        return Feign.builder()
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .options(new Request.Options(5000,10000))
                .retryer(new Retryer.Default(5,10,3))
                .target(FeignServer.class,"http://localhost:9001/fs/v1");
    }

}