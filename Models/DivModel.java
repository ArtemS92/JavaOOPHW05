package Models;

public class DivModel implements Model {// Наследование от интерфейса, а не от абстрактного класса
    public DivModel() {

    }
    double x,y; // добавление переменных после удаления абстрактного класса CalcModel


    @Override
    public double result() {
        System.out.printf("%f / %f ", x, y);
        return x / y;
    }

    @Override
    public void setX(double value) {
        this.x = value;
    }

    @Override
    public void setY(double value) {
        this.y = value;
    }
}
