package cn.ssh.DeptServiceImpl;

import java.util.List;

import cn.ssh.DeptDao.DeptDao;
import cn.ssh.DeptDomain.Department;
import cn.ssh.DeptService.DeptService;

public class DeptServiceImpl implements DeptService {

		//业务层注入DAO的类
		private DeptDao deptDao;

		public void setDeptDao(DeptDao deptDao) {
			this.deptDao = deptDao;
		}
		//业务层保存商品的方法
		public void save(Department department) {
			System.out.println("Service中的save方法执行了...");
			deptDao.save(department);
			
		}
		public void delete(Department department) {
			System.out.println("Service中的delete方法执行了...");
			deptDao.delete(department);
			
		}
		public void update(Department department) {
			System.out.println("Service中的update方法执行了...");
			deptDao.update(department);
			
		}
		public List<Department> quert(Department department) {
			System.out.println("Service中的id方法执行了...");
			return  deptDao.quert(department);

		}
		
		public List<Department> queryByAll() {
			System.out.println("Service中的all方法执行了...");
			return  deptDao.queryByAll();
		}
}
