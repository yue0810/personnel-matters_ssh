package cn.ssh.DeptService;

import java.util.List;

import cn.ssh.DeptDomain.Department;

public interface DeptService {

	public void save(Department department);
	
	public void delete(Department department);
	
	public void update(Department department);
	
	public List<Department> quert(Department department);
	
	public List<Department> queryByAll();
}
