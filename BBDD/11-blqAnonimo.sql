SET SERVEROUTPUT ON;
DECLARE
    V_idEmpleado employees.employee_id%TYPE;
    V_newOficio employees.job_id%type;
    V_oldOficio employees.job_id%type;
    minimo NUMBER(4);
    maximo NUMBER(4);    
BEGIN
    SELECT MIN(employee_id), MAX(employee_id)
    INTO minimo, maximo
    FROM employees;
    
    V_idEmpleado := &dime_el_id_del_empleado;
    IF (V_idEmpleado <minimo OR V_idEmpleado >maximo) THEN
        dbms_output.put_line('La ID del empleado no existe. Inténtalo de nuevo');
    ELSE
        SELECT job_id
        INTO V_oldOficio
        FROM employees
        WHERE employee_id = V_idEmpleado;
        V_newOficio := '&Introduce_el_nuevo_oficio';
        CAMBIA_OFICIO(V_idEmpleado,V_newOficio);
        IF (EXISTE_OFICIO(V_newOficio) = TRUE) THEN
            dbms_output.put_line('El empleado con la ID ' || V_idEmpleado || ' tiene ahora el oficio ' || V_newOficio);  
        ELSE
            dbms_output.put_line('No se ha realizado el cambio de oficio para el empleado ' || V_idEmpleado);
        END IF;
    END IF;
EXCEPTION
    WHEN OTHERS THEN
        dbms_output.put_line('FIN DE LA OPERACIÓN');
END;
/