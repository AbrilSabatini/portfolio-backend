package portfolio.portfolio.dtos.ExperienceDtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import portfolio.portfolio.dtos.BaseDto;

import java.time.LocalDate;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExperienceResponseDto extends BaseDto {
    private String position;

    private String description;

    private String company;

    private LocalDate startDate;

    private LocalDate endDate;

    // @NotBlank
    // private User user;
}
