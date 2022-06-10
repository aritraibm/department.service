package com.pru.test.department.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pru.test.department.service.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {

	Department findByDeptId(Long deptId);

}
