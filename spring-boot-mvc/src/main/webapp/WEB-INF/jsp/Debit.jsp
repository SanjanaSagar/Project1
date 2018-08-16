<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="ISO-8859-1">
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<link href="../bootstrap-3.2.0-dist/css/bootstrap.min.css" rel="stylesheet">
<title>Debit Card Payment</title>
<script src="../jQuery/jquery-1.11.1.min.js"></script> 
 <script src="../bootstrap-3.2.0-dist/js/bootstrap.min.js"></script>
</head>
<body>

<form  role="form" class="form-inline" >
<table align="center">
<div class="form-group col-lg-4" >
	
	<tr><td>Enter Card Number:</td><td><input type="text" name="cardNo" placeholder="Card Number" size="12" /></td></tr>
	<tr><td>Enter CardHolder Name:</td><td><input type="text" name="cardholderName" placeholder="Enter Name"/></td></tr>
	<tr><td>Enter CVV Number:</td><td><input type="text" name="cvvNo" placeholder="CVV Number" size="3" /></td></tr>
	<tr><td>Enter Expiry Date:</td><td><input type="Date" name="expdate" placeholder="Expiry Date" /></td></tr>
	<tr><td><button type="submit" value="login" class="btn btn-primary">SUBMIT</button></td></tr>
	 
</div>
</table>
</form>



</body>

</html>