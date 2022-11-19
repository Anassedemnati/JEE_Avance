package ma.emsi.cinemams.controllers;
import lombok.AllArgsConstructor;
import ma.emsi.cinemams.Requests.SalleCinemaRequest;
import ma.emsi.cinemams.Response.SalleCinemaResponse;
import ma.emsi.cinemams.servises.ISalleCinemaService;
import ma.emsi.cinemams.shared.Dto.SalleCinemaDto;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping(path = "/sallecinema")
@CrossOrigin("*")
public class SalleCinemaController {
    private ISalleCinemaService salleCinemaService;

    @PostMapping(consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<SalleCinemaResponse> storeSalle(@RequestBody SalleCinemaRequest salleCinemaRequest){
        ModelMapper modelMapper=new ModelMapper();
        SalleCinemaDto salleCinemaDto = modelMapper.map(salleCinemaRequest,SalleCinemaDto.class);
        SalleCinemaDto addedSalle = salleCinemaService.Add(salleCinemaDto);
        SalleCinemaResponse salleCinemaResponse = modelMapper.map(addedSalle, SalleCinemaResponse.class);
        return ResponseEntity.status(HttpStatus.OK).body(salleCinemaResponse);


    }
    @GetMapping(consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<SalleCinemaResponse>> getAllSalle()
    {
        ModelMapper modelMapper=new ModelMapper();
        List<SalleCinemaDto> salleCinemaDtoList = salleCinemaService.Get();
        List<SalleCinemaResponse> salleCinemaResponses =modelMapper.map(salleCinemaDtoList, new TypeToken<List<SalleCinemaResponse>>() {}.getType());
        return ResponseEntity.status(HttpStatus.OK).body(salleCinemaResponses);
    }
    @GetMapping(path = "/search",consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})//@RequestBody on recupaire de core de la reques json
    public ResponseEntity<List<SalleCinemaResponse>> serchSalle(@RequestParam(name = "keyword",defaultValue = "")
                                          String keyword){
        ModelMapper modelMapper=new ModelMapper();
        List<SalleCinemaDto> salleCinemaDtoList = salleCinemaService.Get("%" + keyword + "%");
        List<SalleCinemaResponse> salleCinemaResponses =modelMapper.map(salleCinemaDtoList, new TypeToken<List<SalleCinemaResponse>>() {}.getType());

        return ResponseEntity.status(HttpStatus.OK).body(salleCinemaResponses);

    }
}
