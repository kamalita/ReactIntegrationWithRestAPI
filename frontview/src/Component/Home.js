/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

import React, {useEffect} from 'react';
import ListGroup from "react-bootstrap/ListGroup";
import ClickIncrement from "./ClickIncrement";
import HoverIncrement from "./HoverIncrement";

export default function Home (){
    useEffect(()=>{
        fetchItems();
    },[]);
 const fetchItems=() => {
     const data=fetch('http://localhost:8080/home', { mode: 'no-cors' });
     console.log(data);

 }
        return(
            <div>
                <ClickIncrement/>
                <HoverIncrement/>
                <ListGroup>
                    <ListGroup.Item>One</ListGroup.Item>
                    <ListGroup.Item>in</ListGroup.Item>
                    <ListGroup.Item>Morbi leo risus</ListGroup.Item>
                    <ListGroup.Item>Porta ac consectetur ac</ListGroup.Item>
                    <ListGroup.Item>Vestibulum at eros</ListGroup.Item>
                </ListGroup>
            </div>
        );
}