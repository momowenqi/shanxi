package boco.shanxi.domain;

import java.util.Date;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-10-25 09:44
 * @description: 对外支撑
 */
public class ScenicTourist {

    private Integer id;
    private String scenicName;    //景区名称
    private Integer touristsAmt;    //景区游客数
    private Date createTime;    //创建时间

    public ScenicTourist() {
    }

    public ScenicTourist(Integer id, String scenicName, Integer touristsAmt, Date createTime) {
        this.id = id;
        this.scenicName = scenicName;
        this.touristsAmt = touristsAmt;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScenicName() {
        return scenicName;
    }

    public void setScenicName(String scenicName) {
        this.scenicName = scenicName;
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
