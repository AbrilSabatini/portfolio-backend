package portfolio.portfolio.controllers.impl;


import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import portfolio.portfolio.controllers.BaseController;
import portfolio.portfolio.entities.Base;
import portfolio.portfolio.mappers.BaseMapper;
import portfolio.portfolio.services.BaseService;

import java.util.List;

/**
 * @param <E> Entidad
 * @param <ID> Tipo del id de la entidad
 * @param <CD> (createDto) Dto para creación
 * @param <UD> (updateDto) Dto para actualización
 * @param <GD> (getDto) Dto para retorno
 */
@RestController
@RequiredArgsConstructor
public abstract class BaseControllerImpl<E extends Base, ID, CD, UD, GD> implements BaseController<ID, CD, UD, GD> {
    private final BaseService<E, ID> baseService;
    private final BaseMapper<E, CD, UD, GD> baseMapper;

    @Operation(summary = "Obtener entidades en alta")
    @GetMapping("/")
    public ResponseEntity<List<GD>> getAll() {
        List<GD> dtos = (List<GD>) baseMapper.toDtoList(baseService.getAll());
        return ResponseEntity.ok(dtos);
    }

    @Operation(summary = "Obtener entidad por id")
    @GetMapping("/{id}")
    public ResponseEntity<GD> getById(@PathVariable ID id) {
        GD dto = baseMapper.toDto(baseService.getById(id));
        return ResponseEntity.ok(dto);
    }

    @Operation(summary = "Guardar entidad")
    @PostMapping("/")
    public ResponseEntity<GD> create(@RequestBody @Valid CD createDto) {
        E entity = baseMapper.toEntity(createDto);
        GD dto = baseMapper.toDto(baseService.create(entity));
        return ResponseEntity.status(201).body(dto);
    }

    @Operation(summary = "Editar entidad")
    @PatchMapping("/")
    public ResponseEntity<GD> update(@RequestBody @Valid UD updateDto) {
        E entity = baseMapper.toEntityU(updateDto);
        GD dto = baseMapper.toDto(baseService.update(entity));
        return ResponseEntity.ok(dto);
    }

    @Operation(summary = "Dar de baja una entidad")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> softDelete(@PathVariable ID id) {
        baseService.softDelete(id);
        return ResponseEntity.noContent().build();
    }

}
