package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")//iska mtlb home kab chalega
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name" ,"yuvraj patel");//model me use  krna he addatribute data daa ke liye
		
		List<String> freinds= new ArrayList<String>();
		
		freinds.add("nhikil");
		freinds.add("yuvi");
		freinds.add("rishika");
		model.addAttribute("f",freinds);
		
		return "index"; //view name
	}
	@RequestMapping("/about") // iska mltd kis url se mapping krna chate ho
	public String about() {
		System.out.println("this is about controler");
		return "about";	}
	

}
