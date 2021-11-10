package com.example.aixnagmu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import java.awt.*;

@RestController
@RequestMapping("/a")
public class BController {

    @RequestMapping(value = "/hello")
    public String hello() throws AWTException, InterruptedException {
      return "A brief hello";
    }


    @RequestMapping(value = "/account/{id}", method = RequestMethod.GET)
    public ResponseEntity account(@PathVariable("id") int id) throws InterruptedException {
        if(2==id) {
            Thread.sleep(200);
        }
        return new ResponseEntity<>("llllllllllll", HttpStatus.UNAUTHORIZED);
//        return "Here is a little red flower for you";
    }

}

