package portfolio.portfolio.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "portfolio_user")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class User extends Base {
    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 50)
    private String jobTitle;

    @Column(nullable = false)
    private String about;

    @Column(nullable = false)
    private String email;

    @Column(name = "github_url", nullable = false, length = 50)
    private String githubUrl;

    @Column(name = "linkedin_url", nullable = false)
    private String linkedinUrl;

    @Column(name = "cv_url", nullable = false)
    private String cvUrl;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Experience> experiences = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Project> projects = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AboutSection> aboutSections = new ArrayList<>();
}
