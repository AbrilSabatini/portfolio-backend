package portfolio.portfolio.controllers;

import portfolio.portfolio.dtos.ExperienceDtos.ExperienceCreateDto;
import portfolio.portfolio.dtos.ExperienceDtos.ExperienceResponseDto;
import portfolio.portfolio.dtos.ExperienceDtos.ExperienceUpdateDto;

import java.util.UUID;

public interface ExperienceController extends BaseController<UUID, ExperienceCreateDto, ExperienceUpdateDto, ExperienceResponseDto> {
}
