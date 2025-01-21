package portfolio.portfolio.dtos.SwaggerDtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import portfolio.portfolio.dtos.BaseDto;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class SwaggerResponseDto extends BaseDto {
    private String swaggerUrl;
}
