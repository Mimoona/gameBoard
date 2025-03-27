package org.example;

public class PlayerCharacter {
    private int x;
    private int y;


    // write a method "getX" which returns 0   (positioned in beginning)
    //

    public PlayerCharacter() {
        // Empty constructor
    }

    public int getX (){
        return x;
    }

    public int getY (){
        return y;
    }

//    move S (runter)
//    move D (rechts)
//    move A (links)

    public int[] move(String direction){
        switch (direction){
            case "W":
                y++;
                break;
            case "S":
                y--;
                break;
            case "D":
                x++;
                break;
            case "A":
                x--;
                break;
            default:
                break;
        }

        return new int []{x,y};


    }


}
