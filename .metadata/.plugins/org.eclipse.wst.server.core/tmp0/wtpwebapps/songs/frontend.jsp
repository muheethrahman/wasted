<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor=blue>
<center>

<form action="songs">
<table>
<th>Register Song Details Below::
</th>

<tr>
<td>Song Name :</td><td> <input type="text" name="songName"></td></tr>
<tr>
<td>Featuring : </td><td><input type="text" name="featuring"></td></tr>
<tr>
<td>Singer : </td><td><input type="text" name="singer"></td></tr>
<tr>
<td>Duration :</td><td> <input type="text" name="duration"></td></tr>
<tr>
<td>Language : </td><td><input type="text" name="language"></td></tr>
<tr>
<td>Lyrics :</td><td> <input type="text" name="lyrics"></td></tr>
<tr><td><input type="submit" name="submit"></td></tr>
</table>

</form>
</center>
     </body>
</html>