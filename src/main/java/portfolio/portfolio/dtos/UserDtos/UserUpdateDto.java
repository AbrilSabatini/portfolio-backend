package portfolio.portfolio.dtos.UserDtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;
import portfolio.portfolio.dtos.BaseDto;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdateDto extends BaseDto {
    @Size(max = 50)
    @NotBlank
    private String name;

    @NotBlank
    private String jobTitle;

    @NotBlank
    private String about;

    @Email
    @NotBlank
    private String email;

    @URL
    @NotBlank
    private String githubUrl;

    @URL
    @NotBlank
    private String linkedinUrl;

    @URL(regexp = "^https:\\/\\/drive\\.google\\.com\\/.*\\/p\\/.*$",
            message = "La URL debe ser de Google Drive y contener /p/")
    @NotBlank
    private String cvUrl;

    private List<BaseDto> skills;
}
