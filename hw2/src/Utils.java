public class Utils {
    private Utils() {}

    public static int area (Rect rect){
        Point a = rect.getTopLeft();
        Point b = rect.getBottomRight();
        return (a.getY() - b.getY()) * (b.getX() - a.getX());
    }

    public static int perimeter (Rect rect){
        Point a = rect.getTopLeft();
        Point b = rect.getBottomRight();
        return (a.getY() - b.getY() + b.getX() - a.getX()) * 2;
    }

    public static double distance (Point a, Point b){
        int x = Math.abs(a.getX() - b.getX());
        int y = Math.abs(a.getY() - b.getY());
        return Math.sqrt(x * x + y * y);
    }
}
