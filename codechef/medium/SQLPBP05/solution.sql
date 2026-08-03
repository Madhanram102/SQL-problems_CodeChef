select m.match_id,m.player_1,m.player_2,m.winner,m.match_date,p.score from 
Players p join Matches m 
ON p.player_name=m.winner order by match_date desc limit 5;