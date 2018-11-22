package com.web.po;
/**
 *
 * 类描述：
 *
 * @author zhao.gang
 * @date 2018年11月10日
 * 
 * 修改描述：
 * @modifier
 */
public class User {
    
    private int id;
    private String gid;
    private String name;
    private String pw;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getGid() {
        return gid;
    }
    
    public void setGid(String gid) {
        this.gid = gid;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPw() {
        return pw;
    }
    
    public void setPw(String pw) {
        this.pw = pw;
    }

}
