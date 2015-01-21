select * from t_user u
left join t_agency a on u.agency_id=a.agency_id
left join t_group g on u.group_id=g.group_id
left join t_role r on u.role_id=r.role_id
where u.user_name=/*userName*/'userName';