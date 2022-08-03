package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        
        int i;
        int sum = 0;

        for(i = firstBoarder; i<=secondBoarder; i++){
            sum += i;
        }
        System.out.println(sum);

    }
}
