package com.grad.net.vo;



public class MemberVo {
	
	private Long mbNo;
	private String mbDstnct;
	private String mbNm;
	private String nknm;
	private String iden;
	private String pw;
	private String sex;
	private String birdt;
	private String myselfAuthzYn;
	private String insrdDd;
	private String wthdrDd;
	private String genalMbDstnct;
	private String snsTknValue;
	private String snsDstnct;
	private String agrg;
	private String telNo;
	private String hndphNo;
	private String email;
	
	private String cdId;
	private String infoYn;
	private boolean exist;
	
	/*
	 * 정예린 2017-09-19 스크랩
	 */
	private Long prntsNo;
	private String prntsDstnct;	
	

	public String getInfoYn() {
		return infoYn;
	}

	public void setInfoYn(String infoYn) {
		this.infoYn = infoYn;
	}

	public Long getMbNo() {
		return mbNo;
	}

	public void setMbNo(Long mbNo) {
		this.mbNo = mbNo;
	}

	public String getMbDstnct() {
		return mbDstnct;
	}

	public void setMbDstnct(String mbDstnct) {
		this.mbDstnct = mbDstnct;
	}

	public String getMbNm() {
		return mbNm;
	}

	public void setMbNm(String mbNm) {
		this.mbNm = mbNm;
	}

	public String getNknm() {
		return nknm;
	}

	public void setNknm(String nknm) {
		this.nknm = nknm;
	}

	public String getIden() {
		return iden;
	}

	public void setIden(String iden) {
		this.iden = iden;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirdt() {
		return birdt;
	}

	public void setBirdt(String birdt) {
		this.birdt = birdt;
	}

	public String getMyselfAuthzYn() {
		return myselfAuthzYn;
	}

	public void setMyselfAuthzYn(String myselfAuthzYn) {
		this.myselfAuthzYn = myselfAuthzYn;
	}

	public String getInsrdDd() {
		return insrdDd;
	}

	public void setInsrdDd(String insrdDd) {
		this.insrdDd = insrdDd;
	}

	public String getWthdrDd() {
		return wthdrDd;
	}

	public void setWthdrDd(String wthdrDd) {
		this.wthdrDd = wthdrDd;
	}

	public String getGenalMbDstnct() {
		return genalMbDstnct;
	}

	public void setGenalMbDstnct(String genalMbDstnct) {
		this.genalMbDstnct = genalMbDstnct;
	}

	public String getSnsTknValue() {
		return snsTknValue;
	}

	public void setSnsTknValue(String snsTknValue) {
		this.snsTknValue = snsTknValue;
	}

	public String getSnsDstnct() {
		return snsDstnct;
	}

	public void setSnsDstnct(String snsDstnct) {
		this.snsDstnct = snsDstnct;
	}

	public String getAgrg() {
		return agrg;
	}

	public void setAgrg(String agrg) {
		this.agrg = agrg;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public String getHndphNo() {
		return hndphNo;
	}

	public void setHndphNo(String hndphNo) {
		this.hndphNo = hndphNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCdId() {
		return cdId;
	}

	public void setCdId(String cdId) {
		this.cdId = cdId;
	}

	
	public Long getPrntsNo() {
		return prntsNo;
	}

	public void setPrntsNo(Long prntsNo) {
		this.prntsNo = prntsNo;
	}

	public String getPrntsDstnct() {
		return prntsDstnct;
	}

	public void setPrntsDstnct(String prntsDstnct) {
		this.prntsDstnct = prntsDstnct;
	}
	
	
	public boolean isExist() {
		return exist;
	}

	public void setExist(boolean exist) {
		this.exist = exist;
	}

	@Override
	public String toString() {
		return "MemberVo [mbNo=" + mbNo + ", mbDstnct=" + mbDstnct + ", mbNm=" + mbNm + ", nknm=" + nknm + ", iden="
				+ iden + ", pw=" + pw + ", sex=" + sex + ", birdt=" + birdt + ", myselfAuthzYn=" + myselfAuthzYn
				+ ", insrdDd=" + insrdDd + ", wthdrDd=" + wthdrDd + ", genalMbDstnct=" + genalMbDstnct
				+ ", snsTknValue=" + snsTknValue + ", snsDstnct=" + snsDstnct + ", agrg=" + agrg + ", telNo=" + telNo
				+ ", hndphNo=" + hndphNo + ", email=" + email + ", cdId=" + cdId + ", infoYn=" + infoYn + ", exist="
				+ exist + ", prntsNo=" + prntsNo + ", prntsDstnct=" + prntsDstnct + "]";
	}

	
		
}
