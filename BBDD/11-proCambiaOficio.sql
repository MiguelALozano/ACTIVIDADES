CREATE OR REPLACE PROCEDURE CAMBIA_OFICIO (
    idEmpleado IN employees.employee_id%TYPE,
    newOficio IN employees.job_id%TYPE) IS
BEGIN
    IF (EXISTE_OFICIO(newOficio) = true) THEN
        UPDATE employees
        SET job_id = newOficio
        WHERE employee_id = idEmpleado;
    ELSE
        dbms_output.put_line('No existe el oficio ' || newOficio);
    END IF;
END;
/