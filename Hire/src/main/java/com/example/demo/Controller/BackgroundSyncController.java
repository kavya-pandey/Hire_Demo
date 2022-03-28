package com.example.demo.Controller;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Model.BackgroundSync;
import com.example.demo.Model.TurbohireDummy;
import com.example.demo.Service.BackgroundSyncService;

@org.springframework.web.bind.annotation.RestController

@Controller
public class BackgroundSyncController {

	@Autowired
	private BackgroundSyncService service;
	

	@PostMapping(value="/save-backgroundSync")
	@Transactional
	public void backgoundSyncData( @RequestBody BackgroundSync backgroundsync) {
		service.SaveBackgroundSync(backgroundsync) ;

		}
	
	@PostMapping(value="/save-turbohire")
	@Transactional
	public void turboHireData( @RequestBody TurbohireDummy turbohiredummy) {
		service.SaveTurbohireDummy(turbohiredummy) ;

		}
}
