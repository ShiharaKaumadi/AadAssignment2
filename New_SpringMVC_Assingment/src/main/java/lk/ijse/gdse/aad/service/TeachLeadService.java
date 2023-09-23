package lk.ijse.gdse.aad.service;

import lk.ijse.gdse.aad.dto.TechLeadDTO;

public interface TeachLeadService {
    TechLeadDTO saveTeachLead(TechLeadDTO techLeadDTO);
    void  deleteTeachLead(String id);
    void  updateTeachLead(String id,TechLeadDTO techLeadDTO);
    TechLeadDTO getTeachLead(String id);
}
