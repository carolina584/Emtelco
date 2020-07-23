#Author: Carolina Muñoz
# encoding: utf-8
Feature: Agregar Direccion Adicionales
  yo como usuario administrador de la plataforma automationpractice
  quiero ver la lista de direcciones adicionales 
  para consultar la informacion de las mismas y administrarlas

 Scenario Outline: Login
   Given que el usuario ingresa a la pagina de automationpractice
   When el usuario selecciona en login y diligencia las credenciales email y contraseña en el formulario
   Then el usuario visualiza la informacion de su cuenta
    
     Examples:
    |user           	   | password 	|
    |yinaa56@hotmail.com   |Emtelco2020.|
  
  Scenario: Agregar direccion
    When usuario elige la opcion mis direcciones, ademas agrega una nueva
    Then se visualiza la lista de direcciones agregadas
    
  
    
	