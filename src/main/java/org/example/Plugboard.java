package org.example;

public class Plugboard {
    int plugs[];
    public Plugboard(int size){
        this.plugs = new int[size];
    }

    public void setPlugs(int[] plugs) {
        this.plugs = plugs;
    }

    public int[] getPlugs() {
        return plugs;
    }

    public int getSize(){
        return this.plugs.length;
    }

    public void changePlugs(int positionA, int positionB){
        int aux = plugs[positionA];
        plugs[positionA] = plugs[positionB];
        plugs[positionB] = aux;
    }

    public int pass(int input){
        return this.plugs[input];
    }
}
