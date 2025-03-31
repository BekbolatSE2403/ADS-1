public class TimeComplexity {
    public static void measureTime(Runnable r) {
        long startTime = System.nanoTime();
        r.run();
        long endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) / 1000000.0 + "ms");

    }
}
