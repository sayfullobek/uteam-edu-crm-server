package uteam_edu_crm.uteam_edu_crm.projection;

import org.springframework.data.rest.core.config.Projection;
import uteam_edu_crm.uteam_edu_crm.entity.Country;

@Projection(name = "customCountry", types = Country.class)
public interface CustomCountry {
    Integer getId();

    String getNameUz();

    String getNameRu();
}
