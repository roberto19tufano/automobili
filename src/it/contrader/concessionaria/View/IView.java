package it.contrader.concessionaria.View;

import java.util.List;
import it.contrader.concessionaria.Controller.Request;
import it.contrader.concessionaria.DTO.CasaAutomobilisticaDTO;


public interface IView {
    public List<CasaAutomobilisticaDTO> showResults1 (Request request);
    public void showResults (Request request);
    public void showOptions ();




}

