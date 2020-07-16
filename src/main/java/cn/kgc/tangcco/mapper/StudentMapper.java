package cn.kgc.tangcco.mapper;

import cn.kgc.tangcco.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    List<Student> selectAllStudent(@Param("start")Integer start,
                                   @Param("length") Integer length,
                                   @Param("cid")Integer cid);
    List<String> selectStudentByCid(Integer cid);
}


