package lk.ijse.gdse.aad.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "project")
public class ProjectEntity implements SuperEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String date;
    @Column(nullable = false)
    private String owner ;
    @ManyToOne
    @JoinColumn(name = "techLead_Id",referencedColumnName = "techLead_Id")
    private TechLeadEntity techLeadEntity;

}
