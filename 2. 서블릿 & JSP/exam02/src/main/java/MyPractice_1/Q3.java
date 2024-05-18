package MyPractice_1;

import java.util.stream.IntStream;

public class Q3 {
    public static void main(String[] args) {
        long numerator = combination(46, 6); // 46개 중에서 6개를 선택하는 경우의 수
        System.out.println("조합의 수: " + numerator);

        long denominator = (long) Math.pow(46, 6); // 가능한 모든 조합의 수
        System.out.println("전체 경우의 수: " + denominator);

        double probability = (double) numerator / denominator; // 확률 계산
        System.out.println("확률: " + probability);
    }

    public static long combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
