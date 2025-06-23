package com.web.portfolio.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.portfolio.Service.PortfolioService;
import com.web.portfolio.model.Portfoliomodel;

@RestController
@RequestMapping("/portfolio")
public class PortfolioController {
	    private String frontendUrl;
	 
	@Autowired
	private PortfolioService portfolioService;

	@PostMapping("/contact")
	public ResponseEntity<Portfoliomodel> createEmployeeByHR(@RequestBody Portfoliomodel Portfoliomodel) {
	Portfoliomodel createdEmployee = portfolioService.createEmployee(Portfoliomodel);
	return ResponseEntity.ok(createdEmployee);
	}
}
