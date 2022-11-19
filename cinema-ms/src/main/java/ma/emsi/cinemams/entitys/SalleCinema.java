package ma.emsi.cinemams.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.emsi.cinemams.enums.Status;
import ma.emsi.cinemams.enums.Type;

import javax.persistence.*;
import java.util.Date;
@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class SalleCinema {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(nullable = false,length = 20,unique = true)
    public String nom;
    @Column(length = 150)
    public String adresse;
    @Temporal(TemporalType.DATE)
    public Date dateCreation;
    @Column(nullable = false)
    public Integer nombreChaises;
    @Enumerated(EnumType.STRING)
    public Status statu;
    @Enumerated(EnumType.STRING)
    public Type type;
    @Column(nullable = false,unique = true)
    private String SalleId;//PUBLIC ID IN API

}
