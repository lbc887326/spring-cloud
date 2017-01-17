package com.hiersun;/**
 * Created by liubaocheng on 2017/1/16.
 */

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Description:
 * Author: liubaocheng
 * Create: 2017-01-16 18:07
 **/
@FeignClient(name="compute-service",fallback= ComputeClientHystrix.class)
public interface ComputeClient {

    @RequestMapping(method = GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

}
