package boco.shanxi.domain;

import java.util.Date;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-10-24 15:22
 * @description: 经分大数据
 */
public class BigData {

    private Integer id;
    private Integer bizDispatchErrAmt;    //一经报错调度数
    private Integer bizMonitoring;        //一经流量清单加载完成监控
    private Integer phoneDispatchErrAmt;   //手机经分调度报错数
    private Integer verticaMonitoring;     //VERTICA流量清单加载完成监控
    private Integer bizBill;              //一经账单收入日环比
    private Integer db2Bill;                //DB2账单收入日环比
    private Integer verticaBill;           //VERTICA账单收入日环比
    private Date createTime;              //创建时间

    public BigData() {
    }

    public BigData(Integer id, Integer bizDispatchErrAmt, Integer bizMonitoring, Integer phoneDispatchErrAmt, Integer verticaMonitoring, Integer bizBill, Integer db2Bill, Integer verticaBill, Date createTime) {
        this.id = id;
        this.bizDispatchErrAmt = bizDispatchErrAmt;
        this.bizMonitoring = bizMonitoring;
        this.phoneDispatchErrAmt = phoneDispatchErrAmt;
        this.verticaMonitoring = verticaMonitoring;
        this.bizBill = bizBill;
        this.db2Bill = db2Bill;
        this.verticaBill = verticaBill;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBizDispatchErrAmt() {
        return bizDispatchErrAmt;
    }

    public void setBizDispatchErrAmt(Integer bizDispatchErrAmt) {
        this.bizDispatchErrAmt = bizDispatchErrAmt;
    }

    public Integer getBizMonitoring() {
        return bizMonitoring;
    }

    public void setBizMonitoring(Integer bizMonitoring) {
        this.bizMonitoring = bizMonitoring;
    }

    public Integer getPhoneDispatchErrAmt() {
        return phoneDispatchErrAmt;
    }

    public void setPhoneDispatchErrAmt(Integer phoneDispatchErrAmt) {
        this.phoneDispatchErrAmt = phoneDispatchErrAmt;
    }

    public Integer getVerticaMonitoring() {
        return verticaMonitoring;
    }

    public void setVerticaMonitoring(Integer verticaMonitoring) {
        this.verticaMonitoring = verticaMonitoring;
    }

    public Integer getBizBill() {
        return bizBill;
    }

    public void setBizBill(Integer bizBill) {
        this.bizBill = bizBill;
    }

    public Integer getDb2Bill() {
        return db2Bill;
    }

    public void setDb2Bill(Integer db2Bill) {
        this.db2Bill = db2Bill;
    }

    public Integer getVerticaBill() {
        return verticaBill;
    }

    public void setVerticaBill(Integer verticaBill) {
        this.verticaBill = verticaBill;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
