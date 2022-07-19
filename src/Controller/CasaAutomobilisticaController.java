package Controller;
import Main.MainDispatcher;
import it.contrader.concessionaria.service.AutoService;

public class CasaAutomobilisticaController implements Controller {

    private static String sub_package = "auto.";

    private AutoService autoService;

    public CasaAutomobilisticaController() {
        this.autoService = new AutoService();
    }


    @Override
    public void doControl(Request request) {
        MainDispatcher.getInstance().callView("View", request);

    }


}


