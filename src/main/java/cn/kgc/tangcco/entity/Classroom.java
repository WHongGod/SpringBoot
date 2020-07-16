package cn.kgc.tangcco.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Tiler
 * @date 2020/1/14 14:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Classroom {
    private Integer rid;
    private String name;
    private Clazz clazz;
}
