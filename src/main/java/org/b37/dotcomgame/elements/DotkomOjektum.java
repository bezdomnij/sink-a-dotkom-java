package org.b37.dotcomgame.elements;

import lombok.extern.java.Log;

import java.util.List;

@Log
public class DotkomOjektum {

    private static final int OJEKTUM_SIZE = 3;

    private List<Dot> coordinates;

    public DotkomOjektum(List<Dot> coordinates) {
        this.coordinates = coordinates;
        log.info("Creating DotkomOjektum" + coordinates);
    }

    @Override
    public String toString() {
        return "DotkomOjektum{" +
                "coordinates=" + coordinates +
                '}';
    }
}
