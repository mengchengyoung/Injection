package com.mengchengyang.DependencyInjection.consumer;
import com.mengchengyang.DependencyInjection.service.ResumeService;

public class ResumeApplication implements Consumer{
	private ResumeService service;
	public ResumeApplication (ResumeService serv) {
		this.service = serv;
	}
	
	@Override
	public void ProcessResume(String resume, String reciver) {
		this.service.SendResuem(resume, reciver);
	}
}
