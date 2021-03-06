package com.autowire.by.setter.demo.beans;

public class EmployeeBean {

  private int employeeId;

  private String employeeName;

  private DepartmentBean departmentBean;

  public int getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public DepartmentBean getDepartmentBean() {
    return departmentBean;
  }

  public void setDepartmentBean(DepartmentBean departmentBean) {
    this.departmentBean = departmentBean;
  }

  @Override
  public String toString() {
    return "EmployeeBean [employeeId=" + employeeId + ", employeeName=" + employeeName + ", departmentBean="
        + departmentBean + "]";
  }

}
