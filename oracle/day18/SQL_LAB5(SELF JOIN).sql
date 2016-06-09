-- SELF JOIN
1. 직원의 이름과 관리자 이름을 조회하시오.
select * from employees
select e.first_name 직원, m.first_name 관리자
from employees e, employees m
where e.employee_id = m.manager_id
order by m.first_name

2. 직원의 이름과 관리자 이름을 조회하시오.
관리자가 없는 직원정보도 모두 출력하시오.
select e.employee_id 직원id, e.first_name, m.employee_id, m.first_name
from employees e, employees m
where e.manager_id = m.employee_id


3. 관리자 이름과 관리자가 관리하는 직원의 수를 조회하시오.
단, 관리직원수가 3명 이상인 관리자만 출력되도록 하시오.

select m.first_name, count(e.first_name)
from employees e, employees m
where e.manager_id = m.employee_id
group by m.first_name
having count(e.first_name) >=3
order by 2
