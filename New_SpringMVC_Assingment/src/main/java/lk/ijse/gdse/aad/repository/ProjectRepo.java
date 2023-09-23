package lk.ijse.gdse.aad.repository;

import lk.ijse.gdse.aad.entity.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<ProjectEntity,String> {
    ProjectEntity save(ProjectEntity project);
   void  deleteById(String id);
}
