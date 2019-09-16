package com.tcs.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@RefreshScope
@Controller
public class OrderController {

	@Value("${centralFillDeliveryDate}")
	String centralFillDeliveryDate;
	
	@Value("${centralFillCutOffDate}")
	String centralFillCutOffDate;
	
	@Value("${centralFillDeliveryAgent}")
	String centralFillDeliveryAgent;
	
	@Value("${centralFillDrugTypes}")
	String centralFillDrugTypes;

	@RequestMapping("/orderConfigs")
	public String getOrderConfigurations(Model m) {

		m.addAttribute("centralFillDeliveryDate", centralFillDeliveryDate);
		m.addAttribute("centralFillCutOffDate", centralFillCutOffDate);
		m.addAttribute("centralFillDeliveryAgent", centralFillDeliveryAgent);
		m.addAttribute("centralFillDrugTypes", centralFillDrugTypes);
				
		return "orderConfigView";
	}


}
