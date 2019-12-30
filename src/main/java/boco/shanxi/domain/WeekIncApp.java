package boco.shanxi.domain;

import java.util.Date;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-10-25 10:35
 * @description: 当周新增应用个数
 */
public class WeekIncApp {

    private Integer id;
    private String appName;    //应用名称
    private Integer appIncAmt;    //数量
    private Date createTime;    //创建时间

    public WeekIncApp() {
    }

    public WeekIncApp(Integer id, String appName, Integer appIncAmt, Date createTime) {
        this.id = id;
        this.appName = appName;
        this.appIncAmt = appIncAmt;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Integer getAppIncAmt() {
        return appIncAmt;
    }

    public void setAppIncAmt(Integer appIncAmt) {
        this.appIncAmt = appIncAmt;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
