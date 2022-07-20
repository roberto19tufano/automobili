package it.contrader.concessionaria.dao;

import Model.Auto;

import java.util.ArrayList;
import java.util.List;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Main.SessionSingleton;
import Model.Auto;


public class CasaAutomobilisticaDAOImpl implements CasaAutomobilisticaDAO{

    private final String QUERY_ALL = "SELECT * FROM auto";

    private final String QUERY_ALL_AUTO = "SELECT * FROM auto";

    private final String QUERY_READ = "SELECT * FROM auto WHERE id=?";


    public CasaAutomobilisticaDAOImpl() {
    }

    public List<Auto> getAll() {
        List<Auto> autoList = new ArrayList<>();
        Connection session = SessionSingleton.getInstance();
        try {
            Statement statement = session.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY_ALL);
            Auto auto;
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nomeModello = resultSet.getString("nomeModello");
                int anno = resultSet.getInt("anno");
                String brand = resultSet.getString("brand");

                auto = new Auto(id, nomeModello, anno, brand);
                auto.setId(id);
                autoList.add(auto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return autoList;
    }
@Override
    public Auto read(int id) {
        Connection session = SessionSingleton.getInstance();
        try {
            PreparedStatement preparedStatement = session.prepareStatement(QUERY_READ);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            int anno;
            String  nomeModello, brand;

            id = resultSet.getInt("id");
            nomeModello = resultSet.getString("nomeModello");
            anno = resultSet.getInt("anno");
            brand = resultSet.getString("brand");

            Auto auto = new Auto( id, nomeModello, anno, brand);
            auto.setId(resultSet.getInt("id"));

            return auto;
        } catch (SQLException e) {
            return null;
        }

        }

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
}




/*
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
}*/
