package com.itbank.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.BoardDAO;
import com.itbank.model.BoardVO;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO dao;
	
	public List<BoardVO> getBoards(){
		return dao.selectAll();
		//메서드 이름은 정해진 것 아님
	}

	public BoardVO getBoard(int idx) {
		
		return dao.selectOne(idx);
	}
	
	
	
}
