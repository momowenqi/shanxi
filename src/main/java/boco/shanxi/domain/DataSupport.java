package boco.shanxi.domain;

import java.util.Date;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-10-24 16:38
 * @description: 数据支撑
 */
public class DataSupport {

    private Integer id;
    private String modelName;    //模型名称
    private Integer modelAmt;     //模型数量
    private Date createTime;      //创建时间

    public DataSupport() {
    }

    public DataSupport(Integer id, String modelName, Integer modelAmt, Date createTime) {
        this.id = id;
        this.modelName = modelName;
        this.modelAmt = modelAmt;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getModelAmt() {
        return modelAmt;
    }

    public void setModelAmt(Integer modelAmt) {
        this.modelAmt = modelAmt;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
