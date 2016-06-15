--Connect by 계층적 쿼리는 오라클만이 가진 기능 중 하나로, 
--데이터를 선택하여 계층적인 순서 그대로 리턴하는데 
--사용된다.
/*
start with
select 구문의 start with 절은 계층 구조가 
어떤 행에서 시작하는지 지정하는 기능을 한다.
 정의 : start with <조건>
 
Connect by Prior
connect by 절은 각 행이 어떻게 연결되는지를 
오라클에게 알려주는 역할을 한다. 
즉 계층 구조 내에서 각 행의 관계를 설정하는 것이다.
현재 행과 다른 행은 Prior라는 키워드를 통해 구별된다.
Prior는 상위 행을 참조하는 것으로, 
connect by 직속상사 = prior 직원 

level은 오라클에서 실행되는 
모든 쿼리 내에서 사용 가능한 가상열로서, 
트리 내에서 어떤 단계(level)에 있는지를 나타내는 
정수값이다.계층적인 쿼리가 아니라면 모든 값이 0 이다.
 where 절에 넣으면 전체 트리를 구성한 후에 다시 선택하는 반면, connect by 절에 넣으면 이 조건을 사용해서 트리를 구성하기 때문에 보다 효과적
where level < 4
connect by manager_id =  prior employee_id and level <= 4
*/
 
select level, employee_id,lpad(' ',(level-1)*4)||first_name,
       manager_id
from employees
start with manager_id is null
connect by manager_id =  prior employee_id 
 

select employee_id, lpad(' ',(level-1)*4)||first_name,
       manager_id
from employees
start with first_name='John'
connect by  prior manager_id =  employee_id 

