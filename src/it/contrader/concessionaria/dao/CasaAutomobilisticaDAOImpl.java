package it.contrader.concessionaria.dao;

import Model.Auto;

import java.util.ArrayList;
import java.util.List;

public class CasaAutomobilisticaDAOImpl implements CasaAutomobilisticaDAO {
    private List <Auto> autos   ;
    public CasaAutomobilisticaDAOImpl() {
        autos = new ArrayList<Auto>();
        autos.add (new Auto(1,"punto",2016,"fiat"));
        autos.add (new Auto(2,"stonic",2018,"kia"));
    }

    @Override
    public List<Model.Auto> listaAuto() {
        return autos;
    }

    @Override
    public boolean addAuto(Model.Auto p) {
        return autos.add(p);
    }
    @Override
    public Auto deleteAuto(int indice) {
        return autos.remove(indice);
    }
}
