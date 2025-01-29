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
public class Forpupil extends AbsEntity {
    @Column(name = "for_pupil_father_number", nullable = false)
    private String fatherNumber;

    @Column(name = "for_pupil_father_username", unique = true)
    private String fatherUsername;

    @Column(name = "for_pupil_mather_number", nullable = false)
    private String matherNumber;

    @Column(name = "for_pupil_mather_username", unique = true)
    private String matherUsername;
}
