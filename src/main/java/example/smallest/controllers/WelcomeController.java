package example.smallest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	
	@RequestMapping(method = RequestMethod.GET, produces = {"application/json"})
	public @ResponseBody String helloWorld() {
		
		//Flux
		
		
		
		
		return "So far the biggest difference this time around from the first class was a much more indepth exposure to AWS. We learned a lot about creating instances and setting up all networking and security onthem. We learned how to set up VPCs, public and private subnets, inbound and outbound rules, setting up an internet gateway, as well as setting up a NAT gateway to grant internet access to the private instances. On top of being more involved with AWS to get an idea of an enterprise environment, we also began to learn about Docker and its various uses and commands. We used Docker to create an image of our Java Springboot application we had set up for a prior project and use Docker to run the application in the background. Most recently, we are learning more about Dockerhub, where the image for this very application with this message will be shared to complete our new project! This shit lit"; //"application/json" mean this is a text not a redirect
	}
}
