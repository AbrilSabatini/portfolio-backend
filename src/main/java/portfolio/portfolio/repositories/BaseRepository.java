package portfolio.portfolio.repositories;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import portfolio.portfolio.entities.Base;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

/**
 * Repositorio base genérico para las entidades.
 *
 * @param <T> Entidad
 * @param <ID> Tipo del ID de la entidad
 */
@NoRepositoryBean
public interface BaseRepository<T extends Base, ID> extends JpaRepository<T, ID> {


    /**
     * Encuentra todas las entidades activas (no eliminadas lógicamente).
     *
     * @return una lista de entidades con baja = false.
     */
    List<T> findAllByIsActiveTrue();

    /**
     * Encuentra una entidad por ID si está activa.
     *
     * @param id ID de la entidad.
     * @return un Optional con la entidad si está activa.
     */
    Optional<T> findByIdAndIsActiveTrue(ID id);
}
