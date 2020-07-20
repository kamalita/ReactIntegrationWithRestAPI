/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

import React,{Component} from 'react';

const updatedCounter=(OriginalComponent)=>{
    class NewComponent extends Component{
        constructor(props) {
            super(props);
            this.state={
                count:0
            }
        }
        increment=()=>{
            this.setState(
                prevState=>{
                    return {count:prevState.count+1}
                }
            );

        }
        render() {
            return(
                <OriginalComponent name="kamalita"
                                   count={this.state.count}
                                   increment={this.increment}
                />
            )
        };
    }

    return NewComponent
    }
export default updatedCounter;
