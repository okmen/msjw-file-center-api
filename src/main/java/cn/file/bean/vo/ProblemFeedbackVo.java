package cn.file.bean.vo;

import java.io.Serializable;
import java.util.Date;

public class ProblemFeedbackVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String wxcode;
	private String remark;
	private int status;
	private String jpgurl;
	private Date intime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWxcode() {
		return wxcode;
	}
	public void setWxcode(String wxcode) {
		this.wxcode = wxcode;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getJpgurl() {
		return jpgurl;
	}
	public void setJpgurl(String jpgurl) {
		this.jpgurl = jpgurl;
	}
	public Date getIntime() {
		return intime;
	}
	public void setIntime(Date intime) {
		this.intime = intime;
	}
	@Override
	public String toString() {
		return "ProblemFeedbackVo [id=" + id + ", wxcode=" + wxcode + ", remark=" + remark + ", status=" + status
				+ ", jpgurl=" + jpgurl + ", intime=" + intime + "]";
	}
}
