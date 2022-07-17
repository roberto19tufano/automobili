package Controller;
import Main.MainDispatcher;
import it.contrader.concessionaria.service.AutoService;

public class CasaAutomobilisticaController implements Controller{
    private AutoService autoService;
    @Override
    public void doControl(Request request) {
        MainDispatcher.getInstance().callView("View", request);

    }


}


