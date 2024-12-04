// a.js
import React from 'react';

class Student {
    constructor(id, name) {
        this.id = id;
        this.name = name;
    }

    show() {
        console.log(`ID: ${this.id}, Name: ${this.name}`);
    }
}

export default function A() {
    const student = new Student(1, "Alice");
    student.show(); // This will log to the console

    return (
        <div>
            <h1>Testing Student Class</h1>
            <p>ID: {student.id}</p>
            <p>Name: {student.name}</p>
        </div>
    );
}
