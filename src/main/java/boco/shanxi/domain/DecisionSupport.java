package boco.shanxi.domain;

import java.util.Date;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-10-25 09:06
 * @description: 决策支撑
 */
public class DecisionSupport {

    private Integer id;
    private Integer mobileFlow;    //手机流量
    private Integer mobileFlowGrowth;    //手机流量增幅
    private Integer commCustomerArrival;    //通信客户到达
    private Integer commCustomerNetInc;    //通信客户净增
    private Integer commCustomerShare;     //通信客户份额
    private Integer fourgCustomerArrival;    //4G客户到达
    private Integer fourgCustomerNetInc;    //4G客户净增
    private Date createTime;    //创建时间

    public DecisionSupport() {
    }

    public DecisionSupport(Integer id, Integer mobileFlow, Integer mobileFlowGrowth, Integer commCustomerArrival, Integer commCustomerNetInc, Integer commCustomerShare, Integer fourgCustomerArrival, Integer fourgCustomerNetInc, Date createTime) {
        this.id = id;
        this.mobileFlow = mobileFlow;
        this.mobileFlowGrowth = mobileFlowGrowth;
        this.commCustomerArrival = commCustomerArrival;
        this.commCustomerNetInc = commCustomerNetInc;
        this.commCustomerShare = commCustomerShare;
        this.fourgCustomerArrival = fourgCustomerArrival;
        this.fourgCustomerNetInc = fourgCustomerNetInc;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMobileFlow() {
        return mobileFlow;
    }

    public void setMobileFlow(Integer mobileFlow) {
        this.mobileFlow = mobileFlow;
    }

    public Integer getMobileFlowGrowth() {
        return mobileFlowGrowth;
    }

    public void setMobileFlowGrowth(Integer mobileFlowGrowth) {
        this.mobileFlowGrowth = mobileFlowGrowth;
    }

    public Integer getCommCustomerArrival() {
        return commCustomerArrival;
    }

    public void setCommCustomerArrival(Integer commCustomerArrival) {
        this.commCustomerArrival = commCustomerArrival;
    }

    public Integer getCommCustomerNetInc() {
        return commCustomerNetInc;
    }

    public void setCommCustomerNetInc(Integer commCustomerNetInc) {
        this.commCustomerNetInc = commCustomerNetInc;
    }

    public Integer getCommCustomerShare() {
        return commCustomerShare;
    }

    public void setCommCustomerShare(Integer commCustomerShare) {
        this.commCustomerShare = commCustomerShare;
    }

    public Integer getFourgCustomerArrival() {
        return fourgCustomerArrival;
    }

    public void setFourgCustomerArrival(Integer fourgCustomerArrival) {
        this.fourgCustomerArrival = fourgCustomerArrival;
    }

    public Integer getFourgCustomerNetInc() {
        return fourgCustomerNetInc;
    }

    public void setFourgCustomerNetInc(Integer fourgCustomerNetInc) {
        this.fourgCustomerNetInc = fourgCustomerNetInc;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
