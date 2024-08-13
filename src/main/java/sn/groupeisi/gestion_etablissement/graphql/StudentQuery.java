package sn.groupeisi.gestion_etablissement.graphql;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import sn.groupeisi.gestion_etablissement.model.Departement;
import sn.groupeisi.gestion_etablissement.repository.DepartementRepositorie;

import java.util.List;

@Component
@AllArgsConstructor
public class StudentQuery implements GraphQLQueryResolver{
    private DepartementRepositorie departementRepositorie;

    public void DepartmentQuery(DepartementRepositorie departementRepositorie) {

        this.departementRepositorie = departementRepositorie;
    }

    public List<Departement> allDepartments() {
        return departementRepositorie.findAll();
    }
}
