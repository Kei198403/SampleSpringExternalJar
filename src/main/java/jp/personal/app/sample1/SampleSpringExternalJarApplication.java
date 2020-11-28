package jp.personal.app.sample1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleSpringExternalJarApplication {
	
	@Autowired
	TestTableService service;

	public static void main(String[] args) {
		try (var ctx = SpringApplication.run(SampleSpringExternalJarApplication.class, args)) {
			var self = ctx.getBean(SampleSpringExternalJarApplication.class);
			
			self.exec();
		}
	}
	
	public void exec() {
		System.out.println("Spring Boot 実行");
		
		var rec1 = service.selectOne(1);
		var rec2 = service.selectOne(2);
		
		System.out.println(String.format("DBからデータ取得 id:%d, message:%s", 
				rec1.getId(), rec1.getMessage()));
		System.out.println(String.format("DBからデータ取得 id:%d, message:%s", 
				rec2.getId(), rec2.getMessage()));
	}

}
