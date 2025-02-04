package com.itbank.model;

import java.sql.Date;

// table: Board3

/*이름        널?       유형             
--------- -------- -------------- 
IDX       NOT NULL NUMBER         
TITLE     NOT NULL VARCHAR2(500)  
WRITER             VARCHAR2(100)  
CONTENT   NOT NULL VARCHAR2(4000) 
WRITEDATE          DATE           
ISNOTICE           CHAR(1)  */

public class BoardDTO {
	private int idx;
	private String title;
	private String writer;
	private String content;
	private Date writeDate;
	private int isNotice; // DB에서 자료형은  char(1)이고, String에 대응되지만 
						  // 기본 객체 생성시 0에 맞는 값으로 초기화 하기 위해 int로 처리
						  // 체크 제약 조건에 의해 0혹은 1의 값만 들어갈 수 있음.

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	public int getIsNotice() {
		return isNotice;
	}

	public void setIsNotice(int isNotice) {
		this.isNotice = isNotice;
	}

}
