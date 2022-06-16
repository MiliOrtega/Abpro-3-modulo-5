<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Capacitacion</title>

<link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
      crossorigin="anonymous"
    />
</head>
<body>
<header>

<%@ include file ="navbar.jsp" %>
</header>


       <section>
    
   <h2 class="text-center mb-4">Crear Capacitacion</h2>
    
    
    <div class="container-fluid">
    <div class="row">
      <div class="col-12 col-md-8 col-lg-4 mx-auto">
       <FORM action="CrearCapacitacion" method="post">
          <div class="form-group">
            <label for="name">Nombre: </label>
            <input name="nombre" class="form-control">
          </div>
          <div class="form-group">
            <label for="apellido">Apellido: </label>
            <input name="apellido" class="form-control">
          </div>
          <div class="form-group">
            <label for="email">Correo Electrónico</label>
            <input name="email"  class="form-control">
          </div>
          <div class="form-group">
            <label for="tipoCurso">Tipo Capacitacion</label>
            <input name="tipoCurso"  class="form-control">
          </div>
          <div class="form-group">
            <label for="fecha">Fecha</label>
            <input name="fecha" class="form-control">
          </div>
          <div class="form-group">
            <label for="lugar">Lugar</label>
            <input name="lugar" class="form-control">
          </div>
          <div class="form-group">
            <label for="msj"> Escribe tu Mensaje</label>
            <textarea name="msj" class="form-control" rows="3"></textarea>
          </div>
          <button type="submit" class="btn btn-success btn-block my-4">Enviar</button>
          
          
        </form>
      </div>
    </div>
  </div>  
            
 </section>
 
 <footer>
  <%@ include file ="footer.jsp" %>
   </footer>  
 
      
 <script
    src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
    integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
    crossorigin="anonymous"
  ></script>

  <script
    src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
    integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
    crossorigin="anonymous"
  ></script>
</body>
</html>