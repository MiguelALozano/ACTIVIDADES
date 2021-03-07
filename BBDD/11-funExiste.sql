CREATE OR REPLACE FUNCTION EXISTE_OFICIO (
    newOficio employees.job_id%TYPE) RETURN BOOLEAN IS
    existe BOOLEAN;
    contador NUMBER(2);
BEGIN
    SELECT COUNT(*)
    INTO contador
    FROM jobs
    WHERE job_id = newOficio;
        IF (contador = 0) THEN
            existe := false;
        ELSE
            existe := true;
        END IF;
        RETURN existe;
END EXISTE_OFICIO;
/