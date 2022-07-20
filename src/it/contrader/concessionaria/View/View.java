package it.contrader.concessionaria.View;
import java.util.List;

import it.contrader.concessionaria.Controller.Request;
import it.contrader.concessionaria.DTO.CasaAutomobilisticaDTO;

public class View extends AbstractView{
    private Request request;
    private String choice;

    public View() {
        System.out.println("arriva qui");
    }
    @Override
    public List<CasaAutomobilisticaDTO> showResults1(Request request) {
            System.out.println("\n------------------ Ecco le auto:----------------\n");
            System.out.println("----------------------------------------------------\n");
            @SuppressWarnings("unchecked")
            List<CasaAutomobilisticaDTO> autoDTOList = (List<CasaAutomobilisticaDTO>) request.get("films");
            for (CasaAutomobilisticaDTO CasaAutomobilisticaDTO : autoDTOList)
                System.out.println(CasaAutomobilisticaDTO);
            System.out.println();
            return autoDTOList;
        }

    @Override
    public void showResults(Request request) {

    }

    @Override
    public void showOptions() {

    }


}