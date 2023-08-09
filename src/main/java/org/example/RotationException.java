package org.example;

public class RotationException extends Exception {

    public RotationException(RotorStatus status){
    }

    @Override
    public String getMessage() {
        return RotorStatus.TURN.toString();
    }
}
