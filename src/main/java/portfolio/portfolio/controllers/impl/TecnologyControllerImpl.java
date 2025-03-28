package portfolio.portfolio.controllers.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import portfolio.portfolio.controllers.TecnologyController;
import portfolio.portfolio.dtos.TecnologyDtos.TecnologyCreateDto;
import portfolio.portfolio.dtos.TecnologyDtos.TecnologyResponseShortDto;
import portfolio.portfolio.dtos.TecnologyDtos.TecnologyUpdateDto;
import portfolio.portfolio.entities.Tecnology;
import portfolio.portfolio.mappers.BaseMapper;
import portfolio.portfolio.services.BaseService;

import java.util.UUID;

@RestController
@RequestMapping("/tecnologies")
public class TecnologyControllerImpl extends BaseControllerImpl<Tecnology, UUID, TecnologyCreateDto, TecnologyUpdateDto, TecnologyResponseShortDto> implements TecnologyController {
    public TecnologyControllerImpl(BaseService<Tecnology, UUID> baseService, BaseMapper<Tecnology, TecnologyCreateDto, TecnologyUpdateDto, TecnologyResponseShortDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
