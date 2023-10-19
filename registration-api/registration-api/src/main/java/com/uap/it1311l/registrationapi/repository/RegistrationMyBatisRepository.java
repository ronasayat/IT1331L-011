package com.uap.it1311l.registrationapi.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.uap.it1311l.registrationapi.model.Attendee;

@Mapper
public interface RegistrationMyBatisRepository {

	@Insert("INSERT INTO attendees(firstName, middleName, lastName, course, age) VALUES (#{firstName}, #{middleName}, #{lastName}, #{course},#{age})")
			public int insert(Attendee attendee);
	@Select("SELECT * FROM registration.attendees;")
    public List<Attendee> findAll();
}
