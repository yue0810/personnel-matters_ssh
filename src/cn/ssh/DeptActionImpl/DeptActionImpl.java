package cn.ssh.DeptActionImpl;

import java.util.List;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.ssh.DeptAction.DeptAction;
import cn.ssh.DeptDomain.Department;
import cn.ssh.DeptService.DeptService;


public class DeptActionImpl extends ActionSupport implements DeptAction,ModelDriven<Department> {
		//模型驱动使用的类
		private Department department=new Department(); 
		private List<Department> depall;
		private List<Department> dep;
		private String result;
		public String getResult() {
			return result;
		}
		public void setResult(String result) {
			this.result = result;
		}
		@Override
		public Department getModel() {
			
			return department;
		}
		//Struts和Spring整合过程中的按名称自动注入业务层类
		private DeptService deptService;

		public void setDeptService(DeptService deptService) {
			this.deptService = deptService;
		}
		//保存商品的执行方法:save
		public String save(){
			System.out.println("Action中的save方法执行了...");
			deptService.save(department);
			return NONE;
		}
		public String delete(){
			System.out.println("Action中的delete方法执行了...");
			deptService.delete(department);
			return NONE;
		}
		public String update(){
			System.out.println("Action中的update方法执行了...");
			deptService.update(department);
			return NONE;
		}
		public String quert(){
			System.out.println("Action中的query方法执行了...");
			System.out.println(department.getDname() == null || department.getDname().length() <= 0);
			dep=deptService.quert(department);
			result=listToJson.listToJson(dep);
			System.out.println(result);
			return SUCCESS;	
		}

		public String quertByAll(){
			System.out.println("Action中的byall方法执行了...");
			depall=deptService.queryByAll();
			result=listToJson.listToJson(depall);
			System.out.println(result);
			return SUCCESS;
		}
	}
