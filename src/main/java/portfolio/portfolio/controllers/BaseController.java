package portfolio.portfolio.controllers;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BaseController<ID, CD, UD, GD> {
    ResponseEntity<List<GD>> getAll();
    ResponseEntity<GD> getById(ID id);
    ResponseEntity<GD> create(CD createDto);
    ResponseEntity<GD> update(UD updateDto);
    ResponseEntity<?> delete(ID id);

}
