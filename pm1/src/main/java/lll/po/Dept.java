package lll.po;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Dept {
    public static void main(String[] args) throws IOException {
        String resource="mybatis-config.xml";
        InputStream input= Resources.getResourceAsStream(resource);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(input);
        SqlSession sqlSession = factory.openSession();
        List<Emp> list = sqlSession.selectList("lll.po.Dept.getEmpByDept");
        System.out.println(list);
        sqlSession.close();

    }

    private int depttid;//我们希望将主键列的值存储到deptid中
    private String dname;
    private List<Emp> list;

    @Override
    public String toString() {
        return "Dept{" +
                "deptid=" + depttid +
                ", dname='" + dname + '\'' +
                ", list=" + list +
                '}';
    }

    public int getDeptid() {
        return depttid;
    }

    public void setDeptid(int deptid) {
        this.depttid = deptid;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public List<Emp> getList() {
        return list;
    }

    public void setList(List<Emp> list) {
        this.list = list;
    }

}
