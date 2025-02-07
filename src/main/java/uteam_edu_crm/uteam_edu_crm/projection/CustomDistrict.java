package uteam_edu_crm.uteam_edu_crm.projection;

import org.springframework.data.rest.core.config.Projection;
import uteam_edu_crm.uteam_edu_crm.entity.District;

@Projection(name = "customDistrict", types = District.class)
public interface CustomDistrict {
    Integer getId();

    String getName();

    Integer getRegionId();
}
