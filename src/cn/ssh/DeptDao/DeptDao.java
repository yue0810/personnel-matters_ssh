package cn.ssh.DeptDao;

import java.util.List;

import cn.ssh.DeptDomain.Department;


public interface DeptDao {

	public void update(Department department);
	
	public void save(Department department);
	
	public void delete(Department department);
	
	public List<Department> quert(Department department);
	
	public List<Department> queryByAll();
}
