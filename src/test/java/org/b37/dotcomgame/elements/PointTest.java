package org.b37.dotcomgame.elements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PointTest {

    private Point homePoint;

    @Test
    void testEquals() {
        homePoint = new Point(3, 4);
        Point testYes = new Point(3, 4);
        Point testNo = new Point(4, 4);

        Assertions.assertTrue(homePoint.equals(testYes));
        Assertions.assertFalse(homePoint.equals(testNo));
    }
}