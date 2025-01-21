package com.nahs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * fileName     : BaekJoon15829
 * author       : HyunSeo Na
 * date         : 2025-01-21
 * description  : 백준 15829 Hashing
 */
public class BaekJoon15829 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());

        String str = br.readLine();

        BigInteger r = new BigInteger("31");
        BigInteger m = new BigInteger("1234567891");

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < 26; i++) {
            map.put((char)(97+i), i+1);
        }

        BigInteger sum = new BigInteger("0");
        for(int i = 0; i < str.length(); i++) {
            BigInteger charValue = new BigInteger(map.get(str.charAt(i)).toString());

            sum = sum.add(charValue.multiply(r.pow((i))));
        }
        sum = sum.mod(new BigInteger(String.valueOf(m)));

        System.out.println(sum);
    }
}
