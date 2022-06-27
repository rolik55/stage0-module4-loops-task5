package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int count = height;
        for(int i=0;i<height;i++){
            for(int j=0;j<(height-count)/2;j++)
                System.out.print(" ");
            for (int j=0;j<count;j++){
                System.out.print(8);
            }
            for(int j=0;j<(height-count)/2;j++)
                System.out.print(" ");
            if(i<height/2 && count > 2)
                count-=2;
            else if (i>=height/2 && count<height)
                count+=2;
            System.out.println();
        }
    }
}
