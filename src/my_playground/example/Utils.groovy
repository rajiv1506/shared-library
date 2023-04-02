package com.my_playground.example

class Utils {
    void printMessage(String message) {
        echo "Message: ${message}"
    }
    
    int getRandomNumber() {
        return Math.abs(new Random().nextInt())
    }
}
