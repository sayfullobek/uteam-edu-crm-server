package uteam_edu_crm.uteam_edu_crm.entity;

import uteam_edu_crm.uteam_edu_crm.entity.enums.Gender;
import uteam_edu_crm.uteam_edu_crm.entity.template.AbsEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Users extends AbsEntity {
    @ManyToOne
    @JoinColumn(name = "users_filial_id")
    private Filial filial;

    @Column(name = "users_name", nullable = false)
    private String name;

    @Column(name = "users_surname", nullable = false)
    private String surname;

    @Column(name = "users_middle_name")
    private String middleName;

    @Column(name = "users_photo")
    private String photo;

    @Column(name = "users_birth_date", nullable = false)
    private Date birthDate;

    @OneToOne
    private Passport passport;

    @OneToOne
    private Guvohnoma guvohnoma;

    @OneToOne
    Forpupil forpupil;

    @Column(name = "users_phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "users_username", unique = true)
    private String username;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @ManyToMany
    private Set<Role> roles;

    @Column(name = "users_password")
    private String password;

}
