package com.institute.software.the.davis.gareth.catsSBDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
@RestController
@RequestMapping("/pets")
public class CatsSbDemoApplication {

	@Autowired
	private CatRepository catRepository;

	public static void main(String[] args) {
		SpringApplication.run(CatsSbDemoApplication.class, args);
	}

	/*@GetMapping("/getcat")
	public String catResponse(){
		Cat cat = new Cat("Tiddles",7,"Manx");

		return cat.getJsonObjectOfCat();
	} */

	@GetMapping("/all")
	public @ResponseBody Iterable<Cat> getAllUsers() {
		return catRepository.findAll();
	}

	@PostMapping("/addCat")
	public @ResponseBody String addACat (@RequestParam String name
			, @RequestParam String breed , @RequestParam int age) {


			Cat savedCat = new Cat(name, age, breed);
			catRepository.save(savedCat);
			return "Saved";

	}

}
