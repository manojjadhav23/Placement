import React, { Component } from "react";

export class Score extends Component { // Changed class name to start with uppercase
    constructor() {
        super(); // Call the parent constructor
        this.state = {
            score: 0 // Initialize state
        };
        this.incrementScore = this.incrementScore.bind(this);
        this.decrementScore = this.decrementScore.bind(this); // Bind the decrement method
    }

    incrementScore() {
        this.setState((prevState) => ({ score: prevState.score + 4 })); // Increment the score by 4
    }

    decrementScore() {
        this.setState((prevState) => ({ score: prevState.score - 2 })); // Decrement the score by 1
    }

    render() {
        return (
            <div>
                <h1>{this.state.score}</h1> {/* Display the current score */}
                <button onClick={this.incrementScore}>+</button>
                <button onClick={this.decrementScore}>-</button> {/* Call decrement method */}
            </div>
        );
    }
}
