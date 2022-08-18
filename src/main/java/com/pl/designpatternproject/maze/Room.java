package com.pl.designpatternproject.maze;

import com.pl.designpatternproject.cons.Direction;

import java.util.Collection;

/**
 * <p></p>
 *
 * @author Amos
 * @date 2022-08-17
 */
public class Room implements MapSite {

    /**
     * 房间号
     */
    private Integer roomNo;

    /**
     * 周围
     */
    private Collection<MapSite> sides;

    public Collection<MapSite> getSides(Direction direction) {
        return null;
    }

    public void setSide(Direction direction, MapSite mapSite) {

    }

    @Override
    public void enter() {

    }


}
