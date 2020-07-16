package cn.kgc.tangcco.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Tiler
 * @date 2020/1/10 14:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Clazz {
    private Integer cid;
    private String name;
    private Classroom room;

}
