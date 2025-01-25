package portfolio.portfolio.dtos.AboutSection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import portfolio.portfolio.dtos.BaseDto;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class AboutSectionResponseDto extends BaseDto {
    private String title;

    private String iconUrl;

    private int order;

    private BaseDto user;
}
