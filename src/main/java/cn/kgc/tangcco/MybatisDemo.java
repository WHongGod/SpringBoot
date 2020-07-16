package cn.kgc.tangcco;

import cn.kgc.tangcco.entity.Course;
import cn.kgc.tangcco.entity.Student;
import cn.kgc.tangcco.mapper.CourseMapper;
import cn.kgc.tangcco.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class MybatisDemo {
    public static void main(String[] args) {
        try {
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            /*CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
            List<Course> courses = mapper.selectAllCourses();
            for (Course cours : courses) {
                System.out.println(cours);
            }*/
            /*Course course = mapper.selectCourseByCid(1);
            System.out.println(course);*/
            /*List<Course> courses = mapper.selectCourseBySid(1);
            for (Course cours : courses) {
                System.out.println(cours);
            }*/
            /*StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

            List<Student> list = studentMapper.selectAllStudent(0, 5, 1);

            for (Student student : list) {
                System.out.println(student.getName() +":" + student.getClazz().getName());

                for (Course c : student.getCourses()) {
                    System.out.println(c.getName());
                }
            }*/

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
