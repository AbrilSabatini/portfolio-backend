package portfolio.portfolio.dtos.ProjectDtos;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import portfolio.portfolio.dtos.BaseDto;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectAddTecnologyDto extends BaseDto {

    private List<BaseDto> tecnologies;

}
