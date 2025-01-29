package uteam_edu_crm.uteam_edu_crm.projection;

import org.springframework.data.rest.core.config.Projection;
import uteam_edu_crm.uteam_edu_crm.entity.Education;

import java.util.UUID;

@Projection(name = "customEducation", types = Education.class)
public interface CustomEducation {
    UUID getId();

    String getName();

    String getPhoto();

    String getSlogan();
}
