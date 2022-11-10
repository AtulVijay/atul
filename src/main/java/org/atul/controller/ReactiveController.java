package org.atul.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("test/")
public class ReactiveController {



    @RequestMapping(value = "getTest", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String helloTest(){
        System.out.println("INside hello test");
        return "Hello";
    }

}
