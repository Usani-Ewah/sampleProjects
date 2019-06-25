package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BlogPostController {
	
	/*@RequestMapping("/")
	public String index() {
		return "hello world";
	}
	*/
	
	@GetMapping("/")
	public String index() {
		return "index.html";
		
	}
	
	@Autowired
	private BlogPostRepository blogPostRepository;
	
	private BlogPost blogPost;
	@PostMapping("/")
	public String addNewBlogPost(BlogPost blogPost, Model model) {
		blogPostRepository.save(
				new BlogPost (blogPost.getTitle(),
						blogPost.getAuthor(),
						blogPost.getBlogEntry()
						)
				);
		
		model.addAttribute("title", blogPost.getTitle());
		model.addAttribute("author", blogPost.getAuthor());
		model.addAttribute("blogEntry", blogPost.getBlogEntry());
		
		return "result.html";
	}
	//*@RequestMapping("/test")
	//public String home() {
		//return "hello world AGAIN";
	
	}


