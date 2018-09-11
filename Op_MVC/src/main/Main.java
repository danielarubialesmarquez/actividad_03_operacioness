
package main;

import view.viewOpe;
import model.ModelOpe;
import controllers.controllerOpe;

public class Main {
    private static viewOpe viewOpe;
    private static ModelOpe modelOpe;
    private static controllerOpe controllerOpe;

    public static void main(String[] args)
    {
        viewOpe = new viewOpe();
        modelOpe = new ModelOpe();
        controllerOpe = new controllerOpe(viewOpe, modelOpe);
    }
}
    

