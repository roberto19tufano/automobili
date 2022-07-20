package Main;

import it.contrader.concessionaria.View.View;
import it.contrader.concessionaria.Controller.Controller;
import it.contrader.concessionaria.Controller.Request;


public class MainDispatcher {


    private MainDispatcher() {
    }

    private static MainDispatcher instance;


    public static MainDispatcher getInstance() {
        if (instance == null) {
            instance = new MainDispatcher();
        }
        return instance;
    }


    public void callAction(String controller, String action, Request request) {
        Controller oggettoController = (Controller) ReflectionUtils
                .instantiateClass("it.contrader.concessionaria.CasaAutomobilisticaController");
          System.out.println("arriva qui");

    }

    public void callView(String view, Request request) {
        View oggettoView = (View) ReflectionUtils.instantiateClass("it.contrader.concessionaria");
        oggettoView.showResults(request);
        System.out.println("arriva qui2");
    }
}
