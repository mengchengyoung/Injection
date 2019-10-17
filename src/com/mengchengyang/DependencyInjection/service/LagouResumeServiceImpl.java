package com.mengchengyang.DependencyInjection.service;

public class LagouResumeServiceImpl implements ResumeService{
	@Override
	public void SendResuem(String resume, String reciver) {
		System.out.println("Send "+ resume + " To " + reciver + " From www.Lagou.com");
	}
}
