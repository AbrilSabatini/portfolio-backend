package portfolio.portfolio.dtos.SwaggerDtos;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import portfolio.portfolio.dtos.BaseDto;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class SwaggerUpdateDto extends BaseDto {
    @NotBlank
    private String swaggerUrl;
}
