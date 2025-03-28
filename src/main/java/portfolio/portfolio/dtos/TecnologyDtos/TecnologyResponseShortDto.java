package portfolio.portfolio.dtos.TecnologyDtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import portfolio.portfolio.dtos.BaseDto;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class TecnologyResponseShortDto extends BaseDto {
    private String name;

    private Boolean isFramework;
}
