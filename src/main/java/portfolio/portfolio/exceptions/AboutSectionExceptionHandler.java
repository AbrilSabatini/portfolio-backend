package portfolio.portfolio.exceptions;

import org.springframework.dao.DataIntegrityViolationException;

import java.util.ArrayList;
import java.util.List;

public class AboutSectionExceptionHandler {
    /**
     * Maneja excepciones de integridad de datos específicas para AboutSection.
     *
     * @param ex la excepción DataIntegrityViolationException capturada.
     * @throws BusinessException si se encuentra una violación de restricción única.
     */
    public static void handleUniqueConstraints(DataIntegrityViolationException ex) {
        String error = null;

        if (ex.getMessage().contains("violates unique constraint")) {
            if (ex.getMessage().contains("unique_user_order_index") && ex.getMessage().contains("user_id, order_index")) {
                error = ("Ya existe una sección con el mismo 'order_index' para este usuario.");
            }

            if (ex.getMessage().contains("unique_user_title")) {
                error = ("Ya existe una sección con el mismo 'title' para este usuario.");
            }
        }

        if (error != null) {
            throw new BusinessException(error);
        }

        throw new BusinessException("Error de integridad en los datos proporcionados.");
    }
}
