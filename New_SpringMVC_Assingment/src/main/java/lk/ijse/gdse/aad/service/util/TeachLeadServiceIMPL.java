package lk.ijse.gdse.aad.service.util;

import lk.ijse.gdse.aad.converter.Converter;
import lk.ijse.gdse.aad.dto.TechLeadDTO;
import lk.ijse.gdse.aad.entity.TechLeadEntity;
import lk.ijse.gdse.aad.repository.TeachLeadRepository;
import lk.ijse.gdse.aad.service.TeachLeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class TeachLeadServiceIMPL implements TeachLeadService {
    @Autowired
    TeachLeadRepository teachLeadRepository;
    @Autowired
    Converter converter;
    @Override
    public TechLeadDTO saveTeachLead(TechLeadDTO techLeadDTO) {
        TechLeadEntity techLeadEntity=converter.getTeachEntity(techLeadDTO);
        teachLeadRepository.save(techLeadEntity);
        return techLeadDTO;
    }

    @Override
    public void deleteTeachLead(String id) {
        teachLeadRepository.deleteByTechLead_Id(id);

    }

    @Override
    public void updateTeachLead(String id,TechLeadDTO techLeadDTO) {
        Optional<TechLeadEntity> techLead= Optional.ofNullable(teachLeadRepository.findTechLeadEntityByTechLead_Id(id));
        if (!techLead.isPresent())throw new RuntimeException("Teach Lead Not Found");
        techLead.get().setName(techLeadDTO.getName());
        techLead.get().setEmail(techLeadDTO.getEmail());
        techLead.get().setSalary(techLeadDTO.getSalary());

    }

    @Override
    public TechLeadDTO getTeachLead(String id) {
        TechLeadEntity techLead=teachLeadRepository.findTechLeadEntityByTechLead_Id(id);
        return converter.getTeachLeadDTO(techLead);

    }
}
