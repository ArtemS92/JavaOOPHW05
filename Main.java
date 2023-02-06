import Console.View;
import Models.*;
import Presenter.Presenter;

public class Main {
    public static void main(String[] args) {
        View v = new View();
        int choice = v.getChoice();// Выбор оерации
        switch (choice) {
            case 1 -> {
                Presenter p = new Presenter(new SumModel(), v);// Сложение
                p.buttonClick();
            }
            case 2 -> {
                Presenter p = new Presenter(new SubModel(), v);//Вычитание
                p.buttonClick();
            }
            case 3 -> {
                Presenter p = new Presenter(new MultModel(), v);//Умножение
                p.buttonClick();
            }
            case 4 -> {
                Presenter p = new Presenter(new DivModel(), v);// Деление
                p.buttonClick();
            }
        }
    }
}
