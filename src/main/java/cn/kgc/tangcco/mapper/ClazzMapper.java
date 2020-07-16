package cn.kgc.tangcco.mapper;

import cn.kgc.tangcco.entity.Clazz;

import java.util.List;

public interface ClazzMapper {
    List<Clazz> selectAllClazz();
    Clazz selectClazzByCid(Integer cid);
    Clazz selectClazzByRid(Integer rid);
}
