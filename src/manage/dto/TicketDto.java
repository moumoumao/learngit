package manage.dto;

import java.util.Date;

import org.seasar.dao.annotation.tiger.Bean;
import org.seasar.dao.annotation.tiger.Column;
public class TicketDto {
	private int ticketId;//票证id
	private String preWaybill;//货单前缀
	private String ticketType;//票证类型
	private String ticketUser;//票证使用人
	private Date ticketDate;//发放日期
	private int agencyId;//机构名
	private int groupId;//部门名
	private int ticketCount;//总数量
	private String grantName;//发放人
	private int useStatus;//使用状态
	private Date useDate;//使用日期
	private int ticketFlag;//票证标识
	private String startNum;//序列号起始号码
	private String endNum;//序列号终止号码
	private String waybillNum;//货单号码
	private String orderNum;//序列号
	private String recipients;//领用人
	private Date secondGrantDate;//二次发放日期
	private int waybillType;//运单类型
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public String getPreWaybill() {
		return preWaybill;
	}
	public void setPreWaybill(String preWaybill) {
		this.preWaybill = preWaybill;
	}
	public String getTicketType() {
		return ticketType;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	public String getTicketUser() {
		return ticketUser;
	}
	public void setTicketUser(String ticketUser) {
		this.ticketUser = ticketUser;
	}
	public Date getTicketDate() {
		return ticketDate;
	}
	public void setTicketDate(Date ticketDate) {
		this.ticketDate = ticketDate;
	}
	public int getAgencyId() {
		return agencyId;
	}
	public void setAgencyId(int agencyId) {
		this.agencyId = agencyId;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public int getTicketCount() {
		return ticketCount;
	}
	public void setTicketCount(int ticketCount) {
		this.ticketCount = ticketCount;
	}

	public String getGrantName() {
		return grantName;
	}
	public void setGrantName(String grantName) {
		this.grantName = grantName;
	}
	public int getUseStatus() {
		return useStatus;
	}
	public void setUseStatus(int useStatus) {
		this.useStatus = useStatus;
	}
	public Date getUseDate() {
		return useDate;
	}
	public void setUseDate(Date useDate) {
		this.useDate = useDate;
	}
	public int getTicketFlag() {
		return ticketFlag;
	}
	public void setTicketFlag(int ticketFlag) {
		this.ticketFlag = ticketFlag;
	}
	public String getStartNum() {
		return startNum;
	}
	public void setStartNum(String startNum) {
		this.startNum = startNum;
	}
	public String getEndNum() {
		return endNum;
	}
	public void setEndNum(String endNum) {
		this.endNum = endNum;
	}
	public String getWaybillNum() {
		return waybillNum;
	}
	public void setWaybillNum(String waybillNum) {
		this.waybillNum = waybillNum;
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public String getRecipients() {
		return recipients;
	}
	public void setRecipients(String recipients) {
		this.recipients = recipients;
	}
	public Date getSecondGrantDate() {
		return secondGrantDate;
	}
	public void setSecondGrantDate(Date secondGrantDate) {
		this.secondGrantDate = secondGrantDate;
	}
	public int getWaybillType() {
		return waybillType;
	}
	public void setWaybillType(int waybillType) {
		this.waybillType = waybillType;
	}
	
}
