class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> out = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        int up = 0;
        int down = n - 1;
        int left = 0;
        int right = m - 1;

        while (up <= down && left <= right) {

            // 1. Left â Right
            for (int j = left; j <= right; j++) {
                out.add(matrix[up][j]);
            }
            up++;

            // 2. Top â Bottom
            for (int i = up; i <= down; i++) {
                out.add(matrix[i][right]);
            }
            right--;

            // 3. Right â Left
            if (up <= down) {
                for (int j = right; j >= left; j--) {
                    out.add(matrix[down][j]);
                }
                down--;
            }

            // 4. Bottom â Top
            if (left <= right) {
                for (int i = down; i >= up; i--) {
                    out.add(matrix[i][left]);
                }
                left++;
            }
        }

        return out;
    }
}