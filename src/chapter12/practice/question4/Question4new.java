package chapter12.practice.question4;

import java.util.*;

public class Question4new {
    public static void main(String[] args){
        Point[] arr= new Point[3];

        Comparator<Point> comparator = new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                return p1.x + p1.y - p2.x + p2.y;
            }
        };

        arr[0] = new Point(1,0);
        arr[1] = new Point(5,3);
        arr[2] = new Point(4,2);

        Arrays.sort(arr, comparator);

        for(Point point : arr){
            System.out.println(point.toString());
        }
    }
}

class Point{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "x = " + this.x + ", y = " + this.y;
    }
}