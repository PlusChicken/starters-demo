package cn.com.citydo.starters.datahubstarterdemo.service.impl;

import cn.com.citydo.starters.datahub.annotation.write.TupleWriter;
import cn.com.citydo.starters.datahubstarterdemo.entity.Student;
import cn.com.citydo.starters.datahubstarterdemo.service.IWriteService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Caorenpeng
 * 2020-04-03
 */
@Service
public class WriteServiceImpl implements IWriteService {
    /**
     * 向 shard 2 ,3 ,4 写入数据
     *
     * @return
     */
    @Override
    @TupleWriter(projectName = "citydostarters", topic = "student", shardId = {2, 3, 4}, dataClass = Student.class)
    public List<Student> write() {
        List<Student> data = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            Student s = new Student();
            s.setName("jack" + i);
            s.setAge("芳龄" + i);
            s.setClassName("班级" + i);
            data.add(s);
        }
        return data;
    }
}
