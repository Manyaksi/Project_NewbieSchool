package kr.or.newbie.article.dao;

import java.util.List;
import java.util.Map;

import kr.or.newbie.article.domain.Article;



/** 
 * 학사 관련 영속성 처리 규약 선언
 * @author 김기정
 */
public interface ArticleDao {

	//게시글 목록 출력
	public List<Map<String, Object>> showarticleList(String program_name);
	
	//게시글 상세보기
	public Article detailArticle(int article_no);
	
	/*//프로젝트 등록하기
	public void addProject(Project project);
	
	//프로젝트 상세보기
	public Project showProjectdetail();
	
	//프로젝트 참가하기
	public void joinProject(Project project);
	
	//프로젝트 탈퇴하기
	public void exitProject(Project project);*/
	
}
