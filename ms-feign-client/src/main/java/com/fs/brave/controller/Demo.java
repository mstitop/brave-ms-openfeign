package com.fs.brave.controller;

import com.fs.brave.client.FeignServer;
import com.fs.brave.reponse.Rpd;
import com.fs.brave.request.Rsd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by junzhang on 2017/6/1.
 */
@RestController
public class Demo {

    @Autowired
    FeignServer feignServer;

    @RequestMapping(value = "/demo",method = RequestMethod.GET)
    public Rpd demo(@ModelAttribute Rsd rsd){
        Rsd rsd1 = Rsd.builder().id(rsd.getId()).name(rsd.getName()).build();
        return feignServer.getDemo(rsd1.getId(),rsd1.getName());
    }

    @RequestMapping(value = "/pdemo",method = RequestMethod.POST)
    public Rpd pdemo(@RequestBody Rsd rsd){
        Rsd rsd1 = Rsd.builder().id(rsd.getId()).name(rsd.getName()).build();
        System.out.println("send to service");
        return feignServer.getPdemo(rsd);
    }

}
