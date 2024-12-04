import React, { Component } from "react"; // Fixed import statement

export class ScoreBoard extends Component {
    constructor() {
        super(); // Call the parent constructor
        this.state = {
            score: 0 // Initialize state
        };
        
        // Bind the incrementScore method to `this`
        this.incrementScore = this.incrementScore.bind(this);
    }

    incrementScore() {
        this.setState((prevState) => ({
            score: prevState.score + 1 // Increment the score
        }));
        alert("+ clicked");
    }

    render() {
        return (
            <div>
                <h1>{this.state.score}</h1> {/* Display the current score */}
                <button onClick={this.incrementScore}>+</button>
                <button onClick={() => this.setState((prevState) => ({ score: prevState.score - 1 }))}>-</button>
            </div>
        );
    }
}
