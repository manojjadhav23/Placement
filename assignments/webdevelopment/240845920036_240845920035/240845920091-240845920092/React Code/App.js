import React from 'react';
import Student from './components/Student'; // Adjust the path as needed

function App() {
    const student = new Student(1, "Alice");
    student.show(); // Output: ID: 1, Name: Alice
    
    return (
        <div>
            <h1>Welcome to the Student App</h1>
        </div>
    );
}

export default App;
