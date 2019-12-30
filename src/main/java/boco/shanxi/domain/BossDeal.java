package boco.shanxi.domain;

import java.util.Date;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-10-28 08:31
 * @description: BOSS话单处理情况
 */
public class BossDeal {

    private Integer id;
    private Area area;    //地区
    private Integer voice10minPAmt;    //语音十分钟处理数(万笔)
    private Integer voice10minUAmt;    //语音十分钟未处理数(万笔)
    private Integer flow10minPAmt;    //流量十分钟处理数(万笔)
    private Integer flow10minUAmt;    //流量十分钟未处理数(万笔)
    private Integer other10minPAmt;    //其他十分钟处理数(万笔)
    private Integer other10minUAmt;    //其他十分钟未处理数(万笔)
    private Integer channel10minPAmt;    //全渠道十分钟处理数(万笔)
    private Integer channel10minUAmt;    //全渠道十分钟未处理数(万笔)
    private Date createTime;    //创建时间

    public BossDeal() {
    }

    public BossDeal(Integer id, Area area, Integer voice10minPAmt, Integer voice10minUAmt, Integer flow10minPAmt, Integer flow10minUAmt, Integer other10minPAmt, Integer other10minUAmt, Integer channel10minPAmt, Integer channel10minUAmt, Date createTime) {
        this.id = id;
        this.area = area;
        this.voice10minPAmt = voice10minPAmt;
        this.voice10minUAmt = voice10minUAmt;
        this.flow10minPAmt = flow10minPAmt;
        this.flow10minUAmt = flow10minUAmt;
        this.other10minPAmt = other10minPAmt;
        this.other10minUAmt = other10minUAmt;
        this.channel10minPAmt = channel10minPAmt;
        this.channel10minUAmt = channel10minUAmt;
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

    public Integer getVoice10minPAmt() {
        return voice10minPAmt;
    }

    public void setVoice10minPAmt(Integer voice10minPAmt) {
        this.voice10minPAmt = voice10minPAmt;
    }

    public Integer getVoice10minUAmt() {
        return voice10minUAmt;
    }

    public void setVoice10minUAmt(Integer voice10minUAmt) {
        this.voice10minUAmt = voice10minUAmt;
    }

    public Integer getFlow10minPAmt() {
        return flow10minPAmt;
    }

    public void setFlow10minPAmt(Integer flow10minPAmt) {
        this.flow10minPAmt = flow10minPAmt;
    }

    public Integer getFlow10minUAmt() {
        return flow10minUAmt;
    }

    public void setFlow10minUAmt(Integer flow10minUAmt) {
        this.flow10minUAmt = flow10minUAmt;
    }

    public Integer getOther10minPAmt() {
        return other10minPAmt;
    }

    public void setOther10minPAmt(Integer other10minPAmt) {
        this.other10minPAmt = other10minPAmt;
    }

    public Integer getOther10minUAmt() {
        return other10minUAmt;
    }

    public void setOther10minUAmt(Integer other10minUAmt) {
        this.other10minUAmt = other10minUAmt;
    }

    public Integer getChannel10minPAmt() {
        return channel10minPAmt;
    }

    public void setChannel10minPAmt(Integer channel10minPAmt) {
        this.channel10minPAmt = channel10minPAmt;
    }

    public Integer getChannel10minUAmt() {
        return channel10minUAmt;
    }

    public void setChannel10minUAmt(Integer channel10minUAmt) {
        this.channel10minUAmt = channel10minUAmt;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
