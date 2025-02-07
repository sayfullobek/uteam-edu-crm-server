package uteam_edu_crm.uteam_edu_crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import uteam_edu_crm.uteam_edu_crm.entity.Region;
import uteam_edu_crm.uteam_edu_crm.projection.CustomRegion;

@RepositoryRestResource(path = "region", collectionResourceRel = "list", excerptProjection = CustomRegion.class)
@CrossOrigin
public interface RegionRepository extends JpaRepository<Region, Integer> {
    // @Query("SELECT new uteam_edu_crm.uteam_edu_crm.dto.CustomRegionDTO(r.id,
    // r.name_uz, r.name_ru, r.country.id) FROM Region r")
    // List<CustomRegionDTO> getAllRegions();

}
