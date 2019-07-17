package com.demo.testing.service;

/*
 @author Milan Paudyal
 @since 7/17/19, Wed
*/

import com.demo.testing.exception.StudentNotFoundException;

public interface StudentService{

    String greetStudent(Integer id) throws StudentNotFoundException;

}
