package portfolio.portfolio.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Representa una sección informativa sobre un usuario, como parte de su perfil.
 * Esta entidad permite almacenar información como la formación, habilidades o logros
 * del usuario, y organizarla de forma estructurada para su visualización en el frontend.
 *
 * La entidad está asociada a un único usuario y permite mostrar información dinámica
 * sobre el perfil del mismo. Se utiliza para crear y gestionar secciones en la interfaz
 * de usuario, que pueden incluir detalles como texto, iconos y categorías.
 *
 */
@Entity(name = "about_section")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "about_section", uniqueConstraints = {
        @UniqueConstraint(name = "unique_user_order_index", columnNames = {"user_id", "order_index"}),
        @UniqueConstraint(name = "unique_user_title", columnNames = {"user_id", "title"})
})
public class AboutSection extends Base {

    /**
     * Título de la sección (ej. "Formación", "Habilidades").
     */
    @Column(nullable = false, length = 50)
    private String title;

    @Column()
    private String description;

    @Column(name = "icon_url", nullable = false)
    private String iconUrl;

    /**
     * Orden en que se debe mostrar la sección en la interfaz.
     */
    @Column(nullable = false, name = "order_index")
    private int order;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
