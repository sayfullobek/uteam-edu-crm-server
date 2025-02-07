package uteam_edu_crm.uteam_edu_crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import uteam_edu_crm.uteam_edu_crm.entity.Room;
import uteam_edu_crm.uteam_edu_crm.projection.CustomRoom;

@RepositoryRestResource(path = "room", collectionResourceRel = "list", excerptProjection = CustomRoom.class)
@CrossOrigin
public interface RoomRepository extends JpaRepository<Room, Integer> {
}
