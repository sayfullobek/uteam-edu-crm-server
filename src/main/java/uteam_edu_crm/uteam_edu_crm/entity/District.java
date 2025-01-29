package uteam_edu_crm.uteam_edu_crm.entity;

import jakarta.persistence.JoinColumn;
import uteam_edu_crm.uteam_edu_crm.entity.template.AbsNameEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class District extends AbsNameEntity {
    @ManyToOne(optional = false)
    @JoinColumn(name = "district_region_id", referencedColumnName = "id")
    private Region region;
}