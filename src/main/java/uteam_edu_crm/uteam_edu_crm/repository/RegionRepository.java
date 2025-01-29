package uteam_edu_crm.uteam_edu_crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uteam_edu_crm.uteam_edu_crm.entity.Country;
import uteam_edu_crm.uteam_edu_crm.entity.Region;
import uteam_edu_crm.uteam_edu_crm.projection.CustomCountry;
import uteam_edu_crm.uteam_edu_crm.projection.CustomRegion;

@RepositoryRestResource(path = "region", collectionResourceRel = "list", excerptProjection = CustomRegion.class)
public interface RegionRepository extends JpaRepository<Region, Integer> {
}
