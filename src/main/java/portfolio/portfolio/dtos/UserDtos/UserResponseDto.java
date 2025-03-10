package portfolio.portfolio.dtos.UserDtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import portfolio.portfolio.dtos.AboutSection.AboutSectionResponseDto;
import portfolio.portfolio.dtos.BaseDto;
import portfolio.portfolio.dtos.ExperienceDtos.ExperienceResponseDto;
import portfolio.portfolio.dtos.ProjectDtos.ProjectResponseDto;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto extends BaseDto {
    private String name;

    private String jobTitle;

    private String about;

    private String email;

    private String githubUrl;

    private String linkedinUrl;

    private String cvUrl;

    List<ExperienceResponseDto> experiences;

    List<ProjectResponseDto> projects;

    List<AboutSectionResponseDto> aboutSections;
}
