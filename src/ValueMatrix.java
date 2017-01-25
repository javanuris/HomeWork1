import java.util.Random;
/**
 * Интерфейс , содержит только единсвенный статик метод;
 * @author Kalenov Nurislam
 * @version 1.0
 * */
public interface ValueMatrix {
/**
 * Рандом генерирует значение в двумерном массиве
 * @return Возврощяет двумерный массив
 * */
 static int[][] fillMatrixRandomValue(int x, int y) {
        int[][] m = new int[x][y];
        Random random = new Random();
        for (int f = 0; f < m.length; f++) {
            for (int d = 0; d < m[f].length; d++) {
                m[f][d] =random.nextInt(100) + 1;
            }
        }
        return m;
    }

}
