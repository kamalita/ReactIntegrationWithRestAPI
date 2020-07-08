/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

import React,{ Component } from 'react';
import './Component.css';
import {Link} from 'react-router-dom';
// import 'bootstrap/dist/css/bootstrap.min.css';

export default class NAV extends Component{
    render(){
        return(
            <nav className="navigation">
                <Link to='home'>
                    <ul>About</ul>
                </Link>
                <Link to='/contacts'>
                    <ul>Contacts</ul>
                </Link>
                <Link to='/resource'>
                    <ul>Resources</ul>
                </Link>
            </nav>
        );
    }

}