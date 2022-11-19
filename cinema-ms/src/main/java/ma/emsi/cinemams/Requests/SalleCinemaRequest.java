package ma.emsi.cinemams.Requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.emsi.cinemams.enums.Status;
import ma.emsi.cinemams.enums.Type;

import java.io.Serializable;
import java.util.Date;
@Data @AllArgsConstructor @NoArgsConstructor
public class SalleCinemaRequest implements Serializable {
    private static final long serialVersionUID = -7900892679121560515L;
    public String nom;

    public String adresse;

    public Date dateCreation;

    public Integer nombreChaises;

    public Status statu;

    public Type type;
}
