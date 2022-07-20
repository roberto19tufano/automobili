package it.contrader.concessionaria.service;

import Model.Auto;
import it.contrader.concessionaria.DTO.CasaAutomobilisticaDTO;
import it.contrader.concessionaria.converter.AutoConverter;
import it.contrader.concessionaria.dao.CasaAutomobilisticaDAO;
import it.contrader.concessionaria.dao.CasaAutomobilisticaDAOImpl;

import java.util.List;


public class AutoService {

    private CasaAutomobilisticaDAO casaAutomobilisticaDAO;
    private AutoConverter autoConverter;

    public AutoService() {
        this.casaAutomobilisticaDAO = new CasaAutomobilisticaDAOImpl();
        this.autoConverter = new AutoConverter();
    }

    public AutoService(CasaAutomobilisticaDAO casaAutomobilisticaDAO, AutoConverter autoConverter) {
        this.casaAutomobilisticaDAO = casaAutomobilisticaDAO;
        this.autoConverter = autoConverter;
    }

    public List<CasaAutomobilisticaDTO> getAll() {
        return autoConverter.toDTOList(casaAutomobilisticaDAO.getAll());
    }



    public CasaAutomobilisticaDTO read(int id) {
        return autoConverter.toDTO(casaAutomobilisticaDAO.read(id));
    }







}

/*
public class AutoService {
    private CasaAutomobilisticaDAO casaAutomobilisticaDAO;
    private AutoConverter autoConverter;


    public AutoService(CasaAutomobilisticaDAO casaAutomobilisticaDAO) {
        this.casaAutomobilisticaDAO = casaAutomobilisticaDAO;
    }

    public AutoService() {
        this.casaAutomobilisticaDAO = new CasaAutomobilisticaDAO() {
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
            public CasaAutomobilisticaDTO read(int id) {
                return AutoConverter.toDTO(casaAutomobilisticaDAO.read(id));
            }

        };


    }



}*/
