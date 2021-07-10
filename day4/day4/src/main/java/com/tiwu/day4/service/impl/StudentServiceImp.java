package com.tiwu.day4.service.impl; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiwu.day4.service.StudentService;
import com.tiwu.day4.mapper.StudentMapper;
import com.tiwu.day4.bean.Student;

@Service("studentService")
public class StudentServiceImp implements StudentService{

	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public int add(Student student) {
		return this.studentMapper.add(student);
	}

	@Override
	public int update(Student student) {
		return this.studentMapper.update(student);
	}

	@Override
	public int deleteBysno(String sno) {
		return this.studentMapper.deleteBysno(sno);
	}

	@Override
	public Student queryStudentBySno(String sno) {
		return this.studentMapper.queryStudentBySno(sno);
	}
}
