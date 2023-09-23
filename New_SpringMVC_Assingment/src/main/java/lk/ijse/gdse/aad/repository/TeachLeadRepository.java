package lk.ijse.gdse.aad.repository;

import lk.ijse.gdse.aad.entity.TechLeadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeachLeadRepository extends JpaRepository<TechLeadEntity,String> {
    TechLeadEntity save(TechLeadEntity techLeadEntity);
    TechLeadEntity findTechLeadEntityByTechLead_Id(String id);
    void deleteByTechLead_Id(String id);

}
