package boco.shanxi.service;

import boco.shanxi.domain.Area;
import boco.shanxi.mapper.AreaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-12-17 09:51
 * @description: 地区
 */
@Service
public class AreaService {

    @Autowired
    private AreaMapper areaMapper;

    public List<Area> selectAreaList(){
        return areaMapper.selectArea();
    }

    public void insertArea(Area area){
        areaMapper.insertArea(area);
    }
}
