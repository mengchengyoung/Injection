package com.mengchengyang.DependencyInjection.injector;

import com.mengchengyang.DependencyInjection.consumer.Consumer;
import com.mengchengyang.DependencyInjection.consumer.ResumeApplication;
import com.mengchengyang.DependencyInjection.service.LagouResumeServiceImpl;

public class LagouResumeServiceInjector implements ResumeServiceInjector{
	@Override
	public Consumer getConsumer() {
		return new ResumeApplication(new LagouResumeServiceImpl());
	} 
}
