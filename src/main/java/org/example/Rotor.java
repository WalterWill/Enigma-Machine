package org.example;

public class Rotor {
    public static final int POSICAO_INICIAL = 0;
    public static final int AJUSTE_ARRAY_LENGHT = 1;
    private int position[];
    private int window;

    public Rotor(int size){
        this.position = new int[size];
        this.window = 0;
    }

    public Rotor(int size, int window){
        this.position = new int[size];
        this.window = window;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public int getPosition(int n) {
        return position[n];
    }

    public int getSize(){
        return this.position.length;
    }

    public int getWindow(){
        return this.window;
    }

    public void changeContact(int positionA, int positionB){
        int aux = this.position[positionA];
        this.position[positionA] = this.position[positionB];
        this.position[positionB] = aux;
    }

    public int pass(int input){
        int index = input + window;

        if (index >= this.position.length){
            index = index - this.position.length;
        }

        int output = this.position[index];

        return output;
    }

    public int pass_reverse(int input){

        int index = input + window;

        if (index >= this.position.length){
            index = index - this.position.length;
        }

        int output = getIndex(input);

        return output;
    }

    public int getIndex(int value) {
        for (int i = 0; i < this.position.length; i++) {
            if (this.position[i] == value) {
                return i;
            }
        }
        return -1;
    }
    public RotorStatus rotate() throws RotationException {
        RotorStatus output;
        if (this.window >= this.position.length - AJUSTE_ARRAY_LENGHT){
            this.window = POSICAO_INICIAL;
            output = RotorStatus.TURN;
            throw new RotationException(RotorStatus.TURN);
        } else {
            this.window++;
            output = RotorStatus.UP;
        }

        return output;
    }
}
