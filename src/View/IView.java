package View;

import java.util.List;
import Controller.Request;
import it.contrader.concessionaria.DTO.CasaAutomobilisticaDTO;


public interface IView {
    public List<CasaAutomobilisticaDTO> showResults (Request request);


}

