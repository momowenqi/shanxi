package boco.shanxi.service;

import boco.shanxi.domain.ScenicTourist;
import boco.shanxi.mapper.ScenicTouristMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-11-05 14:47
 * @description: 对外支撑
 */
@Service
public class ScenicTouristService {

    @Autowired
    private ScenicTouristMapper scenicTouristMapper;

    public void saveScenicTourist(ScenicTourist scenicTourist) {
        scenicTouristMapper.addScenicTourist(scenicTourist);
    }

    public List<ScenicTourist> findScenicTourist() {
        return scenicTouristMapper.selectScenicTourist();
    }
}
