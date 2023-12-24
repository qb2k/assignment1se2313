package models;

public class Shape {
    // container of Points (e.g. ArrayList<Point>)
    ArrayList<Point> points = new ArrayList<>();

    // addPoint(Point) - adds to the container
    public void addPoint(Point point){
        points.add(point);
    }

    // calculatePerimeter() - calculate and return the perimeter of the shpae
    public double calculatePerimeter(){
        double perimeter = 0;
        int numPoints = points.length;

        for (int i = 0; i < numPoints; i++){
            Point currentPoint = points[i];
            Point nextPoint = points[(i+1) % numPoints]; // Wrap around to the first point

            perimeter += currentPoint.distanceTo(nextPoint);
        }

        return perimeter
    }

    // getAverageSide()  - calculate and return the avg. length of the sides in the shape
    public double getAverageSide(){
        double totalLength = 0;
        int numSides = points.length;

        for (int i = 0; i < numSides; i++){
            Point currentPoint = points[i];
            Point nextPoint = points[(i + 1) % numSides] // Wrap around to the first point

            totalLength += currentPoint.distanceTo(next Point);
        }

        return totalLength / numSides;
    }

    // getLongestSide() - Find and return the length of the longest side in the shape
    public  double getLongestSide(){
        double maxLength = 0;

        for (int i = 0; i < points.length; i++){
            for (int j = 1; j < points.length; j++){
                double distance = points[i].distanceTo(points[j]);
                if (distance > maxLength){
                    maxLength = distance;
                }
            }
        }
        return maxLength;
    }
}
