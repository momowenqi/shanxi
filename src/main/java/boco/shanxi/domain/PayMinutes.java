package boco.shanxi.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-10-28 10:28
 * @description: 每分钟缴费数量和成功率采集
 */
public class PayMinutes {

    private Integer id;
    private Area area;    //地区
    private String minute;     //分钟
    private Integer payAmt;    //缴费笔数
    private Integer payQuota;    //缴费额度
    private BigDecimal paySucRate;    //缴费成功率
    private Date createTime;    //创建时间

    public PayMinutes() {
    }

    public PayMinutes(Integer id, Area area, String minute, Integer payAmt, Integer payQuota, BigDecimal paySucRate, Date createTime) {
        this.id = id;
        this.area = area;
        this.minute = minute;
        this.payAmt = payAmt;
        this.payQuota = payQuota;
        this.paySucRate = paySucRate;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public Integer getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(Integer payAmt) {
        this.payAmt = payAmt;
    }

    public Integer getPayQuota() {
        return payQuota;
    }

    public void setPayQuota(Integer payQuota) {
        this.payQuota = payQuota;
    }

    public BigDecimal getPaySucRate() {
        return paySucRate;
    }

    public void setPaySucRate(BigDecimal paySucRate) {
        this.paySucRate = paySucRate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
