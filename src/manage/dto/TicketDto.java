package manage.dto;

import java.util.Date;

import org.seasar.dao.annotation.tiger.Bean;
import org.seasar.dao.annotation.tiger.Column;
public class TicketDto {
	private int ticketId;//Ʊ֤id
	private String preWaybill;//����ǰ׺
	private String ticketType;//Ʊ֤����
	private String ticketUser;//Ʊ֤ʹ����
	private Date ticketDate;//��������
	private int agencyId;//������
	private int groupId;//������
	private int ticketCount;//������
	private String grantName;//������
	private int useStatus;//ʹ��״̬
	private Date useDate;//ʹ������
	private int ticketFlag;//Ʊ֤��ʶ
	private String startNum;//���к���ʼ����
	private String endNum;//���к���ֹ����
	private String waybillNum;//��������
	private String orderNum;//���к�
	private String recipients;//������
	private Date secondGrantDate;//���η�������
	private int waybillType;//�˵�����
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
