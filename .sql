--------------------------------------------------------
-- Archivo creado  - martes-julio-19-2022   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table PRODUCTO
--------------------------------------------------------

  CREATE TABLE "USER1"."PRODUCTO" 
   (	"NOMBRE" VARCHAR2(50 BYTE), 
	"MARCA" VARCHAR2(50 BYTE), 
	"HECHO_EN" VARCHAR2(50 BYTE), 
	"PRECIO" NUMBER(*,0)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
REM INSERTING into USER1.PRODUCTO
SET DEFINE OFF;
--------------------------------------------------------
--  Constraints for Table PRODUCTO
--------------------------------------------------------

  ALTER TABLE "USER1"."PRODUCTO" MODIFY ("NOMBRE" NOT NULL ENABLE);
  ALTER TABLE "USER1"."PRODUCTO" MODIFY ("MARCA" NOT NULL ENABLE);
  ALTER TABLE "USER1"."PRODUCTO" MODIFY ("HECHO_EN" NOT NULL ENABLE);
  ALTER TABLE "USER1"."PRODUCTO" MODIFY ("PRECIO" NOT NULL ENABLE);
