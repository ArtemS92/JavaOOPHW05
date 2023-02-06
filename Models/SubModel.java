package Models;

public class SubModel extends CalcModel {
    public SubModel() {

    }

    @Override
    public double result() {
        System.out.printf("%f - %f ", x, y);
        return x - y;
    }

    @Override
    public void setX(double value) {
        super.x = value;
    }

    @Override
    public void setY(double value) {
        super.y = value;
    }
}
