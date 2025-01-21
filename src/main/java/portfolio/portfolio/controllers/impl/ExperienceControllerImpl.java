package portfolio.portfolio.controllers.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import portfolio.portfolio.controllers.ExperienceController;
import portfolio.portfolio.dtos.ExperienceDtos.ExperienceCreateDto;
import portfolio.portfolio.dtos.ExperienceDtos.ExperienceResponseDto;
import portfolio.portfolio.dtos.ExperienceDtos.ExperienceUpdateDto;
import portfolio.portfolio.entities.Experience;
import portfolio.portfolio.mappers.BaseMapper;
import portfolio.portfolio.services.BaseService;

import java.util.UUID;

@RestController
@RequestMapping("/experiences")
public class ExperienceControllerImpl extends BaseControllerImpl<Experience, UUID, ExperienceCreateDto, ExperienceUpdateDto, ExperienceResponseDto> implements ExperienceController {
    public ExperienceControllerImpl(BaseService<Experience, UUID> baseService, BaseMapper<Experience, ExperienceCreateDto, ExperienceUpdateDto, ExperienceResponseDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
