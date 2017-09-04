package com.example.demo.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by OTARANOVSKYI on 25.07.2017.
 */
@RestController
public class SimpleController {

    @RequestMapping(method = RequestMethod.GET, path = "/request")
    public String reply() {
        return "Here is your response";
    }
}
