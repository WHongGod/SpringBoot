package cn.kgc.tangcco.mapper;

import cn.kgc.tangcco.entity.Course;

import java.util.List;

public interface CourseMapper {
    List<Course> selectAllCourse();
    Course selectCourseByCid(Integer cid);
    List<Course> selectCourseBySid(Integer sid);
}
