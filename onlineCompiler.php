<!DOCTYPE html>
<html>
<head>
<title>

</title>

<script type="text/javascript">
    	
	
	
	function CopyMe(oFileInput) {
		var filePath = oFileInput.value;
		fh = fopen(filePath, 0);
		if (fh!=-1) {
			length = flength(fh);
			str = fread(fh, length);
			fclose(fh);
		}
		document.getElementByID('text-area3').innerHTML = str;
	}
	
</script>
<style type="text/css">      
  	
	body {
		background-color:orange;
		margin-left: 28px;
		margin-top: 15px;
		margin-right: 15px;
	}
a {
		font-family: Arial;  
        font-size: 15px;  
    }          
    a:link {
		color: #0000FF;
    }  
    a:visited {  
		color: #000000;  
    }
    a:active {  
		color: #666666;  
    }
    a:hover {  
		color: #FF0000;
    }
	input[type="file"] {
		border:1px dotted #000;
	}
</style>
</head>

<body>

<?php
function Read($file){
	echo file_get_contents($file);
};



$comp = @$_POST['compiler_list'];
if ($comp == 'Isee') {
	$redirectPage = "gccOnline.php";
?>

<?php
}
else if($comp == 'IseeWithClass') {
	$redirectPage = "gppOnline.php";
?>

<?php
}
else {
	$redirectPage = "JavaOnline.php";
?>

<?php
}
?>

<form name="form1" method="post" action="<?php echo $redirectPage;?>" target="content">


<label><H3>Playground Id :</H3></label>

<script>
var x= Math.floor(Math.random() * 10000);


document.write(x);

</script>



<H3>Write your code here </H3>
<textarea name = "text-area3" id = "text-area3" 
value = "<?php echo $text-area3;?>" class = "formtextarea" cols="95" rows="40">

<?php if (isset($_POST['text-area3'])) 
echo $_POST['text-area3']; ?>

</textarea>
<br>


<input type="file" id="form1_field1" onchange="CopyMe(this);">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="submit" value="Run" name="rubButton">

</form>
</body>
</html>
