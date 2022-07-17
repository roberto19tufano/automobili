package it.contrader.concessionaria.converter;


    import java.util.ArrayList;
import java.util.List;

import it.contrader.concessionaria.DTO.CasaAutomobilisticaDTO;
import Model.Auto;


    public class AutoConverter {

        public CasaAutomobilisticaDTO toDTO(Auto auto) {
            CasaAutomobilisticaDTO casaAutomobilisticaDTO = new CasaAutomobilisticaDTO(auto.getIdAuto(), auto.getNomeModello(), auto.getAnno(),
                    auto.getBrand());
            return casaAutomobilisticaDTO;
        }

        /**
         * Crea un oggetto di tipo Sala e lo riempie con i campi del parametro sala di tipo SalaDTO.
         */
        public Auto toEntity(CasaAutomobilisticaDTO casaAutomobilisticaDTO) {
            Auto auto = new Auto(casaAutomobilisticaDTO.getIdAuto(), casaAutomobilisticaDTO.getNomeModello(), casaAutomobilisticaDTO.getAnno(),
                    casaAutomobilisticaDTO.getBrand());
            return auto;
        }

        /**
         * Metodo per convertire le liste di Sale.
         */
        public List<CasaAutomobilisticaDTO> toDTOList(List<Auto> listaAuto) {
            //Crea una lista vuota.
            List<CasaAutomobilisticaDTO> AutoDTOList = new ArrayList<>();

            //Cicla tutti gli elementi della lista e li converte uno a uno
            for(Auto auto : listaAuto) {
                //Utilizza il metodo toDTO per convertire ogni singolo elemento della lista
                //e lo aggiunge adda lista di DTO
                AutoDTOList.add(toDTO(auto));
            }
            return AutoDTOList;
        }
    }

