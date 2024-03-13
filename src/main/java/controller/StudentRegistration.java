package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dao.MyDao;

//this is to be same as action url to this class (Should be same as action - case sensitive)
@WebServlet("/registration")
@MultipartConfig
public class StudentRegistration  extends HttpServlet{
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// logic to receive values from Of front end
	 String fullname=req.getParameter("fullname");
	 String fname=req.getParameter("fname");
	 long mobile = Long.parseLong(req.getParameter("mobile"));
	 String email = req.getParameter("email");
	 LocalDate dob = LocalDate.parse(req.getParameter("dob"));
	 String gender = req.getParameter("gender");
	 String course=req.getParameter("course");
	 String add=req.getParameter("add");
	 Part picture = req.getPart("picture");
		byte[] picture1 = null;
		picture1 = new byte[picture.getInputStream().available()];
		picture.getInputStream().read(picture1);
		int age = Period.between(dob, LocalDate.now()).getYears();
		
		// to access multiple method of dao 
				MyDao dao = new MyDao();
				
				
	  // persisiting /saving the value inside dbms
//				dao.save(student);
	 
}
}
