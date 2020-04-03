package cn.com.citydo.starters.datahubstarterdemo.controller;

import cn.com.citydo.starters.datahubstarterdemo.entity.Student;
import cn.com.citydo.starters.datahubstarterdemo.service.IStudentService;
import cn.com.citydo.starters.datahubstarterdemo.service.IWriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Caorenpeng
 * 2020-04-03
 */
@RestController
public class DataHubController {
    @Autowired
    private IStudentService studentService;
    @Autowired
    private IWriteService writeService;

    @GetMapping(value = "/get")
    public List<Student> get() {
        return studentService.getStudent();
    }

    @GetMapping(value = "/write")
    public List<Student> write() {
        return writeService.write();
    }
}
