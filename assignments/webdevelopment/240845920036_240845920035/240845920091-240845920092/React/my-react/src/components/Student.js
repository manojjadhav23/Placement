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

export default Student;
