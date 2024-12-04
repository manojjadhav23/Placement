
import { Component } from "react";
export class Header extends Component{
    render(){
        return(
            <div>
                <h1>{this.props.title}</h1>
                <h3>{this.props.description}</h3>
            </div>
        );
    }
}