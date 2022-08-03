package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {

        int n0 = 0, n1 = 1, n2, i;
        System.out.println(n0);
        System.out.println(n1);

        for(i=2; i<lastFibonacci; i++){
            n2 = n0 + n1;
            System.out.println(n2);
            n0=n1;
            n1=n2;

        }
    }
}
