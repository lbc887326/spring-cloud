package com.hiersun;/**
 * Created by liubaocheng on 2017/1/16.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Author: liubaocheng
 * Create: 2017-01-16 18:09
 **/
@RestController
public class FeignConsumerController {

    @Autowired
    private ComputeClient computeClient;

    @RequestMapping("/add")
    public Integer add(){
        return computeClient.add(3,4);
    }
}
