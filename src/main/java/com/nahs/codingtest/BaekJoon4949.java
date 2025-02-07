package com.nahs.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * fileName     : BaekJoon4949
 * author       : HyunSeo Na
 * date         : 2025-02-07
 * description  : 백준 4949
 * https://www.acmicpc.net/problem/4949
 */
public class BaekJoon4949 {
    public static void main(String[] args) throws IOException {
        /*
        while(다음 문자열이 비어 있기 전)
            문자열이 "."이면 break;

            for 문자열 길이만큼
                한 글자씩 읽기
                글자가 '.'이면
                    결과 출력 ( 스택이 비어 있지 않으면 no)


                if 왼쪽 괄호 "(", "["
                    stack push
                else if 오른쪽 괄호 ")", "]"
                    스택이 이미 비어있으면 No
                    스택이 비어있지 않으면
                        stack peep
                        괄호 짝이 맞으면 yes & pop
                        괄호 짝이 맞지 않으면 no

         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while( (line = br.readLine()) != null) {
            Stack<String> stack = new Stack<>();
            if (".".equals(line)) {
                break;
            }

            String result = "yes";

            for(int i=0; i<line.length(); i++) {
                char ch = line.charAt(i);

                if('.' == ch) {
                    if(!stack.isEmpty()) result = "no";

                    System.out.println(result);
                }

                if( '[' == ch || '(' == ch) {
                    stack.push(String.valueOf(ch));
                } else if(']' == ch || ')' == ch) {
                    if(!stack.isEmpty()) {
                        String peek = stack.peek();
                        if(']' == ch) {
                            if(!"[".equals(peek)) result = "no";
                            else stack.pop();
                        } else if (')' == ch) {
                            if(!"(".equals(peek)) result = "no";
                            else stack.pop();
                        }
                    } else {
                        result = "no";
                    }
                }
            } // for end
        }
    }
}
