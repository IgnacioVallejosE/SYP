<?php if (isset($_GET['u'])) {
	 
	$views=explode("/", $_GET['u']);
	if( $views['0']=="api"){
		if($views['1']=="post"){include("post.php");}
		elseif($views['1']=="delete"){include("post.php");}
		elseif($views['1']=="put"){include("post.php");}
		elseif($views['1']=="get"){
			if(isset($views['2']) && $views['2']>0){
				if($views['2']>0){include("postbyid.php");}
				else{include ("error.php");}
			}
			else{
				include ("post.php");
			}	
		}
		else{
		include ("error.php");
		}
	}
	elseif( $views['0']=="apiv2"){
		if($views['1']=="post"){include("postv2.php");}
		elseif($views['1']=="delete"){include("postv2.php");}
		elseif($views['1']=="put"){include("postv2.php");}
		elseif($views['1']=="get"){include("postv2.php");}
		else{
		include ("error.php");
		}
	}
	else{
		include ("error.php");	
	}
}
?>