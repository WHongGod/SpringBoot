package cn.kgc.tangcco.mapper;

import cn.kgc.tangcco.entity.Classroom;

import java.util.List;

public interface RoomMapper {
    List<Classroom> selectAllRoom();
    Classroom selectRoomByRid(Integer rid);
}
