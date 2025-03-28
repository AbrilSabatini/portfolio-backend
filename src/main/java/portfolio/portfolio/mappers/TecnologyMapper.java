package portfolio.portfolio.mappers;

import org.mapstruct.Mapper;
import portfolio.portfolio.dtos.TecnologyDtos.TecnologyCreateDto;
import portfolio.portfolio.dtos.TecnologyDtos.TecnologyResponseShortDto;
import portfolio.portfolio.dtos.TecnologyDtos.TecnologyUpdateDto;
import portfolio.portfolio.entities.Tecnology;

@Mapper(componentModel = "spring")
public interface TecnologyMapper extends BaseMapper<Tecnology, TecnologyCreateDto, TecnologyUpdateDto, TecnologyResponseShortDto> {
}
