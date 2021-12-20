<?php
include "config.php";
include "utils.php";
$dbConn =  connect($db);
$views=explode("/", $_GET['u']);
/*
  listar todos los posts o solo uno
 */
if ($_SERVER['REQUEST_METHOD'] == 'GET')
{
    //if (isset($_GET['id']))
  if (isset($views[2])) 
    {
      //Mostrar un post
      $id=$views[2];
      $sql = $dbConn->prepare("SELECT * FROM plantas where id_planta=:id");
      $sql->bindValue(':id', $views[2]);
      $sql->execute();
      header("HTTP/1.1 200 OK");
      echo json_encode(  $sql->fetch(PDO::FETCH_ASSOC)  );
      exit();
	  }
    else {
      header("HTTP/1.1 400 Bad Request");
	}
}
//En caso de que ninguna de las opciones anteriores se haya ejecutado
//header("HTTP/1.1 400 Bad Request");
include ("error.php");
?>