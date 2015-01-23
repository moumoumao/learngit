select * from t_group
where 1=1
/*IF agencyId!=0*/
and agency_id = /*agencyId*/'agencyId'
/*END*/
/*IF groupName!=''*/
and group_name ~ /*groupName*/'groupName'
/*END*/