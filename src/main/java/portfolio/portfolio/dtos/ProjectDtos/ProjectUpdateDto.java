package portfolio.portfolio.dtos.ProjectDtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import portfolio.portfolio.dtos.BaseDto;
import portfolio.portfolio.dtos.SwaggerDtos.SwaggerResponseDto;
import portfolio.portfolio.entities.enums.ProjectStatus;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectUpdateDto extends BaseDto {
    @Size(max = 50)
    @NotBlank
    private String name;

    @NotBlank
    private String description;

    private String githubUrl;

    @NotNull
    private ProjectStatus status;

    private SwaggerResponseDto swagger;

    @NotEmpty
    private List<BaseDto> tecnologies;
}
