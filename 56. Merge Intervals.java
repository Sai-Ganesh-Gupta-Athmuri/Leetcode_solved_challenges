class Solution {
    public int[][] merge(int[][] arr) {
        int n = arr.length;
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
            }
            else {
                ans.get(ans.size() - 1).set(1,Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
            }
        }
        int numRows = ans.size();
        int[][] array2D = new int[numRows][];
        for (int i = 0; i < numRows; i++) {
            List<Integer> rowList = ans.get(i);
            int numCols = rowList.size();
            array2D[i] = new int[numCols];
            for (int j = 0; j < numCols; j++) {
                array2D[i][j] = rowList.get(j);
            }
        }
        return array2D;
    }
}
