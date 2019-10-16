package com.sun.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Dept implements Serializable {
    private Long deptno;
    private String dnmae;
    private String loc;  //保存数据库的位置

    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDnmae() {
        return dnmae;
    }

    public void setDnmae(String dnmae) {
        this.dnmae = dnmae;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dnmae='" + dnmae + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}
