package boco.shanxi.service;

import boco.shanxi.domain.BigData;
import boco.shanxi.mapper.BigDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-11-05 09:21
 * @description: 经分大数据
 */
@Service
public class BigDataService {

    @Autowired
    private BigDataMapper bigDataMapper;

    public void saveBigData(BigData bigData){
        bigDataMapper.addBigData(bigData);
    }

    public List<BigData> findBigData(){
        return bigDataMapper.selectBigDataList();
    }

}
