package com.fs.brave.client;

import com.fs.brave.reponse.Rpd;
import com.fs.brave.request.Rsd;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by junzhang on 2017/6/1.
 */
@Headers("Accept: application/json")
public interface FeignServer {
    @RequestLine("GET /demo/{id}/{name}")
    Rpd getDemo(@Param("id") int id,@Param("name") String name);

    @RequestLine("POST /pdemo")
    @Headers("Content-Type: application/json")
    Rpd getPdemo(@RequestBody Rsd rsd);

    @RequestLine("POST /pdemo")
    @Headers("Content-Type: application/json")
    Rpd getPdemo1(String content);
}
