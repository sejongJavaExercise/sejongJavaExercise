package chapter12.practice.question3;

import java.util.*;

class Point implements Comparable<Point>{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "x = " + this.x + ", y = " + this.y;
    }

    @Override
    public int compareTo(Point otherPoint){
        return this.x + this.y - otherPoint.x + otherPoint.y;
    }
}

public class Question3new {
    public static void main(String[] args){
        Point[] arr = new Point[3];
        arr[0] = new Point(3, 0);
        arr[1] = new Point(2, 3);
        arr[2] = new Point(4, 2);

        Arrays.sort(arr);

        for(Point point : arr){
            System.out.println(point.toString());
        }
    }
}
