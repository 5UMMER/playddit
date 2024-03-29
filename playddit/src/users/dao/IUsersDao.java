package users.dao;

import java.sql.SQLException;
import java.util.List;

import users.vo.UsersVO;

public interface IUsersDao {
	public List<UsersVO> getAllUsers();
	
	// 아이디 중복체크
	public String selectById(String user_id) throws SQLException;
	
	// 팔로잉 목록 출력
	public List<UsersVO> followingList(String user_id) throws SQLException;
	
	// 아이디 비밀번호 일치여부
	public UsersVO match(String user_id, String user_pw) throws SQLException;
	
	
}
	