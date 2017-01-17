package com.hiersun;/**
 * Created by liubaocheng on 2017/1/17.
 */

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Description:
 * Author: liubaocheng
 * Create: 2017-01-17 9:49
 **/
@Component
public class ComputeClientHystrix implements ComputeClient {


    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }
}
