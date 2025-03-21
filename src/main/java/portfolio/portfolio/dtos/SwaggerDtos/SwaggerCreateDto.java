package portfolio.portfolio.dtos.SwaggerDtos;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class SwaggerCreateDto {
    @NotBlank
    private String swaggerUrl;
}
