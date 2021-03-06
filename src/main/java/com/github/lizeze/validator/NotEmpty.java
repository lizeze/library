package com.github.lizeze.validator;

import javax.validation.Constraint;
import java.lang.annotation.*;

/**
 * @BelongsProject: test
 * @BelongsPackage: com.example.demo.validator
 * @Author: lizeze
 * @CreateTime: 2020-08-04 22:27
 * @Description: ${Description}
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NotBlankValidator.class)
public @interface NotEmpty {
}
