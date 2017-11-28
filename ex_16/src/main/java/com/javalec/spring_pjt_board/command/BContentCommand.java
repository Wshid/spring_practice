package com.javalec.spring_pjt_board.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

public class BContentCommand implements BCommand {
//실제로 리스트를 본다.게시판에서 글을 클릭하면 해당 내용을 보여줌 
	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		Map<String, Object> map=model.asMap(); // 맵 형태로 변환
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		String bid=request.getParameter("bId");
		
		//Bdao..
	}

}
