package boco.shanxi.domain;

import java.util.Date;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-10-28 14:26
 * @description: 资源管理
 */
public class ResourceManage {

    private Integer id;
    private String resoName;    //资源名称
    private Integer resoAmt;    //资源数量
    private Date createTime;    //创建时间

    public ResourceManage() {
    }

    public ResourceManage(Integer id, String resoName, Integer resoAmt, Date createTime) {
        this.id = id;
        this.resoName = resoName;
        this.resoAmt = resoAmt;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResoName() {
        return resoName;
    }

    public void setResoName(String resoName) {
        this.resoName = resoName;
    }

    public Integer getResoAmt() {
        return resoAmt;
    }

    public void setResoAmt(Integer resoAmt) {
        this.resoAmt = resoAmt;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
