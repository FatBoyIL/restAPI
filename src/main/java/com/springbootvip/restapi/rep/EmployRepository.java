package com.springbootvip.restapi.rep;

import com.springbootvip.restapi.entity.Emplyee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //đóng vai trò như 1 chỗ chứa cho data vừa thêm
public interface EmployRepository extends JpaRepository<Emplyee,Long> {
}
