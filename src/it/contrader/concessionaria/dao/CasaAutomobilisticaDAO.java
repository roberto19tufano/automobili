package it.contrader.concessionaria.dao;
import Model.Auto;

import java.util.List;

public interface CasaAutomobilisticaDAO {
    public default Auto read(int id) {
        return null;
    }

    public List<Auto> listaAuto();
    public boolean addAuto (Auto p);
    public Auto deleteAuto (int indice);

    List<Auto> getAll();
}

