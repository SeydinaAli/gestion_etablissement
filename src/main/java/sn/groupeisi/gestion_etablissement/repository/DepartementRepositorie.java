package sn.groupeisi.gestion_etablissement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.groupeisi.gestion_etablissement.model.Departement;

public interface DepartementRepositorie extends JpaRepository<Departement, Long> {
}
