package cn.ssh.DeptDomain;

public class Department {

	//部门的实体
			private Integer did;
			private String dname;
			private String manager;
			public Integer getDid() {
				return did;
			}
			public void setDid(Integer did) {
				this.did = did;
			}
			public String getDname() {
				return dname;
			}
			public void setDname(String dname) {
				this.dname = dname;
			}
			public String getManager() {
				return manager;
			}
			public void setManager(String manager) {
				this.manager = manager;
			} 		
}
