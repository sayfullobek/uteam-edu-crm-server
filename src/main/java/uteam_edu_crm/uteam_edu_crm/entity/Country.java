package uteam_edu_crm.uteam_edu_crm.entity;

import uteam_edu_crm.uteam_edu_crm.entity.template.AbsNameEntity;
import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Country extends AbsNameEntity {
}
