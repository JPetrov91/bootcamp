package org.activity16;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

	/*- TODO
	Look at:
	1. http://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/web/bind/annotation/RequestMapping.html
	2. http://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/web/bind/annotation/RequestParam.html
	3. http://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/web/bind/annotation/ResponseBody.html
	
	Annotate hello() method to:
	1. map GET requests from web root folder to hello() method
	2. its returned content will be used as server response body 
	3. it will handle two optional GET parameters name and surname
	4. note that plain text is produced as response with UTF-8 encoding for non-Latin characters
	 */
	public String hello() {
	// TODO depending on passed parameters return just "Hello!", "Helo, Name!"
	// "Hello, Name Surname!" as server response
	return "Hello!";
	}
}
