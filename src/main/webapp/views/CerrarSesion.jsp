<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Validacion</title>
<link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
      crossorigin="anonymous"
    />
    

 <body>
 
 <header>

<%@ include file ="navbar.jsp" %>
</header>
 
 
 <h2 class="text-center mb-4"> Hasta Pronto </h2>
 <p class="text-center px-4">
       Gracias por visitarnos, esperamos verte pronto!
      </p>
      
 <p class="text-center px-4">
      ¿Deseas abandonar la sesion?
      </p>     
 <section>
 
 <form method="post" action="CerrarSesion">
 		
 
         <div class="col v-center">
                <button class="btn btn-danger d-block mx-auto my-4"> Confirmar </button>
            </div>  
    </form>      
        
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