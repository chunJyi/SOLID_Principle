package org.solid.LiskovSubstitutionPrinciple;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Bird> birdList = new ArrayList<>();
        birdList.add(new Bird());
        birdList.add(new Crow());
        birdList.add(new Penguin());
        letTheBirdsFly ( birdList );
    }

        static void letTheBirdsFly ( List<Bird> birdList ){
        for ( Bird b : birdList ) {
            b.fly();
        }
    }

}
