package com.demo.testing.utils;

/*
 @author Milan Paudyal
 @since 7/17/19, Wed
*/

import java.util.Objects;

public class ValidationUtils {

    public static boolean validateId(Integer id) {
        return Objects.nonNull(id);
    }

}
