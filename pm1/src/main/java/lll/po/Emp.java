package lll.po;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class Emp {
    public static void main(String[] args) throws Exception {
        String resouce = "mybatis-config.xml";
        // 1. 根据SqlMapConfig.xml，读取资源
        InputStream inputStream = Resources.getResourceAsStream(resouce);
        // 2. 创建SqlSessionFactory，根据全局配置文件SqlMapConfig.xml创建工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 3. 创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //插入
//        Emp e=new Emp();
//        int i = sqlSession.insert("lll.po.Emp.addEmp", e);
        List<Emp> list = sqlSession.selectList("lll.po.Emp.getEmpDept");
        sqlSession.commit();
        System.out.println(list);

        //查询
//        Emp e =  sqlSession.selectOne("lll.po.Emp.getEmp");
//        System.out.println(e.getMgrid());
        sqlSession.close();
    }



    private int empid;
    private String ename="zzm";
    private Date hiredate;
    private String logid="14";
    private String logpwd;
    private  int mgrid;
    private Dept dept;
    private int deptiid;

    public int getDeptid() {
        return deptiid;
    }

    public void setDeptid(int deptid) {
        this.deptiid = deptid;
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
                ", dept=" + dept +
                '}';
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Emp() {
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
