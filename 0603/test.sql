1. 이름이 'adam' 인 직원의 급여와 입사일을 조회하시오.
select first_name, salary, hire_date
from employees
where first_name = initcap('adam')

2. 나라 명이 'united states of america' 인 나라의 국가 코드를 조회하시오.
SELECT COUNTRY_ID, COUNTRY_NAME FROM COUNTRIES
WHERE COUNTRY_NAME = REPLACE(initcap('United States of America'),'Of','of')



3. 'Adam의 입사일은 95/11/02 이고, 급여는 7000 입니다.' 이런 식으로 직원
정보를 조회하시오.
select first_name||'의 입사일은 '|| hire_date||'이고, 급여는 ' ||salary||' 입니다.' "직원정보 조회"
from employees




4. 이름이 5글자 이하인 직원들의 이름, 급여, 입사일을 조회하시오.
select first_name, salary, hire_date
from employees
where LENGTH(first_name) <= 5



5. 2005년도에 입사한 직원의 이름, 입사일을 조회하시오.
select first_name, hire_date
from employees
where to_char(hire_date,'yyyy') = 2005



6. 10년 이상 장기 근속한 직원들의 이름, 입사일, 급여, 근무년차를 조회하시오.
select first_name, hire_date, salary, to_char(sysdate,'yyyy')-to_char(hire_date,'yyyy') 근무년차
from employees
where to_char(sysdate,'yyyy')-to_char(hire_date,'yyyy') >= 10