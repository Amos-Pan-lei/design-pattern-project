package com.pl.designpatternproject.maze;

/**
 * <p></p>
 *
 * @author Amos
 * @date 2022-08-17
 */
public class Door implements MapSite {
    public Door(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    Room room1;
    Room room2;


    public Room otherSideFrom(Room room) {

        return null;
    }

    @Override public void enter() {

    }
}
