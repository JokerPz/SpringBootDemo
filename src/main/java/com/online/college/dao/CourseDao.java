package com.online.college.dao;

import java.util.List;

import com.online.college.domain.Course;


public interface CourseDao {
	List<Course> getFiveCourses(Course queryEntity);
}

