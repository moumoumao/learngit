select * from t_ticket
where 1=1
/* IF ticketId != -1 */
and ticket_id = /*ticketId*/ 'ticketId'
/*END*/
/* IF agencyId != -1*/
and agency_id =/*agencyId*/'agencyId'
/*END*/
/* IF groupId!=-1*/
and group_id = /*groupId*/'groupId'
/*END*/
/* IF preWaybill !=''*/
and pre_waybill~/*preWaybill*/'preWaybill'
/*END*/
/* IF waybillNum!='' */
and waybill_num~/*waybillNum*/'waybillNum'
/*END*/
/* IF startNum!=''*/
and start_num~/*startNum*/'startNum'
/*END*/
/* IF endNum!=''*/
and end_num~/*endNum*/'endNum'
/*END*/
/* IF ticketDateStart!= null */
and ticket_date>=/*ticketDateStart*/'ticketDateStart'
and ticket_date<=/*ticketDateEnd*/'ticketDateEnd'
/*END*/
/* IF useStatus!=-1 */
and use_status=/*useStatus*/'useStatus'
/*END*/
/* IF recipients!='' */
and recipients~/*recipients*/'recipients'
/*END*/
/* IF ticketType!='' */
and ticket_type=/*ticketType*/'ticketType'
/*END*/
/*IF pageSize != 0 */
limit /*pageSize*/'pageSize' offset /*pageStart*/'pageStart'
/*END*/