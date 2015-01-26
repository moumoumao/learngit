package manage.service;

import java.util.List;

import manage.dto.TicketDto;

public interface TicketService {
	public int insertTicket(TicketDto dto);
	public int deleteTicket(int ticketId);
	public int updateTicket(TicketDto dto);
	/**
	 * �������е�Ʊ֤����ҳ��
	 * @param pageSize
	 * @param pageStart
	 * @return
	 */
	public List<TicketDto> findAllTicket(int pageSize,int pageStart);
	/**
	 * ��Ʊ֤��ѯ �� ���η��� ������ϲ�ѯ
	 * @param pageSize
	 * @param pageStart
	 * @return
	 */
	public List<TicketDto> findTicketInSearch(TicketDto dto,int pageSize,int pageStart);
	/**
	 * �жϸö�Ʊ֤�Ƿ��Ѿ����Ź�
	 * @param dto
	 * @return
	 */
	public boolean isExist(TicketDto dto);

}
