package com.vwmare.demos.cfgserver.credhub.credhubcfgdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    private final String username;
    private final String password;

    public DemoController( @Value("${username:none}") String username, @Value("${password:none}") String password) {
        this.username = username;
        this.password = password;
    }

    @GetMapping
    public String getMyProperties() {

        StringBuffer sb = new StringBuffer();
        sb.append("username:" );
        sb.append(username);
        sb.append("\n");
        sb.append("password:" );
        sb.append(password);
        sb.append("\n");

        return sb.toString();
    }

}