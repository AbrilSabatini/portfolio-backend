package portfolio.portfolio.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;

import java.util.UUID;

@MappedSuperclass
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Base {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    // Marca una entidad como eliminada lógicamente
    @Column(nullable = false, name = "is_active")
    @Convert(converter = org.hibernate.type.TrueFalseConverter.class)
    private boolean isActive = true;
}
