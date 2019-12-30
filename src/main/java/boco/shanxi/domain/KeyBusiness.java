package boco.shanxi.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-10-28 08:53
 * @description: 重点业务运营情况
 */
public class KeyBusiness {

    private Integer id;
    private Area area;    //地区
    private Integer openAccount5minProcessAmt;    //开户5分钟处理量
    private BigDecimal openAccountAvgTime;    //开户平均处理时长
    private Integer prodUpd5minProcessAmt;    //产品更新5分钟受理量
    private BigDecimal prodUpdAvgTime;    //产品更新平均处理时长
    private Integer mkAct5minProcessAmt;    //营销活动5分钟受理量
    private BigDecimal mkActAvgTime;    //营销活动平均处理时长
    private Integer chgCard5minProcessAmt;    //换卡5分钟处理量
    private BigDecimal chgCardAvgTime;    //换卡平均处理时长
    private Integer openAccountErrAmt;    //开户错单数
    private BigDecimal openAccount3minCompRate;    //开户3分钟处理及时完工率
    private Integer prodUpdErrAmt;    //产品更新错单量
    private BigDecimal prodUpd3minCompRate;    //产品更新3分钟处理及时完工率
    private Integer mkActErrAmt;    //营销活动错单量
    private BigDecimal mkAct3minCompRate;    //营销活动3分钟处理及时完工率
    private Integer chgCardErrAmt;    //换卡错单量
    private BigDecimal chgCard3minCompRate;    //换卡3分钟处理及时完工率
    private Date createTime;    //创建时间

    public KeyBusiness() {
    }

    public KeyBusiness(Integer id, Area area, Integer openAccount5minProcessAmt, BigDecimal openAccountAvgTime, Integer prodUpd5minProcessAmt, BigDecimal prodUpdAvgTime, Integer mkAct5minProcessAmt, BigDecimal mkActAvgTime, Integer chgCard5minProcessAmt, BigDecimal chgCardAvgTime, Integer openAccountErrAmt, BigDecimal openAccount3minCompRate, Integer prodUpdErrAmt, BigDecimal prodUpd3minCompRate, Integer mkActErrAmt, BigDecimal mkAct3minCompRate, Integer chgCardErrAmt, BigDecimal chgCard3minCompRate, Date createTime) {
        this.id = id;
        this.area = area;
        this.openAccount5minProcessAmt = openAccount5minProcessAmt;
        this.openAccountAvgTime = openAccountAvgTime;
        this.prodUpd5minProcessAmt = prodUpd5minProcessAmt;
        this.prodUpdAvgTime = prodUpdAvgTime;
        this.mkAct5minProcessAmt = mkAct5minProcessAmt;
        this.mkActAvgTime = mkActAvgTime;
        this.chgCard5minProcessAmt = chgCard5minProcessAmt;
        this.chgCardAvgTime = chgCardAvgTime;
        this.openAccountErrAmt = openAccountErrAmt;
        this.openAccount3minCompRate = openAccount3minCompRate;
        this.prodUpdErrAmt = prodUpdErrAmt;
        this.prodUpd3minCompRate = prodUpd3minCompRate;
        this.mkActErrAmt = mkActErrAmt;
        this.mkAct3minCompRate = mkAct3minCompRate;
        this.chgCardErrAmt = chgCardErrAmt;
        this.chgCard3minCompRate = chgCard3minCompRate;
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

    public Integer getOpenAccount5minProcessAmt() {
        return openAccount5minProcessAmt;
    }

    public void setOpenAccount5minProcessAmt(Integer openAccount5minProcessAmt) {
        this.openAccount5minProcessAmt = openAccount5minProcessAmt;
    }

    public BigDecimal getOpenAccountAvgTime() {
        return openAccountAvgTime;
    }

    public void setOpenAccountAvgTime(BigDecimal openAccountAvgTime) {
        this.openAccountAvgTime = openAccountAvgTime;
    }

    public Integer getProdUpd5minProcessAmt() {
        return prodUpd5minProcessAmt;
    }

    public void setProdUpd5minProcessAmt(Integer prodUpd5minProcessAmt) {
        this.prodUpd5minProcessAmt = prodUpd5minProcessAmt;
    }

    public BigDecimal getProdUpdAvgTime() {
        return prodUpdAvgTime;
    }

    public void setProdUpdAvgTime(BigDecimal prodUpdAvgTime) {
        this.prodUpdAvgTime = prodUpdAvgTime;
    }

    public Integer getMkAct5minProcessAmt() {
        return mkAct5minProcessAmt;
    }

    public void setMkAct5minProcessAmt(Integer mkAct5minProcessAmt) {
        this.mkAct5minProcessAmt = mkAct5minProcessAmt;
    }

    public BigDecimal getMkActAvgTime() {
        return mkActAvgTime;
    }

    public void setMkActAvgTime(BigDecimal mkActAvgTime) {
        this.mkActAvgTime = mkActAvgTime;
    }

    public Integer getChgCard5minProcessAmt() {
        return chgCard5minProcessAmt;
    }

    public void setChgCard5minProcessAmt(Integer chgCard5minProcessAmt) {
        this.chgCard5minProcessAmt = chgCard5minProcessAmt;
    }

    public BigDecimal getChgCardAvgTime() {
        return chgCardAvgTime;
    }

    public void setChgCardAvgTime(BigDecimal chgCardAvgTime) {
        this.chgCardAvgTime = chgCardAvgTime;
    }

    public Integer getOpenAccountErrAmt() {
        return openAccountErrAmt;
    }

    public void setOpenAccountErrAmt(Integer openAccountErrAmt) {
        this.openAccountErrAmt = openAccountErrAmt;
    }

    public BigDecimal getOpenAccount3minCompRate() {
        return openAccount3minCompRate;
    }

    public void setOpenAccount3minCompRate(BigDecimal openAccount3minCompRate) {
        this.openAccount3minCompRate = openAccount3minCompRate;
    }

    public Integer getProdUpdErrAmt() {
        return prodUpdErrAmt;
    }

    public void setProdUpdErrAmt(Integer prodUpdErrAmt) {
        this.prodUpdErrAmt = prodUpdErrAmt;
    }

    public BigDecimal getProdUpd3minCompRate() {
        return prodUpd3minCompRate;
    }

    public void setProdUpd3minCompRate(BigDecimal prodUpd3minCompRate) {
        this.prodUpd3minCompRate = prodUpd3minCompRate;
    }

    public Integer getMkActErrAmt() {
        return mkActErrAmt;
    }

    public void setMkActErrAmt(Integer mkActErrAmt) {
        this.mkActErrAmt = mkActErrAmt;
    }

    public BigDecimal getMkAct3minCompRate() {
        return mkAct3minCompRate;
    }

    public void setMkAct3minCompRate(BigDecimal mkAct3minCompRate) {
        this.mkAct3minCompRate = mkAct3minCompRate;
    }

    public Integer getChgCardErrAmt() {
        return chgCardErrAmt;
    }

    public void setChgCardErrAmt(Integer chgCardErrAmt) {
        this.chgCardErrAmt = chgCardErrAmt;
    }

    public BigDecimal getChgCard3minCompRate() {
        return chgCard3minCompRate;
    }

    public void setChgCard3minCompRate(BigDecimal chgCard3minCompRate) {
        this.chgCard3minCompRate = chgCard3minCompRate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
