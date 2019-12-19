import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int rows = 6;
        int cols = 7;

        int[][] array = new int[rows][cols];
        fillArray(array);
        printArray(array);
        biggestToFirst(array);
        printArray(array);

        Point a = new Point(2, 6);
        Point b = new Point(3, 2);

        Rect rect = new Rect(a, b);

        System.out.println(Utils.area(rect));
        System.out.println(Utils.perimeter(rect));
        System.out.println(Utils.distance(a, b));


    }

    public static void printArray (int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fillArray(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
    }

    public static void biggestToFirst(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int maxIndex = 0;
            for (int j = 1; j < array[i].length; j++){
                if (array[i][j] > array[i][maxIndex]){
                    maxIndex = j;
                }
            }

            if (maxIndex != 0){
                int tmp = array[i][0];
                array[i][0] = array[i][maxIndex];
                array[i][maxIndex] = tmp;
            }
        }
    }
}
