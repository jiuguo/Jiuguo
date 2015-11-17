package com.saiz.jiuguo.app.bean;

/**
 * Created by Administrator on 2015/11/16.
 */
public class MatchDataBean {

    /**
     * tpye=2
     * CTID : 472
     * AName : EHOME
     * ALogo : http://static.jiuguo2009.cn/Pic/20150615/1434348015.png
     * BName : NewBee.Y
     * BLogo : http://static.jiuguo2009.cn/Pic/20150714/1436857129.png
     * Score : 0:0
     * Title : 法兰克福特锦赛
     * Status : 0
     * GameLogo : http://static.jiuguo2009.cn/Pic/20150629/1435547661.png
     */

    private int CTID;
    private String AName;
    private String ALogo;
    private String BName;
    private String BLogo;
    private String Score;
    private String Title;
    private int Status;
    private String GameLogo;

    public void setCTID(int CTID) {
        this.CTID = CTID;
    }

    public void setAName(String AName) {
        this.AName = AName;
    }

    public void setALogo(String ALogo) {
        this.ALogo = ALogo;
    }

    public void setBName(String BName) {
        this.BName = BName;
    }

    public void setBLogo(String BLogo) {
        this.BLogo = BLogo;
    }

    public void setScore(String Score) {
        this.Score = Score;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

    public void setGameLogo(String GameLogo) {
        this.GameLogo = GameLogo;
    }

    public int getCTID() {
        return CTID;
    }

    public String getAName() {
        return AName;
    }

    public String getALogo() {
        return ALogo;
    }

    public String getBName() {
        return BName;
    }

    public String getBLogo() {
        return BLogo;
    }

    public String getScore() {
        return Score;
    }

    public String getTitle() {
        return Title;
    }

    public int getStatus() {
        return Status;
    }

    public String getGameLogo() {
        return GameLogo;
    }
}
