/*
->Given a 2D integer array matrix, return the transpose of matrix.
->The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
*/

class transpose_matrix {
    public int[][] transpose(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] ans=new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[j][i]=matrix[i][j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        transpose_matrix obj = new transpose_matrix();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] ans = obj.transpose(matrix);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
 
/*
->Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]

->Example 2:

Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]
*/  