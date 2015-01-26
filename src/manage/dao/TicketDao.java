package manage.dao;

import java.util.Date;
import java.util.List;

import org.seasar.dao.annotation.tiger.Arguments;
import org.seasar.dao.annotation.tiger.SqlFile;

import manage.dto.TicketDto;

public interface TicketDao {
	

	/**
	 * 票证组合查询
	 * @param ticketId 票证ID
	 * @param agencyId 机构
	 * @param groupId 部门
	 * @param preWaybill 前缀
	 * @param waybillNum 单号
	 * @param startNum 序列号起始号码
	 * @param endNum 序列号终止号码
	 * @param useStatus 使用状态
	 * @param ticketDateStart 发放日期
	 * @param ticketDateEnd
	 * @param recipients 领用人
	 * @param ticketType 票证类型
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
 * @param preWaybill 货单前缀
 * @param ticketType 票证类型
 * @param ticketDate 发放日期
 * @param agencyId 机构名
 * @param groupId 部门名
 * @param ticketCount 总数量
 * @param grantName 发放人
 * @param startNum 序列号起始号码
 * @param endNum 序列号终止号码
 * @param waybillNum 货单号码
 * @param orderNum 序列号
 * @return
 */
	@SqlFile
	@Arguments({"preWaybill","ticketType","ticketDate","agencyId","groupId","ticketCount","grantName","startNum","endNum",
		"waybillNum","orderNum"})
	public int insertTicket(String preWaybill,String ticketType,Date ticketDate,
			int agencyId,int groupId,int ticketCount,String grantName,
			String startNum,String endNum,String waybillNum, String orderNum);

/**
 * 票证信息更新
 * @param ticketId 票证id
 * @param preWaybill 货单前缀
 * @param waybillNum
 * @param ticketUser 票证使用人
 * @param useDate 使用日期
 * @param useStatus 使用状态
 * @param ticketFlag 票证标识
 * @param recipients 领用人
 * @param secondGrantDate 二次发放日期
 * @return
 */
	@SqlFile
	@Arguments({"ticketId","preWaybill","waybillNum","ticketUser","useDate","useStatus","ticketFlag","recipients","secondGrantDate"})
	public int updateTicket(int ticketId,String preWaybill,String waybillNum,String ticketUser,Date useDate,
			int useStatus,int ticketFlag,String recipients,Date secondGrantDate);

	/**
	 * 根据票证Id删除信息
	 * @param ticketId
	 * @return
	 */
	@SqlFile
	@Arguments({"ticketId"})
	public int deleteTicket(int ticketId);

}
