select DISTINCT p.player_name , p.score from Players p join Matches m 
ON p.player_name= m.winner Order by score desc limit 3; 