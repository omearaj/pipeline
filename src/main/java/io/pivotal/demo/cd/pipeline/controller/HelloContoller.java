package io.pivotal.demo.cd.pipeline.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by jomeara on 8/17/15.
 */
@RestController
public class HelloContoller {
        @RequestMapping("/")
        public String index() {
            return "CD pipeline and Spring boot!!";
        }
}
