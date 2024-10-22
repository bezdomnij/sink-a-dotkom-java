package org.b37.dotcomgame;

import lombok.extern.java.Log;
import org.b37.dotcomgame.elements.Dot;
import org.b37.dotcomgame.elements.DotkomOjektum;
import org.b37.dotcomgame.util.Helper;

import java.util.ArrayList;
import java.util.List;

@Log
public class Game {

    private static final String menu = """
            expected composition of input is the following
            size of dotkom object (1-7) - length of 1
            direction of dotkom object (d - down, a - across) - only 'd' or 'a' accepted in the 2nd position
            coordinate of first element (rows A - G, columns 1 -7) - input length 2 (e.g. a3)
            The whole user input will be 4 char long, e.g. '3aA3' - a 3 long block across, starting at A3
            """;

    private static final int OBJECT_COUNT = 3;
    private static final int DOTKOM_SIZE = 3;
    private Helper helper;
    private List<DotkomOjektum> dotcomObjects = new ArrayList<DotkomOjektum>(OBJECT_COUNT);

    public Game() {
        System.out.println("Game is being created as we speak.");
        System.out.println(menu);
    }

    public void start() {
        helper = new Helper(DOTKOM_SIZE);
        // create objects
        for (int i = 0; i < OBJECT_COUNT; i++) {
            List<Dot> dotList = this.helper.getDotsForOjektum(i);
            log.info("dotlist size: " + dotList);
            DotkomOjektum dotDotkomOjektum = new DotkomOjektum(dotList);
            System.out.println(dotDotkomOjektum);
            dotcomObjects.add(dotDotkomOjektum);
        }
    }
}
