<!DOCTYPE html>
<HTML>
    <HEAD>
        <TITLE> Tareas </TITLE>
        <META charset="utf-8"/>
        <META http-equiv="X-UA-Compatible" content="IE=edge"/>
        <META name="viewport" content="width=device-width, initial-scale=1"/>    
        <LINK rel="stylesheet" type="text/css" href="resources/css/bootstrap.css"/>
        <LINK rel="stylesheet" type="text/css" href="resources/css/style_min.css"/>
        <LINK rel="stylesheet" type="text/css" href="resources/css/tablatarea.css"/>

        <SCRIPT type="text/javascript" src="resources/js/jquery-3.2.1.min.js"></SCRIPT>
        <SCRIPT src="resources/js/bootstrap.min.js"></SCRIPT>
        <SCRIPT type="text/javascript" src="resources/js/comportamiento.js"></SCRIPT>
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
                    <li class="list-inline-item"><h2><a>Tareas</a></h2></li>
                    <li class="list-inline-item"><h4><a href="tablausuarios.jsp">Usuarios</a></h4></li>
                    <li class="list-inline-item"><a class="btn btn-info">LOGOUT</a></li>
                </ul>
               
                <form class="form" action="" method="post">
                    <table class="table table-striped">
                        <thead>
                            <tr>                            
                                <th>ID TAREA</th>
                                <th>NOMBRE</th>
                                <th>MACRO</th>
                                <th>DESCRIPCION</th>
                                <th>ESTADO</th>
                                <th>EDITAR</th>   
                                <th> <input type="button" value="+" class="btn btn-info addButton"/> </th>
                            </tr>
                        </thead>
                        <tbody class="clone_cont">
                            <tr class="clone">
                           
                                <td><input type="text" class="form-control" id="idtarea" placeholder="ID TAREA"></td>
                                <td><input type="text" class="form-control" id="nombret" placeholder="NOMBRE"></td>
                                <td><input type="text" class="form-control" id="macro" placeholder="MACRO"></td>
                                <td><textarea class="form-control" rows="2" id="descripcion" placeholder="DESCRIPCION"></textarea></td>
                                <td> 
                                    <select class="form-control" id="sel1">
                                        <option>ACTIVA</option>
                                        <option>INACTIVA</option>
                                    </select>
                                </td>
                                <td><input type="button" class="btn btn-info editMe" value="EDITAR"></td>
                                <td><input type="button" class="btn btn-info removeMe" value="BORRAR"></td>
                         
                            </tr>

                        </tbody>
                    </table>
                </form>
            </SECTION>
        </DIV>
    </BODY>
</HTML>