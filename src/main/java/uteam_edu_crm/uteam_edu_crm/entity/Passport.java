package uteam_edu_crm.uteam_edu_crm.entity;

import uteam_edu_crm.uteam_edu_crm.entity.template.AbsEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Passport extends AbsEntity {
    @Column(name = "passport_jshshr", unique = true)
    private String jshshr;

    @Column(name = "passport_seriya")
    private String seriya;
    @Column(name = "passport_number")
    private String number;
}
