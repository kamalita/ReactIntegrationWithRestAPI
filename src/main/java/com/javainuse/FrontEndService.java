/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package com.javainuse;

import org.springframework.stereotype.Service;

@Service
public class FrontEndService {
    public String getByID(String id){
        System.out.println(id);
        return id;
    }
}
