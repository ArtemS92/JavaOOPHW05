package Models;

public class DivModel extends CalcModel {
    public DivModel() {

    }

    // do_it
    @Override
    public int result() {
        System.out.printf("%d / %d ", x, y);
        return x / y;
    }

    @Override
    public void setX(int value) {
        super.x = value;
    }

    @Override
    public void setY(int value) {
        super.y = value;
    }
}