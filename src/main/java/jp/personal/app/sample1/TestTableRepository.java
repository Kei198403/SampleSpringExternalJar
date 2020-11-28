package jp.personal.app.sample1;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TestTableRepository {

	@Autowired
	private JdbcTemplate jdbc;
	
	public Map<String, Object> selectOne(int id) {
		String sql = "select id, message from test_table where id = ?";
		Map<String, Object> result = jdbc.queryForMap(sql, id);
		
		return result;
	}
}
