package uteam_edu_crm.uteam_edu_crm.entity;

import uteam_edu_crm.uteam_edu_crm.entity.enums.WeekType;
import uteam_edu_crm.uteam_edu_crm.entity.template.AbsEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Group extends AbsEntity {
    @ManyToOne(optional = false)
    @JoinColumn(name = "group_filial_id")
    private Filial filial;

    @Column(name = "group_name", nullable = false)
    private String name;

    @ManyToOne(optional = false)
    @JoinColumn(name = "group_teacher_id")
    private Users teacher;

    @ManyToOne(optional = false)
    @JoinColumn(name = "group_course_id")
    private Course course;

    @ManyToMany
    private List<Users> students;

    @ManyToOne(optional = false)
    @JoinColumn(name = "group_room_id")
    private Room room;

    @Enumerated(EnumType.STRING)
    private WeekType weekType;

    @ManyToMany
    private List<DayType> dayTypes;

    @Column(name = "group_start_hours", nullable = false)
    private String startHours;

    @Column(name = "group_end_hours", nullable = false)
    private String endHours;
}
