package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 0; j < cathetusLength; j++) {
                if (j <= i)
                    System.out.print(8);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
