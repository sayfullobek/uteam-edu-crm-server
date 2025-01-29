package entity;

import jakarta.persistence.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Education extends AbsNameEntity {
    private String name;
    private String logo;
    private String slogan;
}
