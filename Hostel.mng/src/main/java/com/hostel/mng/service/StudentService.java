package com.hostel.mng.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import com.hostel.mng.model.Login;
import com.hostel.mng.model.Student;
import com.hostel.mng.repository.StudentRepository;


@Service
public class StudentService {
	@Autowired
	public StudentRepository studentRepository;
	
	public String  viewDetails(//@RequestParam("id") int id,
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName")  String lastName,
            @RequestParam("mobileNo") String mobileNo,
            @RequestParam("age" ) int  age,
            @RequestParam("gender") String gender,
            @RequestParam("email" ) String email,
            @RequestParam("password") String password,
            //@RequestParam("passConfirm") String passConfirm,


             ModelMap modelMap){
        Student user=new Student();
    //   user.setId(id);
      user.setFirstName(firstName);
      user.setLastName(lastName);
      user.setAge(age);
      user.setGender(gender);
      user.setMobileNo(mobileNo);
      user.setEmail(email);
     
      user.setPassword(password);
      
        //user.setPassConfirm(passConfirm);
      
        this.studentRepository.save(user);
        
        
        
//        modelMap.put("id", id);
        modelMap.put("firstName",firstName);
        modelMap.put("lastName", lastName);
        modelMap.put("gender", gender);
        modelMap.put("mobileNo", mobileNo);
        modelMap.put("email", email);
        modelMap.put("password", password);
        modelMap.put("age", age);
        //modelMap.put("passConfirm", passConfirm);
        return "Registersucc";
       
    }
	
	
	public Student stlogin (String email,String password) {
		Student st=null;
	st=studentRepository.findByEmailAndPassword(email, password);
	return st;

		
		
	}
    }
