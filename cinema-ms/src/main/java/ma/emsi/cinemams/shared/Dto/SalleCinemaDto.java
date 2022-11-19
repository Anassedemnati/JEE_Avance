package ma.emsi.cinemams.shared.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.emsi.cinemams.enums.Status;
import ma.emsi.cinemams.enums.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Data @AllArgsConstructor @NoArgsConstructor
public class SalleCinemaDto implements Serializable {
    private static final long serialVersionUID = -7900847679121560515L;
    public Long id;
    private String SalleId;//PUBLIC ID IN API
    public String nom;

    public String adresse;

    public Date dateCreation;

    public Integer nombreChaises;

    public Status statu;

    public Type type;
}
