/**
 * Класс, в котором хранятся методы логики самой проги
 * @author Kalenov Nurislam
 * @version 1.0
 * */
public class AllLogic {
/**
 * Умнажает два двумерного массива между собой
 * @return Возврощяет двумерный массив (матрица)
 * @throws ArrayIndexOutOfBoundsException матрицы могут быть не согласованны
 * */
    public  int[][] allLogic(int [][]mA , int[][]mB){
        int a = mA.length;
        int b = mB[0].length;
        int result[][] = new int[a][b];

        try {
            for (int x = 0; x < a; x++) {
               for (int y = 0; y < b; y++) {
                 for (int z = 0; z < a; z++) {
                    result[x][y] += mA[x][z] * mB[z][y];
                }
            }
        }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println();
            System.out.println("Матрицы не соглосованы!!!");
            System.out.println("Операция умножения двух матриц выполнима только в том случае, если число столбцов в первом сомножителе равно числу строк во втором; в этом случае говорят, что матрицы согласованы.");
        }
        System.out.println();
        System.out.println("Матрицы соглосованы");
        return result;
    }

}
