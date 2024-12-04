import React, { Component } from "react";
//import './TemperatureConverter.css'; // Import CSS file for styling

export class TemperatureConverter extends Component {
    constructor() {
        super();
        this.state = {
            celsius: '',
            fahrenheit: ''
        };
    }

    handleCelsiusChange = (event) => {
        const celsius = event.target.value;
        this.setState({ 
            celsius: celsius,
            fahrenheit: this.convertToFahrenheit(celsius) // Update Fahrenheit on change
        });
    }

    convertToFahrenheit(celsius) {
        return celsius ? (celsius * 9/5 + 32).toFixed(2) : ''; // Convert Celsius to Fahrenheit
    }

    render() {
        return (
            <div className="converter">
                <h1>Temperature Converter</h1>
                <input 
                    type="number" 
                    placeholder="Enter Celsius" 
                    value={this.state.celsius} 
                    onChange={this.handleCelsiusChange} 
                />
                <h2>{this.state.celsius && `Fahrenheit: ${this.state.fahrenheit} °F`}</h2>
            </div>
        );
    }
}
