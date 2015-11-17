package com.saiz.jiuguo.app.bean;

/**
 * Created by Administrator on 2015/11/16.
 */
public class GameTypeListBean {


    /**
     * GType : 1
     * Name : Dota
     * Img : http://static.jiuguo2009.cn/Pic/20150629/1435547649.png
     */

    private int GType;
    private String Name;
    private String Img;

    public void setGType(int GType) {
        this.GType = GType;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setImg(String Img) {
        this.Img = Img;
    }

    public int getGType() {
        return GType;
    }

    public String getName() {
        return Name;
    }

    public String getImg() {
        return Img;
    }

    @Override
    public String toString() {
        return "GameTypeListBean{" +
                "GType=" + GType +
                ", Name='" + Name + '\'' +
                ", Img='" + Img + '\'' +
                '}';
    }
}
