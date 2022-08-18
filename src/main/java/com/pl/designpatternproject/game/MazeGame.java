package com.pl.designpatternproject.game;

import com.pl.designpatternproject.cons.Direction;
import com.pl.designpatternproject.maze.Door;
import com.pl.designpatternproject.maze.Maze;
import com.pl.designpatternproject.maze.Room;
import com.pl.designpatternproject.maze.Wall;

/**
 * <p>迷宫游戏</p>
 *
 * @author Amos
 * @date 2022-08-17
 */
public class MazeGame {

    public Maze createMaze() {
        Maze maze = new Maze();
        Room room1 = new Room();
        Room room2 = new Room();
        Door door = new Door(room1, room2);


        room1.setSide(Direction.East,door);
        room1.setSide(Direction.West,new Wall());
        room1.setSide(Direction.North,new Wall());
        room1.setSide(Direction.South,new Wall());
        room2.setSide(Direction.East,new Wall());
        room2.setSide(Direction.West,door);
        room2.setSide(Direction.North,new Wall());
        room2.setSide(Direction.South,new Wall());

        maze.addRoom(room1);
        maze.addRoom(room2);
        return maze;
    }
}
