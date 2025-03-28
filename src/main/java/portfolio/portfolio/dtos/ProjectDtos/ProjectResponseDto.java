package portfolio.portfolio.dtos.ProjectDtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import portfolio.portfolio.dtos.BaseDto;
import portfolio.portfolio.dtos.SwaggerDtos.SwaggerResponseDto;
import portfolio.portfolio.dtos.TecnologyDtos.TecnologyResponseShortDto;
import portfolio.portfolio.entities.enums.ProjectStatus;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectResponseDto extends BaseDto {
    private String name;

    private String description;

    private String githubUrl;

    private ProjectStatus status;

    private SwaggerResponseDto swagger;

    private List<TecnologyResponseShortDto> tecnologies; // Responder con el dto de tecnologías

    private String imageUrl;

    private String coverImageUrl;
}
