package boco.shanxi.domain;

import java.util.Date;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-10-24 17:06
 * @description: 一线支撑
 */
public class FrontLineSupport {

    private Integer id;           //主键
    private Integer userAmt;      //用户数
    private Integer reportAmt;    //报表数
    private Integer viewsAmt;      //访问量
    private Integer mmsConfigAmt;    //彩信配置数
    private Integer mmsViews;   //彩信访问量
    private Integer automaticAccess;    //自助取数
    private Integer monthListDlAmt;    //清单月下载数
    private Date createTime;    //创建时间

    public FrontLineSupport() {
    }

    public FrontLineSupport(Integer id, Integer userAmt, Integer reportAmt, Integer viewsAmt, Integer mmsConfigAmt, Integer mmsViews, Integer automaticAccess, Integer monthListDlAmt, Date createTime) {
        this.id = id;
        this.userAmt = userAmt;
        this.reportAmt = reportAmt;
        this.viewsAmt = viewsAmt;
        this.mmsConfigAmt = mmsConfigAmt;
        this.mmsViews = mmsViews;
        this.automaticAccess = automaticAccess;
        this.monthListDlAmt = monthListDlAmt;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserAmt() {
        return userAmt;
    }

    public void setUserAmt(Integer userAmt) {
        this.userAmt = userAmt;
    }

    public Integer getReportAmt() {
        return reportAmt;
    }

    public void setReportAmt(Integer reportAmt) {
        this.reportAmt = reportAmt;
    }

    public Integer getViewsAmt() {
        return viewsAmt;
    }

    public void setViewsAmt(Integer viewsAmt) {
        this.viewsAmt = viewsAmt;
    }

    public Integer getMmsConfigAmt() {
        return mmsConfigAmt;
    }

    public void setMmsConfigAmt(Integer mmsConfigAmt) {
        this.mmsConfigAmt = mmsConfigAmt;
    }

    public Integer getMmsViews() {
        return mmsViews;
    }

    public void setMmsViews(Integer mmsViews) {
        this.mmsViews = mmsViews;
    }

    public Integer getAutomaticAccess() {
        return automaticAccess;
    }

    public void setAutomaticAccess(Integer automaticAccess) {
        this.automaticAccess = automaticAccess;
    }

    public Integer getMonthListDlAmt() {
        return monthListDlAmt;
    }

    public void setMonthListDlAmt(Integer monthListDlAmt) {
        this.monthListDlAmt = monthListDlAmt;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
