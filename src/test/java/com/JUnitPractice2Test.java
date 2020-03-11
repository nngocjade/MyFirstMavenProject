package com;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JUnitPractice2Test {

    @Test
    public void isOdd() {
        JUnitPractice2 isOddd = new JUnitPractice2();
        Boolean result = isOddd.isOdd(3);
        Boolean result1 = isOddd.isOdd(2);
        Assert.assertEquals(result, new Boolean(true));
        Assert.assertNotEquals(result, new Boolean(false));

    }

    @Test
    public void doubleToInt() {
        JUnitPractice2 d = new JUnitPractice2();
        int result = d.doubleToInt(2.4444);
        int result1 = d.doubleToInt(3);
        Assert.assertEquals(result, 2);
        Assert.assertNotEquals(result, 3.444);

    }

    @Test
    public void math() {
        JUnitPractice2 m = new JUnitPractice2();
        //(a*(b*b) + (c/d))
        int result = m.math(1.5,4.5,5,6);
        int result1 = m.math(2.5,3.5,4,0);
        Assert.assertEquals(result,30);
        Assert.assertNotEquals(result1, 22);

    }

    @Test
    public void stringToInt() {
        JUnitPractice2 string = new JUnitPractice2();
        int result = string.stringToInt("Jade");
        int result1 = string.stringToInt("blue");

    }

    @Test
    public void stringToDouble() {
    }
}