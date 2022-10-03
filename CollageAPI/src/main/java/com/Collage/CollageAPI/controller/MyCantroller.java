package com.Collage.CollageAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Collage.CollageAPI.Services.CourseService;
import com.Collage.CollageAPI.entities.Course;

@Controller
public class MyCantroller {
	@Autowired
	private CourseService courseService;
	
	//Get All Colleges
	@RequestMapping(value="/courses")
	public String getCources(Model model)
	{
		List<Course> courses = courseService.getCourses();
		model.addAttribute("courses", courses);
		
		return "Colleges";
	}
	
	//Get single course
	@RequestMapping("/courses/{courseId}")
	public String getCourse(Model model, @PathVariable String courseId)
	{
		Course courses = courseService.getCourse(Long.parseLong(courseId));
		model.addAttribute("courses",courses); 
		return "Colleges";
	}
}
