package sn.groupeisi.gestion_etablissement.graphql;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import sn.groupeisi.gestion_etablissement.model.Etudiant;
import sn.groupeisi.gestion_etablissement.repository.EtudiantRepositorie;

import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
public class DepartmentQuery  implements GraphQLQueryResolver{
    private EtudiantRepositorie etudiantRepositorie;

    public void StudentQuery(EtudiantRepositorie etudiantRepositorie) {
        this.etudiantRepositorie = etudiantRepositorie;
    }

    public List<Etudiant> allStudents() {
        return etudiantRepositorie.findAll();
    }

    public Optional<Etudiant> studentById(Long id) {
        return etudiantRepositorie.findById(id);
    }
}
