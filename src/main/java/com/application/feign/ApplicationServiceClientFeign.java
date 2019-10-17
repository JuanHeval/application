package com.application.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.application.Application;

@FeignClient(name = "application-service", url = "localhost:10020")
public interface ApplicationServiceClientFeign {
	
	@GetMapping("/list")
	public List<Application> getList();
	
	@GetMapping("/{id}")
	public Application getById(@PathVariable Long id);
}
