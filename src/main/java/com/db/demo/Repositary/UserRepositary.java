package com.db.demo.Repositary;

import com.db.demo.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositary extends JpaRepository<UserModel,Long> {
}
