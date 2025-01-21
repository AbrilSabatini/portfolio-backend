package portfolio.portfolio.mappers;


import portfolio.portfolio.entities.Base;

import java.util.List;

/**
 * Interfaz genérica para realizar la conversión entre entidades y DTOs.
 *
 * @param <E>  Tipo de la entidad principal que extiende de {@link Base}.
 * @param <CD> DTO utilizado para la creación de entidades.
 * @param <UD> DTO utilizado para la actualización de entidades.
 * @param <GD> DTO utilizado para devolver datos en las respuestas.
 */
public interface BaseMapper<E extends Base, CD, UD, GD> {

    /**
     * Convierte un DTO de creación en una entidad.
     */
    E toEntity(CD createDto);

    /**
     * Convierte un DTO de actualización en una entidad.
     */
    E toEntityU(UD updateDto);

    /**
     * Convierte una entidad en un DTO de respuesta.
     */
    GD toDto(E entity);

    /**
     * Convierte una lista de entidades en una lista de DTOs de respuesta.
     */
    List<GD> toDtoList(List<E> entities);
}
