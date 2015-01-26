package manage.service.impl;

import java.util.List;

import manage.dao.TicketDao;
import manage.dto.TicketDto;
import manage.service.TicketService;

public class TicketServiceImpl implements TicketService {

	private TicketDao ticketDao;
	public TicketServiceImpl(TicketDao ticketDao) {
		this.ticketDao=ticketDao;
	}
	public int insertTicket(TicketDto dto) {
		return ticketDao.insertTicket( dto.getPreWaybill(), dto.getTicketType(), dto.getTicketDate(),
				dto.getAgencyId(), dto.getGroupId(), dto.getTicketCount(), 
				dto.getGrantName(), dto.getStartNum(), dto.getEndNum(), dto.getWaybillNum(),
				dto.getOrderNum());
	}

	public int deleteTicket(int ticketId) {
		return ticketDao.deleteTicket(ticketId);
	}

	public int updateTicket(TicketDto dto) {
		return 0;
	}

	public List<TicketDto> findAllTicket(int pageSize, int pageStart) {
		return ticketDao.findTicket(-1, -1, -1, "", "", "", "", null, null, -1, "", "", pageSize,pageStart);
	}

	public List<TicketDto> findTicketInSearch(TicketDto dto, int pageSize,
			int pageStart) {
		return ticketDao.findTicket(-1, dto.getAgencyId(), dto.getGroupId(), dto.getPreWaybill(),"", dto.getStartNum(), dto.getEndNum(),
				dto.getTicketDateStart(), dto.getTicketDateEnd(),dto.getUseStatus(),dto.getRecipients(),
				dto.getTicketType(), pageSize,pageStart);
	}

	public boolean isExist(TicketDto dto) {
		List<TicketDto> list = ticketDao.findTicket(-1, dto.getAgencyId(), dto.getGroupId(), dto.getPreWaybill(),"", dto.getStartNum(),
				dto.getEndNum(), null, null,-1,"","", 0,0);
		return (list.size()<=0)?false:true;
	}

}
