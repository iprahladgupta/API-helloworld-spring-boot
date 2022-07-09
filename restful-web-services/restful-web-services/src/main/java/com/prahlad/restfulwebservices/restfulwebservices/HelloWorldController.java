package com.prahlad.restfulwebservices.restfulwebservices;

import org.springframework.web.bind.annotation.*;

//controller
@RestController
public class HelloWorldController {


    @GetMapping(path="/hello")
    public String HelloWorld(){
        return "Hello Prahlad kumar";
    }

    //bean used getter and setter for this method so this is return data like json
    @GetMapping(path="/hello-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello Prahlad Kumar Gupta");
    }

    @GetMapping(path="/hello-bean/path-variable/{name}")
    public HelloWorldBean helloWorldPthVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello Prahlad Kumar Gupta , %s",name));
    }


}


