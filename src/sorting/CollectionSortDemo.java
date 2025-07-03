package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Point implements Comparable<Point>{
    int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int compareTo(Point p) {
        return this.x - p.x;
    }
}
public class CollectionSortDemo {
    public static void main(String[] args) {
        List<Point> al = new ArrayList<>();
        al.add(new Point(5,13));
        al.add(new Point(7,123));
        al.add(new Point(2,13));
        Collections.sort(al);
        for(Point p : al){
            System.out.println(p.x+" "+ p.y);
        }
        System.out.println("Reverse");
        Collections.sort(al,Collections.reverseOrder());
        for(Point p : al){
            System.out.println(p.x+" "+ p.y);
        }
    }
}
