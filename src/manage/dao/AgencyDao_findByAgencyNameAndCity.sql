select * from t_agency
where 1=1
/*IF agencyName!='' */
and agency_name~/*agencyName*/'agencyName'
/*END*/
/*IF agencyCity!= '' */
and a.agency_city ~ /*agencyCity*/'agencyCity'
/*END*/