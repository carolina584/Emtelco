#Author: Carolina Muñoz
# encoding: utf-8
Feature: Modificar nombre de opcion Regitrarse en formulario de login
  yo como usuario administrador de la plataforma automationpractice
  quiero modificar nombre la opcion llamada registrarse en formulario de Autenticación
  para que tenga relacion con la accion que se esta haciendo
  
   Scenario: Riesgo
   Given que el usuario se encuentra en autmationpractice
   When ingresa a la opcion registrarse y diligencia la informacion de credenciales
   Then la accion registrarse no deberia llamarse asi, porque se ingresan son las credenciales
  
  
  
  