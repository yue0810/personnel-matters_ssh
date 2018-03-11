package cn.ssh.DeptDaoImpl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import cn.ssh.DeptDao.DeptDao;
import cn.ssh.DeptDomain.Department;

public class DeptDaoImpl extends HibernateDaoSupport implements DeptDao {

	private Department department;
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	//DAO中的保存商品的方法
	public void update(Department department) {
		this.getHibernateTemplate().merge(department);
		System.out.println("DAO中的update方法执行了...");
	}
	public void save(Department department) {
		this.getHibernateTemplate().save(department);
		System.out.println("DAO中的save方法执行了...");
	}
	public void delete(Department department) {
		this.getHibernateTemplate().delete(department);
		System.out.println("DAO中的delete方法执行了...");
	}
	public List<Department> quert(Department department) {	
		System.out.println("DAO中的id方法执行了...");
		System.out.println("from Department where dname LIKE ? %"+department.getDname()+"%");
		System.out.println(department.getDid());
		if(department.getDid()==null && (department.getDname() == null || department.getDname().length() <= 0))
				return null;
		else if(department.getDid()==null)
			return this.getHibernateTemplate().find("from Department where dname LIKE ? ", "%"+department.getDname()+"%"); 
		else if(department.getDname() == null || department.getDname().length() <= 0)
			return this.getHibernateTemplate().find("from Department where did = ? ",department.getDid()); 
		else
			return this.getHibernateTemplate().find("from Department where did = ? AND dname LIKE ?", department.getDid(),"%"+department.getDname()+"%"); 
	}
	public List<Department> queryByAll() {
		System.out.println("DAO中的all方法执行了...");
		return this.getHibernateTemplate().find("from Department");
	}

}
