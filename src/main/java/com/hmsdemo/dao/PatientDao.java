package com.hmsdemo.dao;

import com.hmsdemo.pojo.Patient;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PatientDao {
    @Select("select * FROM patient where pid = #{pid}")
    public Patient getById(Integer pid);

    @Select("select * FROM patient")
    public List<Patient> getAll();

    @Insert("insert into patient (pid,pname) values(#{pid},#{pname})")
    public void addPatient(Patient patient);

    @Update("update patient set pname = #{pname} where pid = #{pid}")
    public void update(Patient patient);

    @Delete("delete from patient where pid = #{pid}")
    public void delete(Integer id);
}
