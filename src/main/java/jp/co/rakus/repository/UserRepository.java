package jp.co.rakus.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jp.co.rakus.domain.User;

/**
 * usersテーブルを操作するリポジトリ.
 * 
 * @author kento.uemura
 *
 */
@Repository
@Transactional
public class UserRepository {
	@Autowired
	private NamedParameterJdbcTemplate template;
	public static final String TABLE_NAME = "info";
	public static final RowMapper<User> USER_ROW_MAPPER = (rs,i) -> {
		User user = new User(rs.getInt("id"),rs.getString("name"),rs.getInt("age"),rs.getString("address"));
		return user;
	};
	
	/**
	 * ロード操作(一件検索)を行う.
	 * 
	 * @param id 指定する主キー
	 * @return データベースから受け取った値を格納したuserオブジェクト
	 */
	public User load(Integer id) {
		String sql = "SELECT id,name,age,address FROM "+TABLE_NAME+" WHERE id=:id;";
		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);
		User user = template.queryForObject(sql, param, USER_ROW_MAPPER);
		return user;
	}
}
