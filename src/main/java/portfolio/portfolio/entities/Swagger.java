package portfolio.portfolio.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import portfolio.portfolio.entities.enums.ProjectStatus;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Swagger extends Base {
    @Column(name = "swagger_url", nullable = false)
    private String swaggerUrl;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private Project project;
}
