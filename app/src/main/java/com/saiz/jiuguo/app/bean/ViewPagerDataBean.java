package com.saiz.jiuguo.app.bean;

/**
 * Created by Administrator on 2015/11/16.
 */
public class ViewPagerDataBean {


    /**
     * VideoID : 189194  type=1
     * Title : 【小智】伪五杀盲僧，血腥500AD！
     * Img : http://static.jiuguo2009.cn/Pic/20151113/1447381953.jpg
     */

    private int VideoID;
    private String Title;
    private String Img;

    public void setVideoID(int VideoID) {
        this.VideoID = VideoID;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setImg(String Img) {
        this.Img = Img;
    }

    public int getVideoID() {
        return VideoID;
    }

    public String getTitle() {
        return Title;
    }

    public String getImg() {
        return Img;
    }
}
