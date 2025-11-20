package com.lgdx.web.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MsgMember {
	// Oracle DB에서 msg_member 테이블을 표현할 수 있는 나만의 자료형 (entity)
	
	// 필드의 명칭을 지어줄 때, 테이블의 컬럼명과 일치하는 습관 필요
	private String email;
	private String pw;
	private String tel;
	private String address;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public MsgMember(String email, String pw, String tel, String address) {
		this.email = email;
		this.pw = pw;
		this.tel = tel;
		this.address = address;
	}


	
}
