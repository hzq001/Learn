package algorithm;

/**
 * @author zq.huang
 * @date 2020/1/7
 */
public class FindDiagonalOrder {

    public static int[] findDiagonalOrderTwo(int[][] matrix) {
        //考虑边界 []
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return new int[0];
        }
        //m行 n列
        int m = matrix.length;
        int n = matrix[0].length;
        //用来记录加入到结果数组的元素的下标
        int count = 0;
        //用来保存结果的数组 大小为矩阵的元素个数
        int [] result = new int[m*n];
        for(int i = 0; i < m+n-1 ; i++){
            //i为0或偶数时 沿对角线向上遍历
            if( i==0 || i%2 ==0){
                //发现规律x+y = i 然后找边界（x坐标超过主对角线时的情况）
                int x = i < m? i : m-1 ;
                int y = i-x;
                //开始遍历 x坐标不断减 y坐标不断加 当x减到0 或者 y加到列n的值
                while(x >= 0 && y < n){
                    result[count] = matrix[x][y];
                    x--;
                    y++;
                    count++;
                }
            }else{
                //沿对角线向下遍历
                int y = i < n? i : n -1 ;
                int x = i-y;
                //y坐标不断减 x坐标不断加 当y减到0 或者 x加到行m的值
                while(y >= 0 && x < m){
                    result[count] = matrix[x][y];
                    y--;
                    x++;
                    count++;
                }
            }
        }
        return result;
    }

    public static int[] findDiagonalOrder(int[][] matrix) {
        // 空判断
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[]{};
        }
        // 高度
        int iNum = matrix.length;
        // 宽度
        int jNum = matrix[0].length;
        // 返回数组
        int[] resultArray = new int[iNum * jNum];
        // 判断是否向上
        boolean isUp = true;

        int i = 0;
        int j = 0;
        int resultIndex = 0;
        // 判断是否完成
        while (j < jNum && i < iNum) {
            if (isUp) {
                // 边界校验
                while (i >= 0 && j >= 0 && i < iNum && j < jNum) {
                    resultArray[resultIndex++] = matrix[i--][j++];
                }
                // 复位
                i++;
                j--;

                // 判断是否越界，没有的话下一个
                if (j + 1 < jNum) {
                    j++;
                } else {
                    i++;
                }
                isUp = false;
            } else {
                while (i >= 0 && j >= 0 && i < iNum && j < jNum) {
                    resultArray[resultIndex++] = matrix[i++][j--];
                }
                i--;
                j++;
                if (i + 1 < iNum) {
                    i++;
                } else {
                    j++;
                }

                isUp = true;
            }
        }


        return resultArray;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                new int[]{1, 2, 3},
                new int[]{4, 5, 6},
                new int[]{7, 8, 9}
        };


        for (int i : findDiagonalOrderTwo(matrix)) {
            System.out.print(i + ",");
        }
    }
}
