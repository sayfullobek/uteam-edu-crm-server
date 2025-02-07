package uteam_edu_crm.uteam_edu_crm.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ResRegion {
    private Integer id;
    private String nameUz;
    private String nameRu;
    private Integer countryId;
}
