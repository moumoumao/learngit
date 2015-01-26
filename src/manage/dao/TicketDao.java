package manage.dao;

import java.util.Date;
import java.util.List;

import org.seasar.dao.annotation.tiger.Arguments;
import org.seasar.dao.annotation.tiger.SqlFile;

import manage.dto.TicketDto;

public interface TicketDao {
	

	/**
	 * Ʊ֤��ϲ�ѯ
	 * @param ticketId Ʊ֤ID
	 * @param agencyId ����
	 * @param groupId ����
	 * @param preWaybill ǰ׺
	 * @param waybillNum ����
	 * @param startNum ���к���ʼ����
	 * @param endNum ���к���ֹ����
	 * @param useStatus ʹ��״̬
	 * @param ticketDateStart ��������
	 * @param ticketDateEnd
	 * @param recipients ������
	 * @param ticketType Ʊ֤����
	 * @return
	 */
	@SqlFile
	@Arguments({"ticketId","agencyId","groupId","preWaybill","waybillNum",
		"startNum","endNum","ticketDateStart","ticketDateEnd","useStatus","useDate",
		"recipients","ticketType","pageSize","pageStart"})
	public List<TicketDto> findTicket(int ticketId,int agencyId,int groupId,String preWaybill,String waybillNum,
		String startNum,String endNum,Date ticketDateStart,Date ticketDateEnd,int useStatus,String recipients,String ticketType,
		int pageSize,int pageStart);

/**
 * 
 * @param preWaybill ����ǰ׺
 * @param ticketType Ʊ֤����
 * @param ticketDate ��������
 * @param agencyId ������
 * @param groupId ������
 * @param ticketCount ������
 * @param grantName ������
 * @param startNum ���к���ʼ����
 * @param endNum ���к���ֹ����
 * @param waybillNum ��������
 * @param orderNum ���к�
 * @return
 */
	@SqlFile
	@Arguments({"preWaybill","ticketType","ticketDate","agencyId","groupId","ticketCount","grantName","startNum","endNum",
		"waybillNum","orderNum"})
	public int insertTicket(String preWaybill,String ticketType,Date ticketDate,
			int agencyId,int groupId,int ticketCount,String grantName,
			String startNum,String endNum,String waybillNum, String orderNum);

/**
 * Ʊ֤��Ϣ����
 * @param ticketId Ʊ֤id
 * @param preWaybill ����ǰ׺
 * @param waybillNum
 * @param ticketUser Ʊ֤ʹ����
 * @param useDate ʹ������
 * @param useStatus ʹ��״̬
 * @param ticketFlag Ʊ֤��ʶ
 * @param recipients ������
 * @param secondGrantDate ���η�������
 * @return
 */
	@SqlFile
	@Arguments({"ticketId","preWaybill","waybillNum","ticketUser","useDate","useStatus","ticketFlag","recipients","secondGrantDate"})
	public int updateTicket(int ticketId,String preWaybill,String waybillNum,String ticketUser,Date useDate,
			int useStatus,int ticketFlag,String recipients,Date secondGrantDate);

	/**
	 * ����Ʊ֤Idɾ����Ϣ
	 * @param ticketId
	 * @return
	 */
	@SqlFile
	@Arguments({"ticketId"})
	public int deleteTicket(int ticketId);

}
