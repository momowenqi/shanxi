package boco.shanxi.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-10-25 09:35
 * @description: 运营支撑
 */
public class MarketingSupport {

    private Integer id;
    private BigDecimal mkSum;    //总营销数
    private BigDecimal monMkAmt;    //本月营销数
    private BigDecimal monSucAmt;      //本月成功数
    private BigDecimal sucSum;      //总成功数
    private BigDecimal ytdMkAmt;    //昨日营销数
    private BigDecimal ytdSucAmt;    //昨日成功数
    private Date createTime;    //创建时间

    public MarketingSupport() {
    }

    public MarketingSupport(Integer id, BigDecimal mkSum, BigDecimal monMkAmt, BigDecimal monSucAmt, BigDecimal sucSum, BigDecimal ytdMkAmt, BigDecimal ytdSucAmt, Date createTime) {
        this.id = id;
        this.mkSum = mkSum;
        this.monMkAmt = monMkAmt;
        this.monSucAmt = monSucAmt;
        this.sucSum = sucSum;
        this.ytdMkAmt = ytdMkAmt;
        this.ytdSucAmt = ytdSucAmt;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getMkSum() {
        return mkSum;
    }

    public void setMkSum(BigDecimal mkSum) {
        this.mkSum = mkSum;
    }

    public BigDecimal getMonMkAmt() {
        return monMkAmt;
    }

    public void setMonMkAmt(BigDecimal monMkAmt) {
        this.monMkAmt = monMkAmt;
    }

    public BigDecimal getMonSucAmt() {
        return monSucAmt;
    }

    public void setMonSucAmt(BigDecimal monSucAmt) {
        this.monSucAmt = monSucAmt;
    }

    public BigDecimal getSucSum() {
        return sucSum;
    }

    public void setSucSum(BigDecimal sucSum) {
        this.sucSum = sucSum;
    }

    public BigDecimal getYtdMkAmt() {
        return ytdMkAmt;
    }

    public void setYtdMkAmt(BigDecimal ytdMkAmt) {
        this.ytdMkAmt = ytdMkAmt;
    }

    public BigDecimal getYtdSucAmt() {
        return ytdSucAmt;
    }

    public void setYtdSucAmt(BigDecimal ytdSucAmt) {
        this.ytdSucAmt = ytdSucAmt;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
