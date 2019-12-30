package boco.shanxi.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-10-25 08:48
 * @description: 系统支撑
 */
public class SystemSupport {

    private Integer id;    //主键
    private BigDecimal clusterDiskUsageRate;    //集群磁盘使用率
    private BigDecimal clusterMemoryUsageRate;  //集群内存使用率
    private BigDecimal dbStorageUsageRate;    //数据库存储使用率
    private Integer dbNodeState;   //数据路节点状态
    private Integer platformAgentState;      //大数据平台状态
    private Date createTime;

    public SystemSupport() {
    }

    public SystemSupport(Integer id, BigDecimal clusterDiskUsageRate, BigDecimal clusterMemoryUsageRate, BigDecimal dbStorageUsageRate, Integer dbNodeState, Integer platformAgentState, Date createTime) {
        this.id = id;
        this.clusterDiskUsageRate = clusterDiskUsageRate;
        this.clusterMemoryUsageRate = clusterMemoryUsageRate;
        this.dbStorageUsageRate = dbStorageUsageRate;
        this.dbNodeState = dbNodeState;
        this.platformAgentState = platformAgentState;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getClusterDiskUsageRate() {
        return clusterDiskUsageRate;
    }

    public void setClusterDiskUsageRate(BigDecimal clusterDiskUsageRate) {
        this.clusterDiskUsageRate = clusterDiskUsageRate;
    }

    public BigDecimal getClusterMemoryUsageRate() {
        return clusterMemoryUsageRate;
    }

    public void setClusterMemoryUsageRate(BigDecimal clusterMemoryUsageRate) {
        this.clusterMemoryUsageRate = clusterMemoryUsageRate;
    }

    public BigDecimal getDbStorageUsageRate() {
        return dbStorageUsageRate;
    }

    public void setDbStorageUsageRate(BigDecimal dbStorageUsageRate) {
        this.dbStorageUsageRate = dbStorageUsageRate;
    }

    public Integer getDbNodeState() {
        return dbNodeState;
    }

    public void setDbNodeState(Integer dbNodeState) {
        this.dbNodeState = dbNodeState;
    }

    public Integer getPlatformAgentState() {
        return platformAgentState;
    }

    public void setPlatformAgentState(Integer platformAgentState) {
        this.platformAgentState = platformAgentState;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
