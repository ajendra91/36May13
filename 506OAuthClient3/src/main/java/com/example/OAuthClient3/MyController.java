package com.example.OAuthClient3;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MyController {

    @RequestMapping("/")
    public String hello() {
        return "Hello";
    }

    @RequestMapping("/emp1")
    public String emp1() {
        return "emp1";
    }

    @RequestMapping("/emp2")
    public String emp2() {
        return "emp2";
    }


    /*@RequestMapping("/")
    public String home(Principal user) {
        return "Hello " + user.getName();
    }*/


}
