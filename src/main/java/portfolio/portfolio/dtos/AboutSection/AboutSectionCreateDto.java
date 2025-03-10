package portfolio.portfolio.dtos.AboutSection;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;
import portfolio.portfolio.dtos.BaseDto;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class AboutSectionCreateDto {
    @Size(max = 50)
    @NotBlank
    private String title;

    @NotBlank
    private String description;

    @URL
    @NotBlank
    private String iconUrl;

    @NotNull
    private int order;

    @NotNull
    private BaseDto user;
}
