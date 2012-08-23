package com.spring.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.BoardListDao;
import com.spring.model.BoardVO;

@Service
public class BoardService {

	@Autowired
	private BoardListDao boardListDao;
	
	public List<BoardVO> getBoardList(){
		return boardListDao.getBoardList();
	}
	
	public void addBoardItem(Integer seq,String title,String content,String name,String img,Date indate ){
		BoardVO boardVO = new BoardVO();
		boardVO.setSeq(seq);
		boardVO.setTitle(title);
		boardVO.setContent(content);
		boardVO.setName(name);
		boardVO.setImg(img);
		boardVO.setContent(content);
		boardVO.setIndate(indate);
		boardListDao.addBoardItem(boardVO);
	}
}
