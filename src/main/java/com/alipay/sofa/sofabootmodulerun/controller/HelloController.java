package com.alipay.sofa.sofabootmodulerun.controller;

import com.alipay.sofa.isle.sample.SampleService;
import com.alipay.sofa.runtime.api.annotation.SofaReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author xuanbei 18/7/17
 */
@RestController
public class HelloController {
    @SofaReference
    private SampleService sampleService;

    @RequestMapping("/hello-sofamodule")
    public String hessian3() throws IOException {
        return sampleService.message();
    }
}
