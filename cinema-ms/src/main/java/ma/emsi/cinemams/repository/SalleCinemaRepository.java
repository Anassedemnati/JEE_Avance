package ma.emsi.cinemams.repository;

import ma.emsi.cinemams.entitys.SalleCinema;
import ma.emsi.cinemams.enums.Status;
import ma.emsi.cinemams.enums.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface SalleCinemaRepository extends JpaRepository<SalleCinema,Long> {
    @Query("select s from SalleCinema s where s.nom like:kw")
    public List<SalleCinema> findByNom(@Param("kw") String nom);
    public List<SalleCinema> findByStatu(Status status);
    public List<SalleCinema> findByType(Type type);
    public List<SalleCinema> findByTypeAndStatu(Type type,Status status);

}
