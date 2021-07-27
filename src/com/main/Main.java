package com.main;



import java.util.Objects;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.HashMap;

class Point implements Comparable<Point> {
    public double x;
    public double y;

    public Point() {}

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point copy() {
        return new Point(x, y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public int compareTo(Point o) {
        if (x < o.x) return -1;
        else if (x > o.x) return 1;
        return 0;
    }
}


public class Main {
    private static void mainMap() {
        HashMap<String, Point> cartesianPlane = new HashMap<>();
        cartesianPlane.put("Point One", new Point(6, 1));
        cartesianPlane.put("Point Two", new Point(7, 2));
        cartesianPlane.put("Point Three", new Point(12, 32));
        System.out.println(cartesianPlane);
        System.out.println(cartesianPlane.get("Point Two"));
        System.out.println(cartesianPlane.containsKey("Point Four"));
        System.out.println(cartesianPlane.containsValue(new Point(6, 1)));
        System.out.println(cartesianPlane.remove("Point One"));
        System.out.println(cartesianPlane);
    }

    private static void mainTreeSet() {
        Set<Point> treeSetPoint = new TreeSet<>();

        treeSetPoint.add(new Point(0.01, 27.3));
        treeSetPoint.add(new Point(1.4, 982.13));
        treeSetPoint.add(new Point(-23.04, 2.098));
        treeSetPoint.add(new Point(-121, 523));
        treeSetPoint.add(new Point(54, 2));
        treeSetPoint.add(new Point(13, 10));

        System.out.println(treeSetPoint);
    }

    private static void mainSet() {
        Set<Integer> integers = new HashSet<>();
        for (int i = -10; i <= 10; i++) {
            integers.add(i);
        }
        System.out.println(integers);
    }

    private static void mainArrayList() {
        List<Point> points = new ArrayList<>();
        points.add(new Point(1, 1));
        points.add(new Point(10, 12));
        points.add(new Point(102, 123));
        points.add(new Point(102, 34));
        points.add(new Point(43, 3498));

        System.out.println(points);
        System.out.println(points.get(2));
        System.out.println(points.remove(1));
        System.out.println(points);
    }

    private static void mainQueue() {
        Queue<String> names = new LinkedList<>();
        names.add("Michael");
        names.add("Pam");
        names.add("Jim");
        names.add("Dwight");

        System.out.println(names);
        System.out.println(names.peek());
        System.out.println(names.poll());
        System.out.println(names);
        System.out.println(names.peek());
        System.out.println(names.offer("Angela"));
        System.out.println(names);
    }

    private static void mainStack() {
        Stack<Point> points = new Stack<>();
        points.push(new Point(1, 2));
        points.push(new Point(2, 3));
        points.push(new Point(10, 12));
        System.out.println(points);
        System.out.println(points.peek());
        System.out.println(points.pop());
        System.out.println(points);
        System.out.println(points.peek());
    }

    private static void mainPoint() {
        Point p1 = new Point(12, 12);
        Point p2 = p1.copy();
        p2.x = 0;
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("p1 = p2 ? " + p1.equals(p2));
        System.out.println("Hash p1 = " + p1.hashCode());
        System.out.println("Hash p2 = " + p2.hashCode());
    }

    public static void main(String[] args) {
        //mainPoint();
        //mainStack();
        //mainQueue();
        //mainArrayList();
        //mainSet();
        //mainTreeSet();
        mainMap();
    }
}
