package by.Rabtsevich.task21;

public class SpeedTestOfStringOperations {

    public static void main(String[] args) {
        compareStringsConcat(testSpeedOfString(), testSpeedOfStringBuilder());

    }

    static long testSpeedOfString() {
        String  str = "0";
        for(int i = 1; i < 100000; i++) {
            str+=i;
        }
        long x = System.nanoTime();
        System.out.println("String length: " + str.length());
        System.out.println("Total time: " + x/1E6 + " ms");
        return x;
    }

    static long testSpeedOfStringBuilder() {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < 100000; i++) {
            str.append(i);
        }
        long x = System.nanoTime();
        System.out.println("StringBuilder length: " + str.length());
        System.out.println("Total time: " + x/1E6 + " ms");
        return x;
    }

    static void compareStringsConcat(long speed1, long speed2) {
        System.out.println("StringBuilder быстрее String на: " + (speed2-speed1)/1E6 + " ms");
    }
}
