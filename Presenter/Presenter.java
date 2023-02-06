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
        double a = view.getValue("a: ");
        double b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        double result = model.result();
        view.print(result, "=");
    }
}