package it.contrader.concessionaria.service;

import Model.Auto;
import it.contrader.concessionaria.dao.CasaAutomobilisticaDAO;

import java.util.List;

public class AutoService {
    private CasaAutomobilisticaDAO dao;

    public AutoService(CasaAutomobilisticaDAO dao) {
        this.dao = dao;
    }

    public AutoService() {
        this.dao = new CasaAutomobilisticaDAO() {
            @Override
            public List<Auto> listaAuto() {
                return null;
            }

            @Override
            public boolean addAuto(Auto p) {
                return false;
            }

            @Override
            public Auto deleteAuto(int indice) {
                return null;
            }
        };

    }
}
