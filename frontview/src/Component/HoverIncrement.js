/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

import React, {Component} from 'react';
import UpdatedComponent from './IncrementCounter';

class HoverIncrement extends Component{


    // constructor(props) {
    //     super(props);
    //     this.state={
    //         count:0
    //     }
    // }

    // increment=()=>{
    //         this.setState(
    //             prevState=>{
    //                 return {count:prevState.count+1}
    //             }
    //         );
    //
    // }

    render() {
        const{count,increment}=this.props;
        return(

        <p onMouseOver={increment}>this text is hovered {count} times {this.props.name}</p>

        );
    };


}
export default (UpdatedComponent)(HoverIncrement);

