package com.saiz.jiuguo.app.bean;

/**
 * Created by Administrator on 2015/11/16.
 */
public class VideTitleBean {

    /**
     * tpye=9
     * VideoID : 190401
     * Title : 09DOTA情感类电视剧精彩瞬间117
     * Image : http://static.jiuguo2009.cn/pic/updateimage/dota/其他1.jpg
     * PCount : 490
     * PName : 章鱼丸
     * PubTime : 2015-11-15
     */

    private int VideoID;
    private String Title;
    private String Image;
    private int PCount;
    private String PName;
    private String PubTime;

    public void setVideoID(int VideoID) {
        this.VideoID = VideoID;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public void setPCount(int PCount) {
        this.PCount = PCount;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }

    public void setPubTime(String PubTime) {
        this.PubTime = PubTime;
    }

    public int getVideoID() {
        return VideoID;
    }

    public String getTitle() {
        return Title;
    }

    public String getImage() {
        return Image;
    }

    public int getPCount() {
        return PCount;
    }

    public String getPName() {
        return PName;
    }

    public String getPubTime() {
        return PubTime;
    }
}
