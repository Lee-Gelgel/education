--p193

select ename, deptno
from emp

select ename, dname
from emp, dept
order by ename asc

select ename, emp.deptno, dept.deptno, dname
from emp, dept
order by ename asc

select e.ename, e.deptno, d.deptno, d.dname
from emp e, dept d
order by e.ename asc

select e.ename, e.deptno, d.deptno, d.dname
from emp e, dept d
where e.deptno = d.deptno
order by e.ename asc


--oracle join
select e.ename, d.dname
from emp e, dept d
where e.deptno = d.deptno
order by e.ename asc

--ansi join
select e.ename, d.dname
from emp e 
		join dept d  using (deptno)
order by e.ename asc



select e.ename, d.dname
from emp e
		join dept d
			on (e.deptno = d.deptno)
order by e.ename asc

------------------------------------------------------------
select * from salgrade
select * from emp

select emp.ename, emp.sal, salgrade.graed
from emp, salgrade
where emp.sal between salgrade.losal and salgrade.hisal

select emp.ename, emp.sal, salgrade.grade
from emp join salgrade
on(emp.sal between salgrade.losal and salgrade.hisal )
