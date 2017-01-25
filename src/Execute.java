/**
 * Класс, который собирает и выполняет по очереди все методы;
 * @author Kalenov Nurislam
 * @version 1.0
 * */
public class Execute {
    public Execute(int xValueFirstMatrix , int yValueFirstMatrix, int xValueSecondMatrix , int yValueSecondMatrix ){
        AllLogic thereAllLogic = new AllLogic();
        UI ui = new UI();
        int[][] x = ValueMatrix.fillMatrixRandomValue( xValueFirstMatrix ,yValueFirstMatrix);
        int[][] y = ValueMatrix.fillMatrixRandomValue(xValueSecondMatrix, yValueSecondMatrix);

        ui.showMatrix(x, "Первая матрица");
        ui.showMatrix(y, "Вторая матрица");
        ui.showMatrix(thereAllLogic.allLogic(x ,y), "Результат :");
    }
}
