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
@NoArgsConstructor
@AllArgsConstructor
public class Rsd {
    int id;
    String name;
}
