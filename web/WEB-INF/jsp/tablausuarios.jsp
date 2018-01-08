<!DOCTYPE html>
<HTML>
    <HEAD>
        <TITLE> Tabla de usuarios </TITLE>
        <META charset="utf-8"/>
        <META http-equiv="X-UA-Compatible" content="IE=edge"/>
        <META name="viewport" content="width=device-width, initial-scale=1"/>

        <LINK rel="stylesheet" type="text/css" href="resources/css/bootstrap.css"/> 
        <LINK rel="stylesheet" type="text/css" href="resources/css/style_min.css"/> 
        <LINK rel="stylesheet" type="text/css" href="resources/css/TablaUsuario.css"/>

        <SCRIPT type="text/javascript" src="resources/js/jquery-3.2.1.min.js"></SCRIPT>
        <SCRIPT src="resources/js/bootstrap.js"></SCRIPT>
        <SCRIPT type="text/javascript" src="resources/js/comportamiento.js"></SCRIPT>


        <!-- <script type="text/javascript" src="js/botones.js"></script>
        <script src="http://code.jquery.com/jquery-latest.js"></script> -->

    </HEAD>
    <BODY>
   <NAV class="top-bar clearfix">
            <DIV class="container-fluid clearfix">
                <A class="top-bar-brand" href="#">
                    <SPAN class="atosIconFont atosIconFont-logo"></SPAN>
                </A>
            </DIV>
      

        </NAV>
        <DIV class="clearfix contentsso pki" role="main" style="margin-top: 30.25px;">
            <SECTION class="clearfix sso-box">
                <ul class="list-inline">
                    <li class="list-inline-item"><h4><a href="tablaasignacion.jsp">Asignaci&oacuten de tareas</a></h4></li>
                    <li class="list-inline-item"><h4><a href="tablatareas.jsp">Tareas</a></h4></li>
                    <li class="list-inline-item"><h2><a>Usuarios</a></h2></li>
                    <li class="list-inline-item"><a class="btn btn-info">LOGOUT</a></li>
                </ul>
                <form action="" method="post" id="taskt">
                    <table class="table table-striped">
                        <thead>
    			    <tr>
        		        <th>DAS</th>
        		        <th>NOMBRE</th>
        		        <th>APELLIDOS</th>
                                <th>PASSWORD</th>
        		        <th>ESTADO</th>
                                <th>EDITAR</th>
                	        <th> <input type="button" value="+" class="btn btn-info addButton"/> </th>
                            </tr>
                        </thead>
                        <tbody class="clone_cont">
                            <tr class="clone">
                                <td><input type="text" placeholder="DAS"/></td>
        		        <td><input type="text" placeholder="Nombre"/></td>
        		        <td><input type="text" placeholder="Apellidos"/></td>
        		        <td><input type="password" placeholder="Password"/></td>
                                <td>                        
                                    <select class="form-control" id="sel1">
                                        <option>CON ACCESO</option>
                                        <option>SIN ACCESO</option>
                                    </select>            
                                </td>
        		        <td><input type="button" class="btn btn-info editMe" value="EDITAR"/></td>
                                <td><input type="button" class="btn btn-info removeMe" value="BORRAR"/></td>
    			    </tr>
    			</tbody>
                    </table>
		</form>
            </SECTION>
        </DIV>
    </BODY>
</HTML>