package String;

public class ShortestPath {

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println("Shortest Path: " + getShortestPath(path));
    }

    public static double getShortestPath(String path) {
        int x = 0, y = 0;

        for (char direction : path.toCharArray()) {
            switch (direction) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }
        }

        int X2 = x * x;
        int Y2 = y * y;
        return Math.sqrt(X2 + Y2);
    }
}