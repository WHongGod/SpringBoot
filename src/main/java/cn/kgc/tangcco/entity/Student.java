package cn.kgc.tangcco.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author Tiler
 * @date 2020/1/13 14:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer sid;
    private String name;
    private String sex;
    private Date birthday;
    private Clazz clazz;
    private List<Course> courses;

}
