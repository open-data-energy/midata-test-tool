<!doctype html>
<html>
<head>
<title>Oauth2 Implicit Callback Page</title>
<head>
<body>
	<script
		src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
	<script src="js/oauth.js"></script>
	<script type="text/javascript">
		window.onload = function() {
			document.forms["EventConfirmRedirection"].submit();
		}
	</script>

	
	<form name="EventConfirmRedirection" method="post" action="supplydetails">
		<input type= "hidden" name="access_token" id="access_token" value="" />
	</form>
</body>
</html>