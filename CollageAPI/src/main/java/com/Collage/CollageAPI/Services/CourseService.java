package com.Collage.CollageAPI.Services;

import java.util.List;

import com.Collage.CollageAPI.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course getCourse(long courseId);


}