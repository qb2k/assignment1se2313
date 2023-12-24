package models;

public class Point {
    private double x;
    private double y;

    // constructor having both parameters
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    // distance(Point dest) - distance from current point to the dest point
    public double distance(Point dest){
        double dx = this.x - dest.x;
        double dy = this.y - dest.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    // toString - provide a string representation of the point
    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
