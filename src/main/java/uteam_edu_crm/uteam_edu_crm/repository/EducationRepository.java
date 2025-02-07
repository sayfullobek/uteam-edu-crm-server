package uteam_edu_crm.uteam_edu_crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import uteam_edu_crm.uteam_edu_crm.entity.Education;
import uteam_edu_crm.uteam_edu_crm.projection.CustomEducation;

import java.util.UUID;

@RepositoryRestResource(path = "education", collectionResourceRel = "list", excerptProjection = CustomEducation.class)
@CrossOrigin
public interface EducationRepository extends JpaRepository<Education, UUID> {
}
