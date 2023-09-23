package lk.ijse.gdse.aad.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "techLead")
public class TechLeadEntity implements SuperEntity{

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private String techLead_Id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private Double salary;
    @OneToMany(mappedBy = "techLead_Id",cascade = CascadeType.ALL)
    private List<ProjectEntity> projectEntityList;

    public String getTechLead_Id() {
        return techLead_Id;
    }

    public void setTechLead_Id(String techLead_Id) {
        this.techLead_Id = techLead_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<ProjectEntity> getProjectEntityList() {
        return projectEntityList;
    }

    public void setProjectEntityList(List<ProjectEntity> projectEntityList) {
        this.projectEntityList = projectEntityList;
    }
}
