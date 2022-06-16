<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inicio</title>
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
      <h2 class="text-center text-md-left pl-md-4">Bienvenidos a nuestra empresa de Asesorias</h2>
      <p class="text-justify px-4">
        Nuestra Empresa se dedica a realizar asesorías en prevención de riesgos necesita contar con un sistema de información
que le permita administrar los principales procesos que se llevan a cabo en ella día a día.
      </p>
    </section>
 
 <div class="container-fluid">
    <div class="row">
      <div class="col-12 col-md-8 col-lg-4 mx-auto">
       <form action="Inicio" method="post">
       <h2 class="text-center mb-4">Ingrese a que area pertenece </h2>
          <div class="form-group">
           <INPUT type="radio" name="usuario" value="Cliente"> Cliente <BR>
          </div>
          <div class="form-group">
           <INPUT type="radio" name="usuario" value="Administrativo"> Administrativo<BR>
          </div>
          <div class="form-group">
            <INPUT type="radio" name="usuario" value="Profesional"> Profesional<BR>
          </div>
          <button type="submit" class="btn btn-success btn-block my-4">Enviar</button>
  
       <p class="text-justify px-4">Gracias por su preferencia </p>
   
 </FORM>
 </div>
 </div>
 </div>
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