package kr.or.newbie.article.dao;

import java.util.List;
import java.util.Map;

import kr.or.newbie.article.domain.Article;
import kr.or.newbie.article.domain.ArticleComment;



/** 
 * 학사 관련 영속성 처리 규약 선언
 * @author 김기정
 */
public interface ArticleDao {

	
	//게시글 등록
	public void writeArticle(Article article);
	
	//게시글 삭제
	public void deleteArticle(int article_no);
	
	//게시글 관련 댓글 삭제
	public void deleteComment(int article_no);
	
	//게시글 수정
	public void modifyArticle(Map<String, String> params);
	
	//게시글 목록 출력
	public List<Map<String, Object>> showarticleList(String program_name);
	
	//카테고리별 목록 출력
	public List<Map<String, Object>> showcategoryList(Map<String, String> params);
	//카테고리 페이징
	public List<Map<String, Object>> categoryPaging(Map<String, String> params);
	
	//조회순 별 리스트 출력
	public List<Map<String, Object>> hitcountList(Map<String, String> params);
	
	//추천순 별 리스트
	public List<Map<String, Object>> likecountList(Map<String, String> params);
	
	//댓글수별 리스트
	public List<Map<String, Object>> commentcountList(Map<String, String> params);
	
	//오더바이 페이징
	public List<Map<String, Object>> hitcountPaging(Map<String, String> params);
	public List<Map<String, Object>> likecountPaging(Map<String, String> params);
	public List<Map<String, Object>> commentcountPaging(Map<String, String> params);
	//게시글 검색하기
	public List<Map<String, Object>> searchList(Map<String, String> params);
	
	//게시글 상세보기
	public Map<String, Object> detailArticle(int article_no);
	
	//상세보기시 히트 카운트 1 증가
	public void hitcountArticle(int article_no);
	
	//댓글등록시 카운트 1증가
	public void commentcount(int article_no);
	
	//좋아요
	public void likecountArticle(int article_no);
	
	//댓글 리스트
	public List<Map<String, Object>> commentList(int article_no);
	
	//댓글 등록
	public void writeComment(Map<String, String> params);
	
	//댓글 삭제
	public void removeComment(int comment_no);
	
	
	//페이징
	public List<Map<String, Object>> paging(Map<String, String> params);
	
		
	/*//프로젝트 등록하기
	public void addProject(Project project);
	
	//프로젝트 상세보기
	public Project showProjectdetail();
	
	//프로젝트 참가하기
	public void joinProject(Project project);
	
	//프로젝트 탈퇴하기
	public void exitProject(Project project);*/
	
}
