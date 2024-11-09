package org.b37.dotcomgame.util;

import lombok.extern.java.Log;
import org.b37.dotcomgame.elements.DotkomOjektum;
import org.b37.dotcomgame.elements.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Log
public class DotkomBuilder {

    private final Scanner scanner = new Scanner(System.in);
    private static final int LINE_SIZE = 4;
    private final int dotkomSize;
    private List<Point> points = new ArrayList<>();

    public DotkomBuilder(int dotkomSize) {
        this.dotkomSize = dotkomSize;
    }


    public DotkomOjektum build() {

        return null;
    }

    public List<Point> getDotsForOjektum(int objectIndex) {
        for (int i = 0; i < dotkomSize; i++) {
            communicate(objectIndex);
            String line = readLine();
            log.info("read this line: " + line);
            Boolean formatError = checkInputFormat(line);
            points.add(new Point(3, 4));
        }
        return points;
    }


    private void communicate(int objectIndex) {
        System.out.println("Enter for dorKom no." + (objectIndex + 1));
        String instructions = """
                (size (1-7) -- direction ('d' - down, 'a' -across) -- coordinate (A1-G7)
                """;
        System.out.println(instructions);
    }


    private String readLine() {
        return scanner.nextLine();
    }


    private Boolean checkInputFormat(String line) {
        Boolean lengthOk = checkLength(line);
        Boolean compositionOk = checkComposition(line);
        return lengthOk && compositionOk;
    }

    private Boolean checkComposition(String line) {
        return null;
    }

    private Boolean checkLength(String line) {
        return line.length() == LINE_SIZE;
    }

}
