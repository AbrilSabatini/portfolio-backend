package portfolio.portfolio.controllers.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import portfolio.portfolio.controllers.AboutSectionController;
import portfolio.portfolio.dtos.AboutSection.AboutSectionCreateDto;
import portfolio.portfolio.dtos.AboutSection.AboutSectionResponseDto;
import portfolio.portfolio.dtos.AboutSection.AboutSectionUpdateDto;
import portfolio.portfolio.entities.AboutSection;
import portfolio.portfolio.mappers.BaseMapper;
import portfolio.portfolio.services.BaseService;

import java.util.UUID;

@RestController
@RequestMapping("/about-sections")
public class AboutSectionControllerImpl extends BaseControllerImpl<AboutSection, UUID, AboutSectionCreateDto, AboutSectionUpdateDto, AboutSectionResponseDto> implements AboutSectionController {
    public AboutSectionControllerImpl(BaseService<AboutSection, UUID> baseService, BaseMapper<AboutSection, AboutSectionCreateDto, AboutSectionUpdateDto, AboutSectionResponseDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
