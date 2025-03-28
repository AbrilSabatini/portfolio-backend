package portfolio.portfolio.dtos.TecnologyDtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class TecnologyCreateDto {
    @Size(max = 50)
    @NotBlank
    private String name;

    @NotNull
    private Boolean isFramework;

    @NotNull
    @URL
    private String urlImage;
}
