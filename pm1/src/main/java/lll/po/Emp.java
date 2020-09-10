package lll.po;

import java.util.Date;

public class Emp {
    public static void main(String[] args) {

    }
    private int empid;
    private String ename;
    private Date hiredate;
    private String logid;
    private String logpwd;
    private  int mgrid;

    public Emp() {
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empid=" + empid +
                ", ename='" + ename + '\'' +
                ", hiredate=" + hiredate +
                ", logid='" + logid + '\'' +
                ", logpwd='" + logpwd + '\'' +
                ", mgrid=" + mgrid +
                '}';
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public String getLogid() {
        return logid;
    }

    public void setLogid(String logid) {
        this.logid = logid;
    }

    public String getLogpwd() {
        return logpwd;
    }

    public void setLogpwd(String logpwd) {
        this.logpwd = logpwd;
    }

    public int getMgrid() {
        return mgrid;
    }

    public void setMgrid(int mgrid) {
        this.mgrid = mgrid;
    }
}
