package boco.shanxi.domain;

import java.util.Date;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-10-25 09:33
 * @description: 行为支撑
 */
public class BehaviorSupport {

    private Integer id;
    private String labelName;    //标签名称
    private Integer labelAmt;    //标签数量
    private Date createTime;     //创建时间

    public BehaviorSupport() {
    }

    public BehaviorSupport(Integer id, String labelName, Integer labelAmt, Date createTime) {
        this.id = id;
        this.labelName = labelName;
        this.labelAmt = labelAmt;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "BehaviorSupport{" +
                "id=" + id +
                ", labelName='" + labelName + '\'' +
                ", labelAmt=" + labelAmt +
                ", createTime=" + createTime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public Integer getLabelAmt() {
        return labelAmt;
    }

    public void setLabelAmt(Integer labelAmt) {
        this.labelAmt = labelAmt;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
