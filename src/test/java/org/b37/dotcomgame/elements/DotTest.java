package org.b37.dotcomgame.elements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DotTest {

    private Dot homeDot;

    @Test
    void testEquals() {
        homeDot = new Dot(3, 4);
        Dot testYes = new Dot(3, 4);
        Dot testNo = new Dot(4, 4);

        Assertions.assertTrue(homeDot.equals(testYes));
        Assertions.assertFalse(homeDot.equals(testNo));
    }
}