package sn.groupeisi.gestion_etablissement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.groupeisi.gestion_etablissement.model.Etudiant;

public interface EtudiantRepositorie extends JpaRepository<Etudiant, Long> {
}
