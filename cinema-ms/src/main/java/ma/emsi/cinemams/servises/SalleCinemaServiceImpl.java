package ma.emsi.cinemams.servises;

import lombok.AllArgsConstructor;
import ma.emsi.cinemams.entitys.SalleCinema;
import ma.emsi.cinemams.repository.SalleCinemaRepository;
import ma.emsi.cinemams.shared.Dto.SalleCinemaDto;
import ma.emsi.cinemams.shared.Utils;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class SalleCinemaServiceImpl implements ISalleCinemaService {
    private SalleCinemaRepository _salleCinemaRepository;
    @Override
    public SalleCinemaDto Add(SalleCinemaDto salleCinemaDto) {
        if (salleCinemaDto==null) return null;
        ModelMapper modelMapper = new ModelMapper();

        SalleCinema salleCinema = modelMapper.map(salleCinemaDto,SalleCinema.class);
        salleCinema.setSalleId(Utils.generateStringId(12));
        SalleCinema savedSalle = _salleCinemaRepository.save(salleCinema);

        SalleCinemaDto newSalleCinema = modelMapper.map(savedSalle,SalleCinemaDto.class);

        return newSalleCinema;
    }

    @Override
    public SalleCinemaDto Update(SalleCinemaDto salleCinema) {
        return null;
    }

    @Override
    public void Delete(String id) {

    }

    @Override
    public List<SalleCinemaDto> Get() {
        ModelMapper modelMapper = new ModelMapper();
        List<SalleCinema> salleCinemas =_salleCinemaRepository.findAll();
        List<SalleCinemaDto> salleCinemaDtos = modelMapper.map(salleCinemas, new TypeToken<List<SalleCinemaDto>>() {}.getType());
        return salleCinemaDtos;
    }

    @Override
    public List<SalleCinemaDto> Get(String nom) {
        ModelMapper modelMapper = new ModelMapper();
        List<SalleCinema> salleCinemas =_salleCinemaRepository.findByNom(nom);
        List<SalleCinemaDto> salleCinemaDtos = modelMapper.map(salleCinemas, new TypeToken<List<SalleCinemaDto>>() {}.getType());
        return salleCinemaDtos;
    }

    @Override
    public SalleCinemaDto GetById(String id) {
        return null;
    }
}
