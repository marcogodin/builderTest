package buildertest;

import javax.validation.*;

import java.util.Set;

/**
 * Created by killbulle on 11/01/15.
 */
public class DomainAnnotationValidator {
    public void validate(Object t) {
    ValidatorFactory factory =  Validation.buildDefaultValidatorFactory();
    Validator validator = factory.getValidator();
        Set<ConstraintViolation<Object>> constraintViolations =
            validator.validate(t);

            if (constraintViolations.size() > 0 ) {
                System.out.printf("error-->"+constraintViolations);
                throw new ConstraintViolationException("InvalidConstruction", constraintViolations);
            }
}}
