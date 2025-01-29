package uteam_edu_crm.uteam_edu_crm.entity;

import uteam_edu_crm.uteam_edu_crm.entity.template.AbsEntity;
import uteam_edu_crm.uteam_edu_crm.entity.template.AbsNameEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Education extends AbsEntity {
    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String photo; //logo

    @Column(nullable = false, length = 10000)
    private String slogan;

}
