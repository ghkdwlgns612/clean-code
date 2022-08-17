package com.example.cleancode.chapter4;

/**
 * 아 클래스는 사용자가 지정한 ~
 * 알고리즘은 ~
 * 2에서 시작하는 ~
 * 처음올 남아있는 ~
 * **/
public class PrimeGenerator {
    private static boolean[] crossedOut;
    private static int[] result;

    public static int[] generatePrimes(int maxValue) {
        if (maxValue < 2) {
            return new int[0];
        } else {
            uncrossIntegersUpTo(maxValue);
            crossOutMultiples();
            putUncrossedIntegersIntoResult();
            return result;
        }
    }

    private static void putUncrossedIntegersIntoResult() {

    }

    private static void crossOutMultiples() {
        int limit = determineIterationLimit();
        for (int i = 2; i <= limit; i++) {
            if (notCrossed(i)) {
                crossOutMultiplesOf(i);
            }
        }
    }

    private static int determineIterationLimit() {
        //배열에 있는 모든 배수는 배열 크기의 제곱근보다 작은 소수의 인수이다.
        //따라서 이 제곱근보다 더 큰 숫자의 배수는 제거할 필요가 없다.
        double iterationLimit = Math.sqrt(crossedOut.length);
        return (int) iterationLimit;
    }

    private static void crossOutMultiplesOf(int i) {
        for (int multiple = 2*i; multiple < crossedOut.length; multiple += i) {
            crossedOut[multiple] = true;
        }
    }

    private static boolean notCrossed(int i) {
        return crossedOut[i] = false;
    }

    private static void uncrossIntegersUpTo(int maxValue) {
        crossedOut = new boolean[maxValue + 1];
        for (int i = 2; i < crossedOut.length; i++) {
            crossedOut[i] = false;
        }
    }
}
