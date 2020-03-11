package com;

/*
create a new class in the MyFirstMavenProject, within that class write at least 5 methods that take different types of arguments and return different types of data - then write test cases against all 5 of them in a test class
3:49
you can:
assertEquals
assertNotEquals
assertTrue
assertFalse
assertArrayEquals
assertNull
assertNotNull
assertThrows
3:49
get creative - please do not write multiple(), divide(), subtract(), and addition() methods
 */

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class JUnitPractice2 {


    public Boolean isOdd(int n) {
            if (n%2 != 0) {
                return true;
            } else {
                return false;
            }
    }

    public int doubleToInt(double a){
        return (int) a;
    }

    public int math(double a, double b, int c, int d){
        if(d == 0){
            return 0;
        }
        return (int) (a*(b*b) + (c/d));
    }

    public int stringToInt(String s){
        int i = Integer.parseInt(s);
        return i;
    }
    public double stringToDouble(String s){
        Double i = Double.parseDouble(s);
        Double x = i*i;
        return x;
    }

}
