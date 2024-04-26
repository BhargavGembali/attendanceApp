package com.bhargav.attendanceApp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhargav.attendanceApp.models.attendance;;

public interface attendanceRepository extends JpaRepository<attendance, Integer>{

}
