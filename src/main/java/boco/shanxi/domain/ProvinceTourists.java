package boco.shanxi.domain;

import java.util.Date;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-10-25 09:49
 * @description: 省外游客数
 */
public class ProvinceTourists {

    private Integer id;
    private String province;    //省份名称
    private Integer touristsAmt;   //游客数
    private Date createTime;    //创建时间

    public ProvinceTourists() {
    }

    public ProvinceTourists(Integer id, String province, Integer touristsAmt, Date createTime) {
        this.id = id;
        this.province = province;
        this.touristsAmt = touristsAmt;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getTouristsAmt() {
        return touristsAmt;
    }

    public void setTouristsAmt(Integer touristsAmt) {
        this.touristsAmt = touristsAmt;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
