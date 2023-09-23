package lk.ijse.gdse.aad.service;

import lk.ijse.gdse.aad.dto.ProjectDTO;

public interface ProjectService {
    ProjectDTO saveProject(ProjectDTO projectDTO);
    void  deleteProject(String id);
}
