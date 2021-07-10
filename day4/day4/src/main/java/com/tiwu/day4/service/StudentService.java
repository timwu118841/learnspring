package com.tiwu.day4.service;
import com.tiwu.day4.bean.Student;

public interface StudentService {
	int add(Student student);
    int update(Student student);
    int deleteBysno(String sno);
    Student queryStudentBySno(String sno);
}
