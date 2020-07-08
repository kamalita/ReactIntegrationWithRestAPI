import React from 'react';
import NAV from './Component/NAV'
import './App.css';
import Home from "./Component/Home";
import Resource from "./Component/Resource";
import 'bootstrap/dist/css/bootstrap.min.css';
import {BrowserRouter as Router ,Switch } from 'react-router-dom';
import {Route} from 'react-router';

function App() {
  return (

<Router>
    <div>
        <NAV/>
                <Switch>
                    <Route path="/home" exact component={Home}/>
                    <Route path="/resource" exact component={Resource}/>
                </Switch>
    </div>
</Router>

  );
}

export default App;
