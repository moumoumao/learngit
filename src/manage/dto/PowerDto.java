package manage.dto;

import java.util.List;

public class PowerDto {
	private int waybill_query_pope;//主运单查询.
	private int waybill_add_pope ;//主运单新增
	private int waybill_flag_pope;//主运单标记
	private int waybill_alterdate_pope;//填开主单填开日修改
	private int waybill_print_pope;//主单打印
	private int branch_waybill_query_pope;//分单查询
	private int branch_waybill_add_pope;//分单新增
	private int branch_waybill_flag_pope;//分单标记
	private int branch_waybill_alterdate_pope;//填开分单填开日修改
	private int branch_waybill_second_pope;//补录分单
	private int statement_query_pope;//报表查询
	private int statement_export_pope;//报表导出
	private int shipping_pope;//承运信息报表查询
	private int shipping_export_pope;//承运信息报表导出
	private int departure_income_query_pope;//出港收入报表查询
	private int departure_income_export_pope;//出港收入导出
	private int topayment_pope;//到付款报表查询
	private int topayment_export_pope;//到付款导出
	private int backhander_pope;//回扣汇总报表查询
	private int backhander_export_pope;//回扣汇总导出
	private int deliveryfee_pope;//派送费汇总报表查询
	private int deliveryfee_export_pope;//派送费汇总导出
	private int transitvalue_pope;//中转费汇总报表查询
	private int transitvalue_export_pope;//中转费汇总导出
	private int repayment_pope;//还款管理查询
	private int repayment_add_pope;//还款管理新增
	private int accounts_pope;//应收款统计查询
	private int accounts_export_pope;//应收款统计导出
	private int returnfeecheck_pope;//回扣审核
	private int returnfeecheck_query_pope;//回扣审核报表查询
	private int returnfeecheck_export_pope;//回扣审核导出
	private int deliveryfeecheck_pope;//派送费审核
	private int deliveryfeecheck_query_pope;//派送费审核报表查询
	private int deliveryfeecheck_export_pope;//派送费审核导出
	private int freightcheck_pope;//运费审核
	private int freightcheck_query_pope;//运费审核报表查询
	private int freightcheck_export_pope;//运费审核导出
	private int transitvaluecheck_pope;//中转费审核
	private int transitvaluecheck_query_pope;//中转费审核报表查询
	private int transitvaluecheck_export_pope;//中转费审核导出
	private int waybill_account_query_pope;//主单调张报表查询
	private int waybill_account_pope;//主单调张
	private int incomeaccoun_query_pope;//出港收调账报表查询
	private int incomeaccoun_export_pope;//出港收入调张导出
	private int incomeaccoun_pope;//出港收入调张
	private int tosectionaccoun_query_pope;//到付款调账报表查询
	private int tosectionaccoun_export_pope;//到付款调账导出
	private int tosectionaccoun_pope;//到付款调账
	private int goodstype_add_pope;//货物类别增加
	private int goodstype_delete_pope;//货物类别删除
	private int goodstype_alert_pope;//货物类别修改
	private int goodstype_query_pope;//货物类别查询
	private int goodsname_add_pope;//货物品名增加
	private int goodsname_delete_pope;//货物品名删除
	private int goodsname_alert_pope;//货物品名修改
	private int goodsname_query_pope;//货物品名查询
	private int packagename_add_pope;//包装名增加
	private int packagename_delet_pope;//包装名删除
	private int packagename_alert_pope;//包装名修改
	private int packagename_query_pope;//包装名查询
	private int proxy_add_pope;//代理增加
	private int proxy_delet_pope;//代理删除
	private int proxy_alert_pope;//代理修改
	private int proxy_query_pope;//代理查询
	private int destination_station_add_pope;//目的站增加
	private int destination_station_delet_pope;//目的站删除
	private int destination_station_alert_pope;//目的站修改
	private int destination_station_query_pope;//目的站查询
	private int customer_add_pope;//客户增加
	private int customer_delet_pope;//客户删除
	private int customer_alert_pope;//客户修改
	private int customer_query_pope;//客户查询
	private int ticket_add_pope;//票证增加
	private int ticket_delet_pope;//票证删除
	private int ticket_alert_pope;//票证修改
	private int ticket_query_pope;//票证查询
	private int agency_query_pope;//机构设置查询
	private int agency_delet_pope;//机构设置删除
	private int agency_alert_pope;//机构设置修改
	private int agency_add_pope;//机构设置新增
	private int group_query_pope;//部门设置查询
	private int group_delet_pope;//部门设置删除
	private int group_alert_pope;//部门设置修改
	private int group_add_pope;//部门设置新增
	private int person_query_pope;//权限设置查询
	private int person_delet_pope;//权限设置删除
	private int person_alert_pope;//权限设置修改
	private int person_add_pope;//权限设置新增
	private int branch_waybill_print_pope;//分单打印
	private int statement_delete_pope;//日报表删除
	private int waybill_account_export_pope;//主单调账导出
	private int domestic_departure;//国内出港
	private int daily_statement;//日报表
	private int departure_statement;//出港财务报表
	private int audit_manag;//审核管理
	private int account_system;//调账系统
	private int auxiliary_info;//辅助信息
	private int ticket_manage;//票证管理
	private int system_manage;//系统
	private int agency_down_list_pope;//机构下拉权限
	private int group_down_list_pope;//部门下拉权限
	private int down_list_pope;//下拉权限
	private int check_pass1;//第一审批通过权限
	private int check_pass2;//第二审批通过权限
	private int check_pass3;//第三审批通过权限
	private int other_fee_add;//添加其他费用权限
	private int other_fee_alert;//其他费用修改
	private int other_fee_delete;//其他费用删除
	private int other_fee_query;//其他费用查询
	private int cancel_ticket_preview_pope;//取消预览
	private int ticket_preview_pope;//票证预览
	private int ticket_second_grant_pope;//二次发放
	private int ticket_second_query_pope;//二次发放查询
	private int waybill_delete_pope;//主单删除
	private int branch_waybill_delete_pope;//分单删除
	private int pick_query_pope;//提货单查询
	private int pick_alert_pope;//提货单修改权限
	private int pick_add_pope;//提货单新增权限
	private int pick_print_pope;//提货单打印权限
	private int pick_delete_pope;//提货单删除权限
	private int pick_export_pope;//提货单导出权限
	private int pick_pope;//进港日报表
	private int incoming_revenue_pope;//进港财务
	private int incoming_revenue_query_pope;//
	private int incoming_revenue_export_pope;//进港收入导出
	private int incoming_receivables_pope;//进港应收
	private int incoming_receivables_query_pope;//进港应收查询
	private int incoming_receivables_export_pope;//进港导出
	private int agency_fund_pope;//代收款权限
	private int agency_fund_query_pope;//代收款查询
	private int agency_fund_export_pope;//代收款导出
	private int incoming_payments_pope;//进港还款
	private int incoming_payments_query_pope;//进港还款查询
	private int incoming_payments_add_pope;//进港还款添加
	private int incoming_payments_edit_pope;//进港还款编辑
	private int update_branch_waybill_pope;//分单整体修改权限
	private int update_master_waybill_pope;//主单整体修改权限
	private int update_way_print_pope;//主单打印状态修改
	private int update_branch_print_pope;//分单打印状态修改
	private int update_arrival_print_pope;//修改提货单打印状态
}
