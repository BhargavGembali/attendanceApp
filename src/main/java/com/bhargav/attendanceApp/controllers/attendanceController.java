package com.bhargav.attendanceApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bhargav.attendanceApp.Repositories.attendanceRepository;
import com.bhargav.attendanceApp.models.attendance;



@Controller
@RequestMapping("/attendance")
public class attendanceController {
    @Autowired 
    attendanceRepository repo;

    @GetMapping({"","/"})
    public String showAttendanceList(Model model){
        List<attendance> attendance= repo.findAll(Sort.by(Sort.Direction.ASC, "id"));
        model.addAttribute("attendance", attendance);
        return "attendance/index";
    }
}
