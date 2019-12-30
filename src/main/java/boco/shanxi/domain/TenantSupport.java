package boco.shanxi.domain;

import java.util.Date;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-10-25 10:02
 * @description: 租户支撑
 */
public class TenantSupport {

    private Integer id;
    private Integer monthIncAmt;    //当月租户新增应用个数
    private Integer weekIncAmt;     //当周租户新增应用个数
    private Integer monthCompDispatchAmt;    //当月租户完成调度个数
    private Integer weekCompDispatchAmt;     //当周租户完成调度个数
    private Integer userAmt;    //租户用户数
    private Integer appAmt;     //租户应用数
    private Integer activeAmt;  //租户活跃数
    private Date createTime;    //创建时间

    public TenantSupport() {
    }

    public TenantSupport(Integer id, Integer monthIncAmt, Integer weekIncAmt, Integer monthCompDispatchAmt, Integer weekCompDispatchAmt, Integer userAmt, Integer appAmt, Integer activeAmt, Date createTime) {
        this.id = id;
        this.monthIncAmt = monthIncAmt;
        this.weekIncAmt = weekIncAmt;
        this.monthCompDispatchAmt = monthCompDispatchAmt;
        this.weekCompDispatchAmt = weekCompDispatchAmt;
        this.userAmt = userAmt;
        this.appAmt = appAmt;
        this.activeAmt = activeAmt;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMonthIncAmt() {
        return monthIncAmt;
    }

    public void setMonthIncAmt(Integer monthIncAmt) {
        this.monthIncAmt = monthIncAmt;
    }

    public Integer getWeekIncAmt() {
        return weekIncAmt;
    }

    public void setWeekIncAmt(Integer weekIncAmt) {
        this.weekIncAmt = weekIncAmt;
    }

    public Integer getMonthCompDispatchAmt() {
        return monthCompDispatchAmt;
    }

    public void setMonthCompDispatchAmt(Integer monthCompDispatchAmt) {
        this.monthCompDispatchAmt = monthCompDispatchAmt;
    }

    public Integer getWeekCompDispatchAmt() {
        return weekCompDispatchAmt;
    }

    public void setWeekCompDispatchAmt(Integer weekCompDispatchAmt) {
        this.weekCompDispatchAmt = weekCompDispatchAmt;
    }

    public Integer getUserAmt() {
        return userAmt;
    }

    public void setUserAmt(Integer userAmt) {
        this.userAmt = userAmt;
    }

    public Integer getAppAmt() {
        return appAmt;
    }

    public void setAppAmt(Integer appAmt) {
        this.appAmt = appAmt;
    }

    public Integer getActiveAmt() {
        return activeAmt;
    }

    public void setActiveAmt(Integer activeAmt) {
        this.activeAmt = activeAmt;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
