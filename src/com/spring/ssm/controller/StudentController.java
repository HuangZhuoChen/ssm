package com.spring.ssm.controller;

import java.io.IOException;
import java.nio.channels.FileChannel.MapMode;
import java.util.Arrays;
import java.util.List;

import javax.jws.WebParam.Mode;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.ssm.entity.Banji;
import com.spring.ssm.entity.Student;
import com.spring.ssm.entity.StudentTeacherBean;
import com.spring.ssm.entity.StudentsBean;
import com.spring.ssm.entity.Teacher;
import com.spring.ssm.service.IBanjiService;
import com.spring.ssm.service.IStudentService;
import com.spring.ssm.service.impl.BanjiServiceImpl;
import com.spring.ssm.service.impl.StudentServiceImpl;

@Controller
@RequestMapping(value="/student")
public class StudentController {
	private IBanjiService banjiService = new BanjiServiceImpl();
	private IStudentService studentService = new StudentServiceImpl();
	
	@RequestMapping(value="/getPage")
	public ModelAndView getPage() {
		System.out.println("StudentController.getPage()");
		
		List<Banji> list = banjiService.findAll();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("list", list);
		modelAndView.setViewName("student_add");
		return modelAndView;
	}

	@RequestMapping(value="/add")
	public ModelAndView add(Student student) {
		System.out.println(student);
		studentService.add(student);
		
		//request.setAttribute("student", student);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("student", student);
		//request.getRequestDispatcher("/student_info.jsp").forward();
		//modelAndView.setViewName("/WEB-INF/jsp/student_info.jsp");
		modelAndView.setViewName("student_info");
		return modelAndView;
	}
	
	@RequestMapping(value="/add2")
	public String add2(Student student, Model model) {
		System.out.println(student);
		model.addAttribute("student", student);
		return "student_info";
	}
	
	@RequestMapping(value="/add3", method=RequestMethod.POST)
	public String add3(String name, int age, Model model) {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "student_info";
	}
	
	@RequestMapping(value="/add4")
	public void add4(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		
		HttpSession session = request.getSession();
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		
		request.getRequestDispatcher("/WEB-INF/jsp/student_info.jsp").forward(request, response);
	}
	
	@RequestMapping(value="/delete")
	public String delete(int id, Model model) {
		System.out.println(id);
		model.addAttribute("id", id);
		//return "student_info"; //转发到jsp界面
		//转发到findAll.action这个请求
		//return "forward:/student/findAll.action";//转发到另一个请求,地址栏不便
		//重定向到findAll.action
		return "redirect:/student/findAll.action";
	}
	
	@RequestMapping(value="/findAll")
	public String  findAll() {
		return "student_info";
	}
	
	@RequestMapping(value="/addAll1")
	public String addAll1(StudentTeacherBean bean, Model model) {
		Student student = bean.getStudent();
		Teacher teacher = bean.getTeacher();
		System.out.println(student);
		System.out.println(teacher);
		
		model.addAttribute("student", student);
		model.addAttribute("teacher", teacher);
		
		return "student_info";
	}
	
	@RequestMapping(value="/deleteAll")
	public void deleteAll(int[] ids) {
		System.out.println(Arrays.toString(ids));
		for (int i : ids) {
			System.out.println(i);
		}
	}
	
	@RequestMapping(value="/addAll")
	public String addAll(StudentsBean bean) {
		List<Student> list = bean.getList();
		for (Student student : list) {
			System.out.println(student);
		}
		
		return "student_info";
	}
	
	
	
	
	
	
	
	
}
