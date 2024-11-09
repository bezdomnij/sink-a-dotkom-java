package org.b37.dotcomgame.util;

import lombok.extern.java.Log;
import org.b37.dotcomgame.elements.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Log
public class Helper {


    private final int dotcomSize;
    private final List<Point> points;


    public Helper(int dotcomSize) {
        this.dotcomSize = dotcomSize;
        this.points = new ArrayList<>();
    }


}
