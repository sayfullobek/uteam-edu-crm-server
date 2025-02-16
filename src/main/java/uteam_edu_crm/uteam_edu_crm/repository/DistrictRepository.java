package uteam_edu_crm.uteam_edu_crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import uteam_edu_crm.uteam_edu_crm.entity.District;
import uteam_edu_crm.uteam_edu_crm.projection.CustomDistrict;

@RepositoryRestResource(path = "district", collectionResourceRel = "list", excerptProjection = CustomDistrict.class)
@CrossOrigin
public interface DistrictRepository extends JpaRepository<District, Integer> {
}
