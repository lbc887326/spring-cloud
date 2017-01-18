package com.hiersun;/**
 * Created by liubaocheng on 2017/1/17.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Author: liubaocheng
 * Create: 2017-01-17 15:56
 **/
@RefreshScope
@RestController
public class IndexController {

    @Value("${config}")
    private String config;

    @Value("${env}")
    private String env;

    @RequestMapping("/index")
    public String index(){
        return this.config+"-"+this.env;
    }
}
