package com.prime.question;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.question.model.Response;

@Controller
@Scope("request")
public class ViewResponseBean {

	private List<Response> responses;
}
