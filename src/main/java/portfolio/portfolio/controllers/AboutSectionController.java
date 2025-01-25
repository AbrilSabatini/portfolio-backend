package portfolio.portfolio.controllers;

import portfolio.portfolio.dtos.AboutSection.AboutSectionCreateDto;
import portfolio.portfolio.dtos.AboutSection.AboutSectionResponseDto;
import portfolio.portfolio.dtos.AboutSection.AboutSectionUpdateDto;

import java.util.UUID;

public interface AboutSectionController extends BaseController<UUID, AboutSectionCreateDto, AboutSectionUpdateDto, AboutSectionResponseDto> {
}
