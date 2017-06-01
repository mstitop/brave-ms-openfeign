package com.fs.brave.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by junzhang on 2017/6/1.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestDemo {

    public int id;
    public  String name;
}
