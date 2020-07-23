/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

import React,{Component} from 'react';

const updatedCounter=(OriginalComponent,incrementVal)=>{
    class NewComponent extends Component{
        constructor(props) {
            super(props);
            this.state={
                count:0,
                view:"original"
            }
        }

        increment=()=>{
            this.setState(
                (prevState)=>{
                    return {count:prevState.count+incrementVal}
                }
            );

        }
        render() {
            return(
                <OriginalComponent name="kamalita"
                                   count={this.state.count}
                                   increment={this.increment}
                                   {...this.state}
                />
            )
        };
    }

    return NewComponent
    }
export default updatedCounter;
