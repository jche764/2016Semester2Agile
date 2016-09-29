package com.prime.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.customer.model.Customer;
import com.prime.customer.service.CustomerService;
import com.prime.question.model.Question;
import com.prime.question.service.QuestionService;
import com.prime.question.service.ResponseService;
import com.prime.response.model.Response;

@Controller
@Scope("request")
public class ViewResponsesBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(ViewResponsesBean.class.getName());

	private List<Customer> customers = new ArrayList<Customer>();


	public List<Response> responses;
	
	public List<Response> getResponses() {
		return responses;
	}

	public void setResponses(List<Response> responses) {
		this.responses = responses;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	@Autowired
	private CustomerService cutomerService;
	
	@Autowired
	private ResponseService responseService;

	@PostConstruct
	public void init() {
		logger.info("initiating");
		//customers = cutomerService.listAll();
		responses = responseService.listAll();
	}



}
