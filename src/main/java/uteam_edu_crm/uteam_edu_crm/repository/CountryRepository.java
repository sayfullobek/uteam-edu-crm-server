package uteam_edu_crm.uteam_edu_crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import uteam_edu_crm.uteam_edu_crm.entity.Country;
import uteam_edu_crm.uteam_edu_crm.projection.CustomCountry;

@RepositoryRestResource(path = "country", collectionResourceRel = "list", excerptProjection = CustomCountry.class)
@CrossOrigin
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
