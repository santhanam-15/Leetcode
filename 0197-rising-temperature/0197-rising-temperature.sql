# Write your MySQL query statement below

select w.id from weather w inner join  weather w2 On datediff(w.recordDate,w2.recordDate)=1 where w.temperature>w2.temperature