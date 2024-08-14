package sn.groupeisi.gestion_etablissement.resolverGraphql;

import graphql.kickstart.annotations.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import sn.groupeisi.gestion_etablissement.model.Etudiant;
import sn.groupeisi.gestion_etablissement.service.EtudiantService;

import java.lang.annotation.Annotation;
import java.util.List;

@AllArgsConstructor
@Component
public class EtudiantResolver implements GraphQLQueryResolver {

    private final EtudiantService etudiantService;

    public List<Etudiant> getAllEtudiant() {
            return etudiantService.getAllEtudiant();
        }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}

// Ce résolveur est utilisé pour gérer les requêtes GraphQL définies dans le schéma.



