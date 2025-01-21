package portfolio.portfolio.mappers;

import org.mapstruct.Mapper;
import portfolio.portfolio.dtos.SwaggerDtos.SwaggerCreateDto;
import portfolio.portfolio.dtos.SwaggerDtos.SwaggerResponseDto;
import portfolio.portfolio.dtos.SwaggerDtos.SwaggerUpdateDto;
import portfolio.portfolio.entities.Swagger;

@Mapper(componentModel = "spring")
public interface SwaggerMapper extends BaseMapper<Swagger, SwaggerCreateDto, SwaggerUpdateDto, SwaggerResponseDto> {
}
