package manage.service;

import java.util.List;

import manage.dto.TicketDto;

public interface TicketService {
	public int insertTicket(TicketDto dto);
	public int deleteTicket(int ticketId);
	public int updateTicket(TicketDto dto);
	/**
	 * 查找所有的票证（分页）
	 * @param pageSize
	 * @param pageStart
	 * @return
	 */
	public List<TicketDto> findAllTicket(int pageSize,int pageStart);
	/**
	 * 在票证查询 或 二次发放 处的组合查询
	 * @param pageSize
	 * @param pageStart
	 * @return
	 */
	public List<TicketDto> findTicketInSearch(TicketDto dto,int pageSize,int pageStart);
	/**
	 * 判断该段票证是否已经发放过
	 * @param dto
	 * @return
	 */
	public boolean isExist(TicketDto dto);

}
