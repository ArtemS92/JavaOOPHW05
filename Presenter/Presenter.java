package Presenter;
import Console.View;
import Models.*;

public class Presenter {
    View view;
    Model model;

    public Presenter(Model m, View v) {
        model = m;
        view = v;
    }

    public void buttonClick() { // метод для ввода данных с консоли и вывода результата
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "=");
    }
}