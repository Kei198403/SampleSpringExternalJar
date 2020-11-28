package jp.personal.app.sample1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestTableService {

	@Autowired
	private TestTableRepository repository;
	
	public TestTableRecord selectOne(int id) {
		var result = repository.selectOne(id);
		
		var entity = new TestTableRecord();
		entity.setId(((Integer)result.get("id")));
		entity.setMessage((String)result.get("message"));
		
		return entity;
	}
	
}
