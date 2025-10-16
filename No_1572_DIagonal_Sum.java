class No_1572_DIagonal_Sum {
    public int diagonalSum(int[][] mat) {
        int sum=0;int d=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==j || (i+j==mat.length-1) ){
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
}
