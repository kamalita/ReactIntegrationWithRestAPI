/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

import React,{ Component } from 'react';
import ListGroup from "react-bootstrap/ListGroup";

export default class Resource extends Component{
    render(){
        return(
            <ListGroup>
                <ListGroup.Item>Click on ok</ListGroup.Item>
                <ListGroup.Item>Click on Home page</ListGroup.Item>
            </ListGroup>
        );
    }

}