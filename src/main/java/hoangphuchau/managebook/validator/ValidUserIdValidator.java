package hoangphuchau.managebook.validator;

import hoangphuchau.managebook.entity.User;
import hoangphuchau.managebook.validator.annotation.ValidUserId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId, User> {
    @Override
    public boolean isValid(User user, ConstraintValidatorContext context) {
        return user != null && user.getId() != null;
    }
}
