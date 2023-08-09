package org.example;

public class Rotorbox {
    Rotor rotors[];
    boolean reverse;

    public Rotorbox(int n_rotors, boolean reverse){
        this.rotors = new Rotor[n_rotors];
        this.reverse = reverse;
    }

    public void setRotor(int position, Rotor rotor){
        this.rotors[position] = rotor;
    }

    public Rotor getRotor(int position){
        Rotor output = this.rotors[position];
        return output;
    }

    public void rotate(int index){
        if(index < this.rotors.length){
            RotorStatus status = null;
            try {
                status = this.rotors[index].rotate();
            } catch (RotationException e) {
                this.rotate(index + 1);
            }
        }
    }
}
