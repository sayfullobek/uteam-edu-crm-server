package uteam_edu_crm.uteam_edu_crm.entity;

import uteam_edu_crm.uteam_edu_crm.entity.template.AbsEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Course extends AbsEntity {
    @Column(name = "course_name", nullable = false)
    private String name;

    @Column(name = "course_price", nullable = false)
    private Double price;

    @Column(name = "course_duration", nullable = false)
    private Integer duration; //davomiyligi oyda kiritiladi

    @ManyToOne(optional = false)
    @JoinColumn(name = "course_education_id")
    private Education education;

    @Column(name = "course_photo", nullable = false)
    private String photo;
}
