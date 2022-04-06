package com.jack.kubernetesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class KubernetesDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(KubernetesDemoApplication.class, args);
    }

    @RequestMapping("/K8s")
    public String K8s() throws UnknownHostException {
        String hostAddress = InetAddress.getLocalHost().getHostAddress();
        return "Hello K8s, 当前服务的地址是: "+hostAddress;
    }
}




