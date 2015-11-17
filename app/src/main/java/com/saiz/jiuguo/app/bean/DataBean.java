package com.saiz.jiuguo.app.bean;

import java.util.List;

/**
 * Created by Administrator on 2015/11/16.
 */
public class DataBean {

    /**
     * JumpID : 0
     * Title : null
     * Count : 0
     * Type : 11
     * CType : 0
     * GType : 0
     * GName : null
     * LastPage : false
     * Content : []
     */

    private int JumpID;
    private Object Title;
    private int Count;
    private int Type;
    private int CType;
    private int GType;
    private Object GName;
    private boolean LastPage;
    private List<?> Content;

    public void setJumpID(int JumpID) {
        this.JumpID = JumpID;
    }

    public void setTitle(Object Title) {
        this.Title = Title;
    }

    public void setCount(int Count) {
        this.Count = Count;
    }

    public void setType(int Type) {
        this.Type = Type;
    }

    public void setCType(int CType) {
        this.CType = CType;
    }

    public void setGType(int GType) {
        this.GType = GType;
    }

    public void setGName(Object GName) {
        this.GName = GName;
    }

    public void setLastPage(boolean LastPage) {
        this.LastPage = LastPage;
    }

    public void setContent(List<?> Content) {
        this.Content = Content;
    }

    public int getJumpID() {
        return JumpID;
    }

    public Object getTitle() {
        return Title;
    }

    public int getCount() {
        return Count;
    }

    public int getType() {
        return Type;
    }

    public int getCType() {
        return CType;
    }

    public int getGType() {
        return GType;
    }

    public Object getGName() {
        return GName;
    }

    public boolean isLastPage() {
        return LastPage;
    }

    public List<?> getContent() {
        return Content;
    }
}
