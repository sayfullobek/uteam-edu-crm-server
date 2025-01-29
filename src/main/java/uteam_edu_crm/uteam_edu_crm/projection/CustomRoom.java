package uteam_edu_crm.uteam_edu_crm.projection;

import org.springframework.data.rest.core.config.Projection;
import uteam_edu_crm.uteam_edu_crm.entity.Room;

import java.util.UUID;

@Projection(name = "customRoom", types = Room.class)
public interface CustomRoom {
    Integer getId();

    String getName();

    UUID getFilial();

    String getColor();
}
