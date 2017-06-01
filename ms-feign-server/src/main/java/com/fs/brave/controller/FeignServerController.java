package com.fs.brave.controller;

import com.fs.brave.request.RequestDemo;
import com.fs.brave.response.ResponseDemo;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by junzhang on 2017/6/1.
 */
@RestController
@RequestMapping(value = "/fs/v1")
public class FeignServerController {

    @RequestMapping(value = "/demo/{id}/{name}",method = RequestMethod.GET)
    public ResponseDemo demo(@PathVariable("id") int id,@PathVariable("name") String name) {
        RequestDemo requestDemo = RequestDemo.builder().id(id).name(name).build();
        ResponseDemo responseDemo = ResponseDemo.builder()
                .id(requestDemo.getId())
                .name(requestDemo.getName())
                .build();
        return responseDemo;

    }

    @RequestMapping(value = "/pdemo",method = RequestMethod.POST)
    public ResponseDemo postdemo(@RequestBody RequestDemo requestDemo) throws InterruptedException {
        System.out.println(requestDemo.getId()+"--"+requestDemo.getName());
//        TimeUnit.SECONDS.sleep(60);
        ResponseDemo responseDemo = ResponseDemo.builder().id(123).name("brave").build();
        return responseDemo;
    }

}
