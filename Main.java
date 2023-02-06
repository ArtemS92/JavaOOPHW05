import Console.View;
import Models.*;
import Presenter.Presenter;

public class Main {
    public static void main(String[] args) {
        View v = new View();
        int choice = v.getChoice();
        switch (choice) {
            case 1 -> {
                Presenter p = new Presenter(new SumModel(), v);
                p.buttonClick();
            }
            case 2 -> {
                Presenter p = new Presenter(new SubModel(), v);
                p.buttonClick();
            }
            case 3 -> {
                Presenter p = new Presenter(new MultModel(), v);
                p.buttonClick();
            }
            case 4 -> {
                Presenter p = new Presenter(new DivModel(), v);
                p.buttonClick();
            }
        }
    }
}
