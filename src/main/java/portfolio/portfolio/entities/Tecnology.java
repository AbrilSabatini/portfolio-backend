package portfolio.portfolio.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tecnology extends Base {
    @Column(nullable = false)
    private String name;

    @Column(name = "is_framework", nullable = false)
    @Convert(converter = org.hibernate.type.TrueFalseConverter.class)
    private Boolean isFramework;

    @Column(name = "url_image")
    private String urlImage;
}
