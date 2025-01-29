package uteam_edu_crm.uteam_edu_crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uteam_edu_crm.uteam_edu_crm.entity.Country;
import uteam_edu_crm.uteam_edu_crm.entity.Room;
import uteam_edu_crm.uteam_edu_crm.projection.CustomCountry;
import uteam_edu_crm.uteam_edu_crm.projection.CustomRoom;

@RepositoryRestResource(path = "country", collectionResourceRel = "list", excerptProjection = CustomCountry.class)
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
