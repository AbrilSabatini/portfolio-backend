package portfolio.portfolio.dtos.TecnologyDtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import portfolio.portfolio.dtos.BaseDto;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class TecnologyUpdateDto extends BaseDto {
    @NotBlank
    private String name;

    @NotNull
    private Boolean isFramework;
}
