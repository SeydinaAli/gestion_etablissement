package sn.groupeisi.gestion_etablissement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.groupeisi.gestion_etablissement.model.Etudiant;
import sn.groupeisi.gestion_etablissement.repository.EtudiantRepositorie;

import java.util.List;

@Service
public class EtudiantService {

        @Autowired
        private EtudiantRepositorie etudiantRepositorie;

        public List<Etudiant> getAllEtudiant() {
            return etudiantRepositorie.findAll();
        }
    }


