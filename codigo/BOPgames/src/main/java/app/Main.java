package app;

import view.CiclistaView;
import controller.CiclistaController;

public class Main {
    public static void main(String[] args) {
        CiclistaView view = new CiclistaView();
        CiclistaController controller = new CiclistaController(view);

        view.setController(controller);

        controller.iniciar();
    }
}
