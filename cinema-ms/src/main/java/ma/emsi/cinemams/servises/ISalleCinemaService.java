package ma.emsi.cinemams.servises;

import ma.emsi.cinemams.entitys.SalleCinema;
import ma.emsi.cinemams.shared.Dto.SalleCinemaDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ISalleCinemaService {
    SalleCinemaDto Add(SalleCinemaDto salleCinema);
    SalleCinemaDto Update(SalleCinemaDto salleCinema);
    void Delete(String id);
    List<SalleCinemaDto> Get();
    List<SalleCinemaDto> Get(String nom);
    SalleCinemaDto GetById(String id);







}
