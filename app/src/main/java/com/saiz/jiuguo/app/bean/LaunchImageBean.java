package com.saiz.jiuguo.app.bean;

/**
 * Created by Administrator on 2015/11/16.
 */
public class LaunchImageBean {

    /**
     * Img : http://static.jiuguo2009.cn/Pic/20150915/1442308806.png
     * Title : 玖果视频
     * Duration : 2
     * Color : #0a0f10
     * BeginTime : 2015-08-02
     * EndTime : 2015-12-31
     */

    private String Img;
    private String Title;
    private int Duration;
    private String Color;
    private String BeginTime;
    private String EndTime;

    public void setImg(String Img) {
        this.Img = Img;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setDuration(int Duration) {
        this.Duration = Duration;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public String getImg() {
        return Img;
    }

    public String getTitle() {
        return Title;
    }

    public int getDuration() {
        return Duration;
    }

    public String getColor() {
        return Color;
    }

    public String getBeginTime() {
        return BeginTime;
    }

    public String getEndTime() {
        return EndTime;
    }
}
