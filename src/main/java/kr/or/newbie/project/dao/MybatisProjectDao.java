package kr.or.newbie.project.dao;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import kr.or.newbie.project.domain.Project;
import kr.or.newbie.project.domain.Users;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("projectDao")
public class MybatisProjectDao implements ProjectDao {
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	@Override
	//프로젝트 목록보기
	public List<Project> showProjectList() {
		
		List<Project> projectList = null;
		SqlSession session = null;
		try{
			session = sqlSessionFactory.openSession();
			ProjectDao dao = session.getMapper(ProjectDao.class);
			projectList = dao.showProjectList();
		}finally{
			session.close();
		}
		return projectList;
	}
	
	@Override
	//프로젝트 생성자 정보 출력
	public Users getUserInfo(int user_no) {
		
		Users users = null;
		SqlSession session = null;
		try{
			session = sqlSessionFactory.openSession();
			ProjectDao dao = session.getMapper(ProjectDao.class);
			users = dao.getUserInfo(user_no);
		}finally{
			session.close();
		}
		return users;
	}
	
	@Override
	//프로젝트 상세보기
	public List<Map<String, Object>> showProject() {
		List<Map<String, Object>> map = null;
		SqlSession session = null;
		try{
			session = sqlSessionFactory.openSession();
			ProjectDao dao = session.getMapper(ProjectDao.class);
			map = dao.showProject();
		}finally{
			session.close();
		}
		return map;
	}
	
	@Override
	//프로젝트 상세보기(정식)
	public Map<String, Object> showProjectdetail(int groupNo) {
		Map<String, Object> mapProject = null;
		SqlSession session = null;
		try{
			session = sqlSessionFactory.openSession();
			ProjectDao dao = session.getMapper(ProjectDao.class);
			mapProject = dao.showProjectdetail(groupNo);
		}finally{
			session.close();
		}
		return mapProject;
	}
	
	@Override
	//프로젝트 참가하기
	public void joinProject(Map<String, Integer> params) {
		SqlSession session = null;
		try{
			session = sqlSessionFactory.openSession();
			ProjectDao dao = session.getMapper(ProjectDao.class);
			dao.joinProject(params);
		}finally{
			session.close();
		}
	}
	
	@Override
	//프로젝트 참가인원 정보 출력
	public List<Map<String, Object>> showEnterProject(int groupNo) {
		List<Map<String, Object>> mapProject = null;
		SqlSession session = null;
		try{
			session = sqlSessionFactory.openSession();
			ProjectDao dao = session.getMapper(ProjectDao.class);
			mapProject = dao.showEnterProject(groupNo);
		}finally{
			session.close();
		}
		return mapProject;
	}
	
	@Override
	public void addProject(Project project) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void exitProject(Project project) {
		// TODO Auto-generated method stub
		
	}
	
	

}
