package multi.com.finalprojects.member.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Repository
public class MemberDAOimpl implements MemberDAO {

	@Autowired
	SqlSession sqlSession;
	
	public MemberDAOimpl() {
		log.info("MemberDAOimpl()...");
	}
	
	@Override
	public int insert(MemberVO vo) {
		log.info("insert()....",vo);
		return sqlSession.insert("M_INSERT");
	}

	@Override
	public int update(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<MemberVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVO selectOne(MemberVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVO login(MemberVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberVO> searchList(String searchKey, String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVO idCheck(MemberVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

}
