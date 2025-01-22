package com.nahs.study;

import java.math.BigInteger;
import java.util.Random;

/**
 * fileName     : BigIntegerEx
 * author       : HyunSeo Na
 * date         : 2025-01-22
 * description  : BigInteger 예제
 */
public class BigIntegerEx {
    public static void main(String[] args) {
        /* 문자열을 통한 생성 */
        BigInteger a = new BigInteger("12345678901234567890123456789012345678901234567890");
        System.out.println(a);

        /* 정수를 통해 생성 */
        BigInteger b = BigInteger.valueOf(1);
        System.out.println(b);

        /* 진수를 지정하여 생성 */
        BigInteger c = new BigInteger("FF", 16);
        System.out.println(c);

        /* Random 숫자 생성 */
        BigInteger d = new BigInteger(128, new Random());       // 128 비트의 무작위 정수
        System.out.println(d);

        /* 사칙연산 */
        BigInteger num1 = new BigInteger("100");
        BigInteger num2 = new BigInteger("200");

        BigInteger add = num1.add(num2);
        System.out.println(add);
        BigInteger sub = num1.subtract(num2);
        System.out.println(sub);
        BigInteger mul = num1.multiply(num2);
        System.out.println(mul);
        BigInteger div = num1.divide(num2);
        System.out.println(div);
        BigInteger mod = num1.mod(num2);
        System.out.println(mod);

        /* 비교 */
        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(b));

        /* 거듭제곱, 제곱근 */
        BigInteger pow = new BigInteger("2");
        BigInteger powResult = pow.pow(10);     // 2024
        System.out.println(powResult);

        BigInteger sqrt = new BigInteger("25");
        BigInteger sqrtResult = sqrt.sqrt();            // 5
        System.out.println(sqrtResult);

        /* 최대 공약수 */
        BigInteger gcd = num1.gcd(num2);
        System.out.println(gcd);

        /* 소수 별 및 소수 생성 */
        BigInteger prime = new BigInteger("13");
        System.out.println(prime.isProbablePrime(10));    // 소수인지 판별(certainty - 1: 최소 신뢰도, 값이 클수록 신뢰도가 높음)
        System.out.println(prime.nextProbablePrime());              // 현재 값 보다 큰 다음 소수를 반환

        /* 비트 연산 */
        BigInteger bits1 = new BigInteger("101", 2);
        BigInteger bits2 = new BigInteger("111", 2);
        BigInteger bitsResult = bits1.and(bits2);
    }
}
