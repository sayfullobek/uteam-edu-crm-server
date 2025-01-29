package uteam_edu_crm.uteam_edu_crm.projection;

import org.springframework.data.rest.core.config.Projection;
import uteam_edu_crm.uteam_edu_crm.entity.Region;

@Projection(name = "customRegion", types = Region.class)
public interface CustomRegion {
    Integer getId();

    String getName();

    Integer getCountryId();
}
