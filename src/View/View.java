package View;

import Controller.Request;
import it.contrader.concessionaria.DTO.CasaAutomobilisticaDTO;
import Main.MainDispatcher;

public class View implements IView {

    private Request request;
    private int idAuto;

    public View() {
    }

    @Override
    public Void showResults(Request request) {
         {
            CasaAutomobilisticaDTO auto = (CasaAutomobilisticaDTO) request.get("auto");
            System.out.println(auto);
            MainDispatcher.getInstance().callView("Auto", null);
        }
        return null;
    }



}
