
/*
 * Copyright (c) 2020.
 * Kamalita's coding
 * https://www.youtube.com/watch?v=B6aNv8nkUSw
 */

import React,{Component} from 'react'
import Button from "react-bootstrap/Button";
import Incrementer from './IncrementCounter';

class ClickIncrement extends Component{


render() {
    const {count,increment}=this.props;
    return(
        <Button onClick={increment}>Click {count} times</Button>
    );
}

}
export default Incrementer(ClickIncrement);

