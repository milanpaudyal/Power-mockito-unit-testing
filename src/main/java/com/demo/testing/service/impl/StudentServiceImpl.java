package com.demo.testing.service.impl;

import com.demo.testing.exception.StudentNotFoundException;
import com.demo.testing.service.StudentService;
import com.demo.testing.utils.ValidationUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/*
 @author Milan Paudyal
 @since 7/17/19, Wed
*/

@Service
public class StudentServiceImpl implements StudentService {

    public String greetStudent(Integer id) throws StudentNotFoundException {
        if(ValidationUtils.validateId(id) && id > 0 && id < 3){
            return "Hello " + getStudentName(id);
        }
        throw new StudentNotFoundException("Student Not Found");
    }

    private String getStudentName(Integer id){
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "Bikram");
        studentMap.put(2, "Suraj");
        return studentMap.get(id);
    }

}
