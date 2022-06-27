package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength) {
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (i == 0 || i == sideLength - 1 || j == 0 || j == sideLength - 1)
                    System.out.print(8);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
