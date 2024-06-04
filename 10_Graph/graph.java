class graph{
public static void main(String[]  k){
int n=5;
int arr[][]={{1,2},{2,3},{2,4},{3,4},{4,5},{5,1}};
int mat[][]=new int[n+1][n+1];
for(int i=0;i<arr.length;i++){
int x=arr[i][0];
int y=arr[i][1];
mat[x][y]=1;
mat[y][x]=1;
}
for(int i=1;i<n+1;i++){
for(int j=1;j<n+1;j++){
System.out.print(mat[i][j]+" ");
}
System.out.println();
}
}
}

