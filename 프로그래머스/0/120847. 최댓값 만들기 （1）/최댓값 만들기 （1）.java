class Solution {
    public int solution(int[] numbers) {
        for(int i=0;i<numbers.length;i++){
            for(int j=1;j<numbers.length;j++){
                if(numbers[j]>numbers[j-1]){
                    int tmp = numbers[j];
                    numbers[j] = numbers[j-1];
                    numbers[j-1] = tmp;
                }
            }
        }
        return numbers[0]*numbers[1];
    }
}

// 다른 풀이
import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers); // 정렬 메서드 사용

        return numbers[numbers.length-1]*numbers[numbers.length-2];
    }
}
