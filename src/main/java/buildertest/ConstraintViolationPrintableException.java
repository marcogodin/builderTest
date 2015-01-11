package buildertest;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Set;

/**
 * Created by killbulle on 11/01/15.
 */
public class ConstraintViolationPrintableException extends ConstraintViolationException {
    public ConstraintViolationPrintableException(Set<? extends ConstraintViolation<?>> constraintViolations) {
        super(constraintViolations);
    }

    public ConstraintViolationPrintableException(String message, Set<? extends ConstraintViolation<?>> constraintViolations) {
        super(message, constraintViolations);
    }

}
