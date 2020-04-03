package cn.com.citydo.starters.datahubstarterdemo.service;

import cn.com.citydo.starters.datahub.annotation.DataHubClient;
import cn.com.citydo.starters.datahub.annotation.read.TupleReader;
import cn.com.citydo.starters.datahubstarterdemo.entity.Student;
import com.aliyun.datahub.client.model.CursorType;

import java.util.List;

/**
 * Created by Caorenpeng
 * 2020-04-03
 */
@DataHubClient(projectName = "citydostarters")
public interface IStudentService {
    /**
     * 读取 shardId 为1 的最新50条数据
     *
     * @return
     */
    @TupleReader(topic = "student", shardId = 1,
            dataClass = Student.class, recordLimit = 50, cursorType = CursorType.SEQUENCE)
    List<Student> getStudent();
}
