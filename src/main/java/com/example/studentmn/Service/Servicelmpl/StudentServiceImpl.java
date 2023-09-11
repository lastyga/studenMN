package com.example.studentmn.Service.Servicelmpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.studentmn.Entity.Student;
import com.example.studentmn.Repository.StudentRepository;
import com.example.studentmn.Service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        Student student = studentRepository.findById(id).get();
        return student;
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

}
