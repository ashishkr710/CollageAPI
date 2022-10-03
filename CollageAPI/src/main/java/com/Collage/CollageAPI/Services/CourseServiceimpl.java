package com.Collage.CollageAPI.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Collage.CollageAPI.entities.Course;

@Service
public class CourseServiceimpl implements CourseService  {

	List<Course> list;
	public CourseServiceimpl() {
		list = new ArrayList<>();
		list.add(new Course(1,"SVSU","B.Tech","750000","4 Years","AC","120000"));
		list.add(new Course(2,"MMDU","M.Tech","400000","2 Years","Non-AC","90000"));
		list.add(new Course(3,"ANC","BCA","560000","3 Years","AC","100000"));
	}

	@Override
	public List<Course> getCourses() {
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		
		Course c = null;
		for(Course course:list)
		{
			if(course.getId()==courseId)
			{
				c=course;
				break;
			}
		}
		return c;
	}
}
