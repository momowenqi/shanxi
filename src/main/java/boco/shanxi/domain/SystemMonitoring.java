package boco.shanxi.domain;

import java.util.Date;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-10-28 14:29
 * @description: 系统监控模块
 */
public class SystemMonitoring {

    private Integer id;
    private String systemName;    //系统名称
    private Integer alertAmt;    //告警数量
    private Integer workOrderAmt;    //工单数
    private Date createTime;    //创建时间

    public SystemMonitoring() {
    }

    public SystemMonitoring(Integer id, String systemName, Integer alertAmt, Integer workOrderAmt, Date createTime) {
        this.id = id;
        this.systemName = systemName;
        this.alertAmt = alertAmt;
        this.workOrderAmt = workOrderAmt;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public Integer getAlertAmt() {
        return alertAmt;
    }

    public void setAlertAmt(Integer alertAmt) {
        this.alertAmt = alertAmt;
    }

    public Integer getWorkOrderAmt() {
        return workOrderAmt;
    }

    public void setWorkOrderAmt(Integer workOrderAmt) {
        this.workOrderAmt = workOrderAmt;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
