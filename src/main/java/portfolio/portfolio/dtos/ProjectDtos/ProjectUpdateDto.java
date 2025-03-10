package portfolio.portfolio.dtos.ProjectDtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;
import portfolio.portfolio.dtos.BaseDto;
import portfolio.portfolio.dtos.SwaggerDtos.SwaggerResponseDto;
import portfolio.portfolio.entities.enums.ProjectStatus;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectUpdateDto extends BaseDto {
    @Size(max = 50)
    private String name;

    @Size(max = 500)
    private String description;

    @URL
    private String githubUrl;

    private ProjectStatus status;

    private SwaggerResponseDto swagger;

    private List<BaseDto> tecnologies;

    @URL
    private String imageUrl;

    @URL
    private String coverImageUrl;
}
