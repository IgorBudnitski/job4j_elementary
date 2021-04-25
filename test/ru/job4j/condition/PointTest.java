package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void when00to20then2() {
        int expected = 2;
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 2);
        double out = p1.distance(p2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to222then346() {
        double expected = 3.46;
        Point p1 = new Point(0, 0, 0);
        Point p2 = new Point(2, 2, 2);
        double out = p1.distance3d(p2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenn534to1043then1506() {
        double expected = 15.06;
        Point p1 = new Point(-5, 3, 4);
        Point p2 = new Point(10, 4, 3);
        double out = p1.distance3d(p2);
        Assert.assertEquals(expected, out, 0.01);
    }
}