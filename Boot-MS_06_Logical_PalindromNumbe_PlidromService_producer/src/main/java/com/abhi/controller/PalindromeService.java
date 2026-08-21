package com.abhi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/palindrome")
public class PalindromeService {
	
	@GetMapping("/service/{num}")
	public String chekPalindrome(@PathVariable int num) 
	{
		
		int rev =0;
		int temp=num;
		
		while(num!=0) 
		{
		int	rem = num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		if(temp==rev) 
		{
			return temp+"is a Palindrome Number";
		}else 
		{
			return temp+"is a Not a polindrome Number";
		}
		
		
	}

}
