class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int[] dy = {0, 1, 0, -1};
        int[] dx = {1, 0, -1, 0};

        int y = 0;
        int x = 0;
        int dir = 0;

        for (int num = 1; num <= n*n; num++) {
            answer[y][x] = num;

            int ny = y + dy[dir];
            int nx = x + dx[dir];

            if (ny < 0 || ny >= n || nx < 0 || nx >= n || answer[ny][nx] != 0) {
                dir = (dir + 1) % 4;
                ny = y + dy[dir];
                nx = x + dx[dir];
            }
            y = ny;
            x = nx;
        }

        return answer;
    }
}

/*
1. 현재 위치 값 저장
2. 다음 좌표 계산
3. 범위 + 방문 체크
4. 필요 시 방향 전환
5. 실제 좌표 이동
*/