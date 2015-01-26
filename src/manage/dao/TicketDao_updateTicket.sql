update t_tacket
set  ticket_id = ticket_id ,
/* IF ticketUser != '' */
set ticket_user=/*ticketUser*/'ticketUser',
/*END*/
/* IF useDate != null */
set use_date=/*useDate*/'useDate',
/*END*/
/* IF useStatus != -1 */
set use_status=/*useStatus*/'useStatus',
/*END*/
/* IF ticketFlag != -1 */
set ticket_flag=/*ticketFlag*/'ticketFlag',
/*END*/
/* IF recipients != '' */
set recipients=/*recipients*/'recipients',
/*END*/
/* IF secondGrantDate != null */
set second_grant_date=/*secondGrantDate*/'secondGrantDate'
/*END*/
where 1=1
/* IF ticketId != -1 */
and ticket_id = /*ticketId*/ 'ticketId'
/*END*/
/* IF preWaybill != '' */
and pre_waybill = /*preWaybill*/ 'preWaybill'
/*END*/
/* IF waybillNum != '' */
and waybill_num = /*waybillNum*/ 'waybillNum'
/*END*/

