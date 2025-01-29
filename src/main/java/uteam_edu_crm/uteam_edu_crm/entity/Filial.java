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
public class Filial extends AbsEntity {
    @Column(name = "filial_name", nullable = false, unique = true)
    private String name;

    @Column(name = "filial_description", nullable = false, length = 10000)
    private String description;

    @Column(name = "filial_address", nullable = false, length = 1000)
    private String address;

    @ManyToOne(optional = false)
    @JoinColumn(name = "filial_district_id")
    private District district;

    @ManyToOne
    @JoinColumn(name = "filial_education_id")
    private Education education;
}
