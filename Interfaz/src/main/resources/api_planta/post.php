<?php
include "config.php";
include "utils.php";
$dbConn =  connect($db);

/*
  listar todos los posts o solo uno
 */
  if (isset($views[1]) && (isset($_GET['u']))) {
    $views=explode("/", $_GET['u']);
    $request = $views[1];
  }else{
    $request = 'get';
  }

if ($request == 'get' && $_SERVER['REQUEST_METHOD'] == 'GET')
{
    if (isset($_GET['id']))
    {
      //Mostrar un post
      $sql = $dbConn->prepare("SELECT * FROM plantas where id_planta=:id");
      $sql->bindValue(':id', $_GET['id']);
      $sql->execute();
      header("HTTP/1.1 200 OK");
      echo json_encode(  $sql->fetch(PDO::FETCH_ASSOC)  );
      exit();
	  }
    else {
      //Mostrar lista de post
      $sql = $dbConn->prepare("SELECT * FROM plantas");
      $sql->execute();
      $sql->setFetchMode(PDO::FETCH_ASSOC);
      header("HTTP/1.1 200 OK");
      echo json_encode( $sql->fetchAll()  );
      exit();
	}
}
// Crear un nuevo post
if ($request == 'post' && $_SERVER['REQUEST_METHOD'] == 'POST')
{
    $input = $_POST;
    $sql = "INSERT INTO plantas
          (name_planta, img_planta, dsc_planta, tipe_planta)
          VALUES
          (:name_planta, :img_planta, :dsc_planta, :tipe_planta)";
    $statement = $dbConn->prepare($sql);
    bindAllValues($statement, $input);
    //echo json_encode($sql);
    //echo json_encode($input);
    $statement->execute();
    header("HTTP/1.1 200 OK");
    echo json_encode($input);
    //echo $input;
    exit();
}
//Borrar
if ($_SERVER['REQUEST_METHOD'] == 'DELETE')
{
	$id = $_GET['id'];
  $statement = $dbConn->prepare("DELETE FROM plantas where id_planta=:id");
  $statement->bindValue(':id', $id);
  $statement->execute();
	header("HTTP/1.1 200 OK");
	exit();
}
//Actualizar
if ($_SERVER['REQUEST_METHOD'] == 'PUT')
{
    $input = $_GET;
    $postId = $input['id'];
    $fields = getParams($input);
    $sql = "
          UPDATE plantas
          SET $fields
          WHERE id_planta='$postId'
           ";
    $statement = $dbConn->prepare($sql);
    bindAllValues($statement, $input);
    $statement->execute();
    header("HTTP/1.1 200 OK");
    exit();
}
//En caso de que ninguna de las opciones anteriores se haya ejecutado
//header("HTTP/1.1 400 Bad Request");
include ("error.php");
?>