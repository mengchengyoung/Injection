package com.mengchengyang.DependencyInjection.example;

import com.mengchengyang.DependencyInjection.consumer.Consumer;
import com.mengchengyang.DependencyInjection.injector.BossResumeServiceInjector;
import com.mengchengyang.DependencyInjection.injector.LagouResumeServiceInjector;
import com.mengchengyang.DependencyInjection.injector.ResumeServiceInjector;

public class Graduate {
	
	public static void main(String[] args) {		
		String resume = "Hi logiOcean!";
		String reciver = "logiOcean";
		ResumeServiceInjector injector = null;
		Consumer app = null;
		
		// ͨ��Boss��ƸͶ�ݼ���
		injector = new BossResumeServiceInjector();
		app = injector.getConsumer();
		app.ProcessResume(resume, reciver);
		
		// ͨ��Lagou��ƸͶ�ݼ���
		injector = new LagouResumeServiceInjector();
		app = injector.getConsumer();
		app.ProcessResume(resume, reciver);
	}	
}
