package ma.emsi.cinemams.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.emsi.cinemams.enums.Status;
import ma.emsi.cinemams.enums.Type;

import java.io.Serializable;
import java.util.Date;
@Data @AllArgsConstructor @NoArgsConstructor
public class SalleCinemaResponse implements Serializable {
    private static final long serialVersionUID = -7900892672321560515L;


    private String SalleId;//PUBLIC ID IN API

    public String nom;

    public String adresse;

    public Date dateCreation;

    public Integer nombreChaises;

    public Status statu;

    public Type type;
}
