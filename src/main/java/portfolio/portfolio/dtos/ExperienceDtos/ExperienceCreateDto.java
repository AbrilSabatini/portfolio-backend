package portfolio.portfolio.dtos.ExperienceDtos;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import portfolio.portfolio.dtos.BaseDto;

import java.time.LocalDate;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExperienceCreateDto {
    @Size(max = 50)
    @NotBlank
    private String position;

    @NotBlank
    private String description;

    @Size(max = 50)
    @NotBlank
    private String company;

    @NotNull
    @PastOrPresent
    private LocalDate startDate;

    private LocalDate endDate;

    @NotNull
    private BaseDto user;
}
