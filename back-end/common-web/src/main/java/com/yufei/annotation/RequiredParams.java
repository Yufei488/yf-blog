package com.yufei.annotation;

import org.springframework.stereotype.Service;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@Constraint(validatedBy = RequiredParams.AA.class)
public @interface RequiredParams {
    // 必须参数数组
    String[] value() default {};

    // 是否所有都为必须
    boolean isAll() default false;

    class AA implements ConstraintValidator<Annotation,String[]> {

        @Override
        public void initialize(Annotation constraintAnnotation) {
            System.out.printf("" );
        }

        @Override
        public boolean isValid(String[] params, ConstraintValidatorContext constraintValidatorContext) {
            System.out.printf("" );
            return false;
        }
    }
}