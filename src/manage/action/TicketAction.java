package manage.action;

import java.util.ArrayList;
import java.util.List;

import manage.dto.AgencyDto;
import manage.dto.GroupDto;
import manage.dto.TicketDto;
import manage.service.AgencyService;
import manage.service.GroupService;
import manage.service.TicketService;
import manage.util.AbstractAction;
import manage.util.Json;

public class TicketAction extends AbstractAction {
	private static final long serialVersionUID = 1L;

	private TicketService ticketService;
	private TicketDto ticketDto;
	
	public TicketAction(TicketService ticketService) {
		this.ticketService = ticketService;
	}
	/**
	 * 组合查询机构信息
	 */
	public void addTicket(){
		boolean flag=(ticketService.insertTicket(ticketDto)==1)?true:false;
		Json json = new Json();
		json.setSuccess(flag);
		super.writeJson(json);
	}

	
	public TicketDto getTicketDto() {
		return ticketDto;
	}
	public void setTicketDto(TicketDto ticketDto) {
		this.ticketDto = ticketDto;
	}

	

	
}
