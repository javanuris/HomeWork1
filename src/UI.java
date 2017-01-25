/**
 * Класс , отвечающая за интерфейс программы (консоль);
 * @author Kalenov Nurislam
 * @version 1.0
 * */
public class UI {

/**
 * Метод отрисовывает интерфейс программы
 * */
    public  void showMatrix(int result[][], String nameMatrix) {
        System.out.println();
        System.out.println(nameMatrix);
        for (int x = 0; x < result.length; x++) {
            System.out.println("--------------------------------");
            for (int y = 0; y < result[0].length; y++) {
                System.out.print("|");
                System.out.format("%6d ", +result[x][y]);
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.print("--------------------------------");
    }


}
