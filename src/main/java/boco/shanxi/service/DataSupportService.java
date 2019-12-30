package boco.shanxi.service;

import boco.shanxi.domain.DataSupport;
import boco.shanxi.mapper.DataSupportMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-11-05 10:38
 * @description: 数据支撑
 */
@Service
public class DataSupportService {

    @Autowired
    private DataSupportMapper dataSupportMapper;

    public void saveDataSupport(DataSupport dataSupport) {
        dataSupportMapper.addDataSupport(dataSupport);
    }

    public List<DataSupport> findDataSupport() {
        return dataSupportMapper.selectDataSupportList();
    }
}
