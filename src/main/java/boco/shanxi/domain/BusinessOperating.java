package boco.shanxi.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-10-25 10:44
 * @description: 业务运营
 */
public class BusinessOperating {

    private Integer id;
    private Area area;    //地区
    private BigDecimal queryBizTime;    //查询类业务办理时长
    private BigDecimal acceptBizTime;   //受理类业务办理时长
    private Integer payBootWorkOrderAmt;    //缴费开机工单量
    private BigDecimal payBootAvgTime;    //缴费开机平均时长
    private BigDecimal openAccountAvgTime;    //开户平均时长
    private BigDecimal productChgAvgTime;    //产品变更平均时长
    private BigDecimal mkActAvgTime;    //营销活动办理平均时长
    private BigDecimal dataQueryAvgTime;    //客户资料平均办理时长
    private BigDecimal billQueryAvgTime;    //账单查询平均时长
    private BigDecimal unifiedAcPfDealSucRate;    //统一认证平台交易成功率
    private BigDecimal detectSucRate;    //探测成功率
    private Integer bossInterfaceDealAmt;    //一级BOSS接口交易量
    private BigDecimal bossInterfaceSucRate;    //一级BOSS接口成功率
    private Integer provinceInterfaceDealAmt;    //省内接口交易量
    private BigDecimal provinceInterfaceSucRate;    //省内接口成功率
    private BigDecimal oneMinBootTimelyRate;    //一分钟开机及时率
    private BigDecimal threeMinBootTimelyRate;    //三分钟开机及时率
    private BigDecimal fiveMinBootTimelyRate;    //五分钟开机及时率
    private Integer eneityCrmAmt;    //实体渠道CRM业务受理数
    private Integer elecCrmAmt;    //电子渠道CRM业务受理数
    private Integer ivrCrmAmt;    //IVR渠道CRM业务受理数
    private Integer bossCrmAmt;    //一级BOSS渠道CRM业务受理数
    private Integer otherCrmAmt;    //其他渠道CRM业务受理数
    private BigDecimal flowExhaustionAlertSucRate;    //流量用尽提醒成功率
    private BigDecimal fivemFlowAlertSmsTimelyRate;    //5分钟流量提醒短信及时率
    private Date createTime;     //创建时间

    public BusinessOperating() {
    }

    public BusinessOperating(Integer id, Area area, BigDecimal queryBizTime, BigDecimal acceptBizTime, Integer payBootWorkOrderAmt, BigDecimal payBootAvgTime, BigDecimal openAccountAvgTime, BigDecimal productChgAvgTime, BigDecimal mkActAvgTime, BigDecimal dataQueryAvgTime, BigDecimal billQueryAvgTime, BigDecimal unifiedAcPfDealSucRate, BigDecimal detectSucRate, Integer bossInterfaceDealAmt, BigDecimal bossInterfaceSucRate, Integer provinceInterfaceDealAmt, BigDecimal provinceInterfaceSucRate, BigDecimal oneMinBootTimelyRate, BigDecimal threeMinBootTimelyRate, BigDecimal fiveMinBootTimelyRate, Integer eneityCrmAmt, Integer elecCrmAmt, Integer ivrCrmAmt, Integer bossCrmAmt, Integer otherCrmAmt, BigDecimal flowExhaustionAlertSucRate, BigDecimal fivemFlowAlertSmsTimelyRate, Date createTime) {
        this.id = id;
        this.area = area;
        this.queryBizTime = queryBizTime;
        this.acceptBizTime = acceptBizTime;
        this.payBootWorkOrderAmt = payBootWorkOrderAmt;
        this.payBootAvgTime = payBootAvgTime;
        this.openAccountAvgTime = openAccountAvgTime;
        this.productChgAvgTime = productChgAvgTime;
        this.mkActAvgTime = mkActAvgTime;
        this.dataQueryAvgTime = dataQueryAvgTime;
        this.billQueryAvgTime = billQueryAvgTime;
        this.unifiedAcPfDealSucRate = unifiedAcPfDealSucRate;
        this.detectSucRate = detectSucRate;
        this.bossInterfaceDealAmt = bossInterfaceDealAmt;
        this.bossInterfaceSucRate = bossInterfaceSucRate;
        this.provinceInterfaceDealAmt = provinceInterfaceDealAmt;
        this.provinceInterfaceSucRate = provinceInterfaceSucRate;
        this.oneMinBootTimelyRate = oneMinBootTimelyRate;
        this.threeMinBootTimelyRate = threeMinBootTimelyRate;
        this.fiveMinBootTimelyRate = fiveMinBootTimelyRate;
        this.eneityCrmAmt = eneityCrmAmt;
        this.elecCrmAmt = elecCrmAmt;
        this.ivrCrmAmt = ivrCrmAmt;
        this.bossCrmAmt = bossCrmAmt;
        this.otherCrmAmt = otherCrmAmt;
        this.flowExhaustionAlertSucRate = flowExhaustionAlertSucRate;
        this.fivemFlowAlertSmsTimelyRate = fivemFlowAlertSmsTimelyRate;
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

    public BigDecimal getQueryBizTime() {
        return queryBizTime;
    }

    public void setQueryBizTime(BigDecimal queryBizTime) {
        this.queryBizTime = queryBizTime;
    }

    public BigDecimal getAcceptBizTime() {
        return acceptBizTime;
    }

    public void setAcceptBizTime(BigDecimal acceptBizTime) {
        this.acceptBizTime = acceptBizTime;
    }

    public Integer getPayBootWorkOrderAmt() {
        return payBootWorkOrderAmt;
    }

    public void setPayBootWorkOrderAmt(Integer payBootWorkOrderAmt) {
        this.payBootWorkOrderAmt = payBootWorkOrderAmt;
    }

    public BigDecimal getPayBootAvgTime() {
        return payBootAvgTime;
    }

    public void setPayBootAvgTime(BigDecimal payBootAvgTime) {
        this.payBootAvgTime = payBootAvgTime;
    }

    public BigDecimal getOpenAccountAvgTime() {
        return openAccountAvgTime;
    }

    public void setOpenAccountAvgTime(BigDecimal openAccountAvgTime) {
        this.openAccountAvgTime = openAccountAvgTime;
    }

    public BigDecimal getProductChgAvgTime() {
        return productChgAvgTime;
    }

    public void setProductChgAvgTime(BigDecimal productChgAvgTime) {
        this.productChgAvgTime = productChgAvgTime;
    }

    public BigDecimal getMkActAvgTime() {
        return mkActAvgTime;
    }

    public void setMkActAvgTime(BigDecimal mkActAvgTime) {
        this.mkActAvgTime = mkActAvgTime;
    }

    public BigDecimal getDataQueryAvgTime() {
        return dataQueryAvgTime;
    }

    public void setDataQueryAvgTime(BigDecimal dataQueryAvgTime) {
        this.dataQueryAvgTime = dataQueryAvgTime;
    }

    public BigDecimal getBillQueryAvgTime() {
        return billQueryAvgTime;
    }

    public void setBillQueryAvgTime(BigDecimal billQueryAvgTime) {
        this.billQueryAvgTime = billQueryAvgTime;
    }

    public BigDecimal getUnifiedAcPfDealSucRate() {
        return unifiedAcPfDealSucRate;
    }

    public void setUnifiedAcPfDealSucRate(BigDecimal unifiedAcPfDealSucRate) {
        this.unifiedAcPfDealSucRate = unifiedAcPfDealSucRate;
    }

    public BigDecimal getDetectSucRate() {
        return detectSucRate;
    }

    public void setDetectSucRate(BigDecimal detectSucRate) {
        this.detectSucRate = detectSucRate;
    }

    public Integer getBossInterfaceDealAmt() {
        return bossInterfaceDealAmt;
    }

    public void setBossInterfaceDealAmt(Integer bossInterfaceDealAmt) {
        this.bossInterfaceDealAmt = bossInterfaceDealAmt;
    }

    public BigDecimal getBossInterfaceSucRate() {
        return bossInterfaceSucRate;
    }

    public void setBossInterfaceSucRate(BigDecimal bossInterfaceSucRate) {
        this.bossInterfaceSucRate = bossInterfaceSucRate;
    }

    public Integer getProvinceInterfaceDealAmt() {
        return provinceInterfaceDealAmt;
    }

    public void setProvinceInterfaceDealAmt(Integer provinceInterfaceDealAmt) {
        this.provinceInterfaceDealAmt = provinceInterfaceDealAmt;
    }

    public BigDecimal getProvinceInterfaceSucRate() {
        return provinceInterfaceSucRate;
    }

    public void setProvinceInterfaceSucRate(BigDecimal provinceInterfaceSucRate) {
        this.provinceInterfaceSucRate = provinceInterfaceSucRate;
    }

    public BigDecimal getOneMinBootTimelyRate() {
        return oneMinBootTimelyRate;
    }

    public void setOneMinBootTimelyRate(BigDecimal oneMinBootTimelyRate) {
        this.oneMinBootTimelyRate = oneMinBootTimelyRate;
    }

    public BigDecimal getThreeMinBootTimelyRate() {
        return threeMinBootTimelyRate;
    }

    public void setThreeMinBootTimelyRate(BigDecimal threeMinBootTimelyRate) {
        this.threeMinBootTimelyRate = threeMinBootTimelyRate;
    }

    public BigDecimal getFiveMinBootTimelyRate() {
        return fiveMinBootTimelyRate;
    }

    public void setFiveMinBootTimelyRate(BigDecimal fiveMinBootTimelyRate) {
        this.fiveMinBootTimelyRate = fiveMinBootTimelyRate;
    }

    public Integer getEneityCrmAmt() {
        return eneityCrmAmt;
    }

    public void setEneityCrmAmt(Integer eneityCrmAmt) {
        this.eneityCrmAmt = eneityCrmAmt;
    }

    public Integer getElecCrmAmt() {
        return elecCrmAmt;
    }

    public void setElecCrmAmt(Integer elecCrmAmt) {
        this.elecCrmAmt = elecCrmAmt;
    }

    public Integer getIvrCrmAmt() {
        return ivrCrmAmt;
    }

    public void setIvrCrmAmt(Integer ivrCrmAmt) {
        this.ivrCrmAmt = ivrCrmAmt;
    }

    public Integer getBossCrmAmt() {
        return bossCrmAmt;
    }

    public void setBossCrmAmt(Integer bossCrmAmt) {
        this.bossCrmAmt = bossCrmAmt;
    }

    public Integer getOtherCrmAmt() {
        return otherCrmAmt;
    }

    public void setOtherCrmAmt(Integer otherCrmAmt) {
        this.otherCrmAmt = otherCrmAmt;
    }

    public BigDecimal getFlowExhaustionAlertSucRate() {
        return flowExhaustionAlertSucRate;
    }

    public void setFlowExhaustionAlertSucRate(BigDecimal flowExhaustionAlertSucRate) {
        this.flowExhaustionAlertSucRate = flowExhaustionAlertSucRate;
    }

    public BigDecimal getFivemFlowAlertSmsTimelyRate() {
        return fivemFlowAlertSmsTimelyRate;
    }

    public void setFivemFlowAlertSmsTimelyRate(BigDecimal fivemFlowAlertSmsTimelyRate) {
        this.fivemFlowAlertSmsTimelyRate = fivemFlowAlertSmsTimelyRate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
