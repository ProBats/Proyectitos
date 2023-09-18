<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<div class="container-lg bg-success-subtle">
		<h1 class="text-primary bg-secondary-subtle titulo">Sumar Numeros</h1>
        <form>
            <div class="mb-3 row">
                <label for="numero1" class="text-primary col-sm-2 col-form-label">Numero 1: </label>
                <div class="col-sm-10">
                    <input type="number" class="text-primary form-control" name="numero1" id="numero1" value="0">
                </div>
            </div>
            <div class="mb-3 row">
                <label for="numero2" class="text-primary col-sm-2 col-form-label">Numero 2:</label>
                <div class="col-sm-10">
                    <input type="number" class="text-primary form-control" name="numero2" id="numero2" value="0">
                </div>
            </div>
            <div class="mb-3 row">
                <label for="resultado" class="text-primary col-sm-2 col-form-label">Resultado: </label>
            <div class="col-sm-10" >
                    <input type="text" readonly class="--bs-body-bg form-control" id="resultado" value="<%
                    																					try{
                    																						String seleccion = request.getParameter("operacion");
                    																					    double nro1 = Double.parseDouble(request.getParameter("numero1"));
                    																					    double nro2 = Double.parseDouble(request.getParameter("numero2"));
                    																					    
                    																					    double resultado;
                    																					    switch (seleccion) {
                    																					        case "1":
                    																					            resultado = nro1 + nro2;
                    																					            out.println(resultado);
                    																					            break;
                    																					        case "2":
                    																					            resultado = nro1 - nro2;
                    																					            out.println(resultado);
                    																					            break;
                    																					        case "3":
                    																					            resultado = nro1 * nro2;
                    																					            out.println(resultado);
                    																					            break;
                    																					        case "4":
                    																					        	if(nro2!=0){
                    																					        		resultado = nro1 / nro2;
                    																					        		out.println(resultado);
                    																					        	}else{
                    																					        		out.println("No se puede dividir en 0");
                    																					        	}
                    																					            break;
                    																					        default:
                    																					            resultado = 0;
                    																					            break;
                    																					    }
                    																					    
                    																					}catch(Exception e){
                    																						out.println("0");
                    																					}
                    																					%>">
                </div>
            </div>
            <div class="mb-3 row">
                <button type="submit" class="btn btn-outline-primary col-sm-1" name="operacion" value="1">+</button>
                <button type="submit" class="btn btn-outline-warning col-sm-1" name="operacion" value="2">-</button>
                <button type="submit" class="btn btn-outline-secondary col-sm-1" name="operacion" value="3">x</button>
                <button type="submit" class="btn btn-outline-success col-sm-1" name="operacion" value="4">/</button>
                <button type="reset" class="btn btn-outline-danger col-sm-2">C</button>
            </div>
    	</form>
	</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>