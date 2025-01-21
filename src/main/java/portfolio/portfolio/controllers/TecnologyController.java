package portfolio.portfolio.controllers;

import portfolio.portfolio.dtos.TecnologyDtos.TecnologyCreateDto;
import portfolio.portfolio.dtos.TecnologyDtos.TecnologyResponseDto;
import portfolio.portfolio.dtos.TecnologyDtos.TecnologyUpdateDto;

import java.util.UUID;

public interface TecnologyController extends BaseController<UUID, TecnologyCreateDto, TecnologyUpdateDto, TecnologyResponseDto> {
}
