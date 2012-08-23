package com.spring.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.spring.model.BoardVO;

@Repository
public class BoardListDao {

	@Autowired
	private SqlMapClientTemplate sqlMapClientTemplate;
	
	public void addBoardItem(BoardVO boardVO) {
		sqlMapClientTemplate.insert("board.addBoardItem",boardVO);
	}
	
	public List<BoardVO> getBoardList(){
		return sqlMapClientTemplate.queryForList("board.getBoardList");
	}
	

}
