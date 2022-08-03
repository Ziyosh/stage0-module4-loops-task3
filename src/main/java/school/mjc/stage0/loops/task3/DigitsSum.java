package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){

        int sum;
        int k;


        for(sum=0; t!=0; t=t/10) {
            if (t <= 0 || t >= 0) {
                k = t % 10;
                sum += k;
            }
        }
            System.out.println(sum);
    }
}
