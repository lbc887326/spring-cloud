package com.hiersun;/**
 * Created by liubaocheng on 2017/1/17.
 */

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Description:
 * Author: liubaocheng
 * Create: 2017-01-17 9:38
 **/
@Service
public class ComputeService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod="addServiceFallback")
    public String addService(){
        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
    }

    public String addServiceFallback() {
        return "error";
    }
}
