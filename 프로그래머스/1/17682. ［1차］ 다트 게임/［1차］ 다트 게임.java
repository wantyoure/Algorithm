import java.util.*;

class Solution {
    public int solution(String dartResult) {
       // 기회를 저장할 리스트
        List<Integer> scores = new ArrayList<>();
        
        // 점수를 저장할 변수
        int currentScore = 0;
        
        // 문자열을 순회하며 점수를 계산
        for (int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);
            
            // 숫자일 경우
            if (Character.isDigit(ch)) {
                if (i > 0 && dartResult.charAt(i - 1) == '1' && ch == '0') {
                    currentScore = 10; // 10점 처리
                } else {
                    currentScore = ch - '0'; // 0 ~ 9 점 처리
                }
            } else if (ch == 'S' || ch == 'D' || ch == 'T') {
                // 보너스 처리
                if (ch == 'S') {
                    currentScore = (int) Math.pow(currentScore, 1);
                } else if (ch == 'D') {
                    currentScore = (int) Math.pow(currentScore, 2);
                } else if (ch == 'T') {
                    currentScore = (int) Math.pow(currentScore, 3);
                }
                scores.add(currentScore);
            } else if (ch == '*' || ch == '#') {
                // 옵션 처리
                if (ch == '*') {
                    if (scores.size() > 1) {
                        // 현재 점수와 이전 점수 모두 2배
                        scores.set(scores.size() - 1, scores.get(scores.size() - 1) * 2);
                        scores.set(scores.size() - 2, scores.get(scores.size() - 2) * 2);
                    } else {
                        // 첫 번째 점수만 2배
                        scores.set(scores.size() - 1, scores.get(scores.size() - 1) * 2);
                    }
                } else if (ch == '#') {
                    // 현재 점수 마이너스
                    scores.set(scores.size() - 1, scores.get(scores.size() - 1) * -1);
                }
            }
        }
        
        // 최종 점수 합산
        return scores.stream().mapToInt(Integer::intValue).sum();
    }
}


//총 3번의 기회
// 각 기회마다 얻을 수 있는 점수는 0점에서 10점 
//s 1제곱, d 2제곱, t 3제곱
//