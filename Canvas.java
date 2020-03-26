import Point.java;
import java.util.List;

public class Canvas{
    List<Point> points = new ArrayList<Point>();
    int n;

    public Canvas(List<Point> points, int n) {
        this.points = points;
        this.n = n;
    }

    public boolean addPoint (Point p){
        return points.add(p);
    }

    public boolean removePoint (Point p){
        return points.remove(p)
    }

    public Point average (List<Point> points){
        Point point;
        double x = 0.0;
        double y = 0.0;
        for(Point p : points){
            x+=p.x;
            y+=p.y;
        }
        double n = point.size();
        point = new Point(x/n, y/n);
        return point;
    }
}