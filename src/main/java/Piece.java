package main.java;

public class Piece {

    private String name;
    //private Square currentPosition;

    public Piece(String name){
        this.name = name;
       //this.currentPosition = currentPosition;
    }

    /*
    public Square getCurrentPosition(){
        return currentPosition;
    }

    public void setCurrentPosition(Square newPosition){
        this.currentPosition = newPosition;
    }
    */

    public String toString()
    {
        return name;
    }
}
