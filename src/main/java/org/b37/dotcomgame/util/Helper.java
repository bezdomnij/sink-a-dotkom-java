package org.b37.dotcomgame.util;

import lombok.extern.java.Log;
import org.b37.dotcomgame.elements.Dot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Log
public class Helper {
    private static final int LINE_SIZE = 4;
    Scanner scanner = new Scanner(System.in);
    private final int dotcomSize;
    private final List<Dot> dots;


    public Helper(int dotcomSize) {
        this.dotcomSize = dotcomSize;
        this.dots = new ArrayList<>();
    }

    private String readLine() {
        return scanner.nextLine();
    }

    public List<Dot> getDotsForOjektum(int objectIndex) {
        for (int i = 0; i < dotcomSize; i++) {
            communicate(objectIndex);
            String line = readLine();
            log.info("read this line: " + line);
            Boolean formatError = checkInputFormat(line);
            dots.add(new Dot(3, 4));
        }
        return dots;
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

    private void communicate(int objectIndex) {
        System.out.println("Enter for dorKom no." + (objectIndex + 1));
        String instructions = """
                (size (1-7) -- direction ('d' - down, 'a' -across) -- coordinate (A1-G7)
                """;
        System.out.println(instructions);
    }
}
