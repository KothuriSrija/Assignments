package com.Q10;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class EmployeeController {
	@RequestMapping("/toExcel")
    public ModelAndView toExcel(){
        List<Employee> employeeList = Arrays.asList(
                new Employee(1111,"Pink",30000),
                new Employee(2222,"Blue",40000),
                new Employee(33333,"Black",50000)
        );

        ModelAndView modelAndView = new ModelAndView(new ExcelReportView());
        modelAndView.addObject("empList",employeeList);
        return  modelAndView;
    }
    @RequestMapping("/toPdf")
    public ModelAndView toPdf(){
        List<Employee> employeeList = Arrays.asList(
                new Employee(1111,"Pink",30000),
                new Employee(2222,"Blue",40000),
                new Employee(33333,"Black",50000)
        );

        ModelAndView modelAndView = new ModelAndView(new PdfReportView());
        modelAndView.addObject("empList",employeeList);
        return  modelAndView;
    }
}
