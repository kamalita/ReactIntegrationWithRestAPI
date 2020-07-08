/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package com.javainuse.controllers;

import com.javainuse.FrontEndService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FrontEndController {
    @Autowired
    FrontEndService frontEndService;
    @RequestMapping(value = "/home/{id}",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.FOUND)
    public String get(@PathVariable String id){
        frontEndService.getByID(id);
        return "success";
    }

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.FOUND)
    public String get(){
        return "success";
    }

}

