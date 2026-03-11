class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = calculate(num_list.length, n);
        int [] answer =  new int [size];
        int cnt = 0;
        for(int i = 0; i < num_list.length; i += n) {
            answer[cnt++] = num_list[i];
        }
        return answer;
    }
    
    private int calculate(int length, int n) {
        int count = 0;
        for (int i = 1; i <= length; i += n) {
            count ++;
        }
        System.out.println(count);
        return count;
    }
}

/*
num_list의 idx 0 부터 n 간격으로 value를 담은 배열 return
배열의 크기가 입력에 따라 달라질 수 있음
*/