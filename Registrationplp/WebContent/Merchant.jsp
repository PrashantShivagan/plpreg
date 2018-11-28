<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="m"  uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Merchant Registration Page</title>
<script type="text/javascript">
function checkCust(){
	
	
	if(document.mform.vname.value==""){alert("Please fill vendor name !!"); return false}
	//else if(document.mform.lname.value==""){alert("Please fill last name !!"); return false}
	
	else if(document.mform.mob.value==""){alert("Please fill Mobile Number !!"); return false}
	else if(document.mform.address.value==""){alert("Please fill Address !!"); return false}
	else if(document.mform.uname.value==""){alert("Please fill user name !!"); return false}
	
	else if(document.mform.pass.value==""){alert("Please fill paswword !!"); return false}
	else if(document.mform.pass1.value==""){alert("Please fill confirm password !!"); return false}
	else if(document.mform.getElementById("terms").isSelected()==false){alert("Agree Terms and Conditions !!"); return false}
		else{
		
		return true;
	}
		
	
	
}


function checkCust1(){
	
	var pass1 = document.getElementById("pass");
	var pass2 = document.getElementById("pass1");
	if(pass1.value != pass2.value )
	{
		alert("Passwords donot match!");
	}
	
}

function phonenumber(inputtxt)
{
  var phoneno = /^\(?([0-9]{3})\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$/;
  if(inputtxt.value.match(phoneno))
     {
	   return true;
	 }
   else
     {
	   alert("Not a valid Phone Number");
	   return false;
     }
}

</script>
</head>
<h3>Merchant Registration Page:</h3><br><br><br>
<body>
 <m:form name="mform" method="post" action="msuccess" modelAttribute="my"  onsubmit="return checkCust()">
            <center>
            <table border="1" width="30%" cellpadding="5">
                <thead>
                    <tr>
                        <th colspan="2">Enter User Information Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Vendor Name</td>
                        <td><m:input path="vendorname" type="text" id="vname" value="" pattern="[A-Za-z ]{3,24}" title="Vendor Name must contain only alphabets" /></td>
                    </tr>
                    <tr>
                        
                        <tr>
                        <td>Mobile </td>
                        <td><m:input path="mobileNo" type="text" id="mob" value="" pattern="[6789][0-9]{9}" title="Mobile Number must start with 6/7/8/9 and contains 10 digits" /></td>
                    </tr>
                     <tr>
                        <td>Address</td>
                        <td><m:input path="address" type="text" id="address" value="" /></td>
                    </tr>
                     
                    
                    <tr>
                        <td>User Name</td>
                        <td><m:input path="username" type="text" id="uname" value="" pattern="[A-Za-z._0-9]{3,24}[@][A-Za-z0-9]{3,10}[.][A-Za-z]{2,5}" title="enter valid username as email format"/></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><m:input path="password" type="password" id="pass" value="" pattern="[A-Za-z0-9_@!#$]{8,15}" title="Password must contain 8 characters and contain any of these {_@!#$} charcters" /></td>
                    </tr>
                    <tr>
                        <td>Confirm Password</td>
                        <td><input  type="password" id="pass1" value="" onchange="javascript:checkCust1()" /></td>
                    </tr>
                    
                   
                   
                </tbody>
            </table>
            <input type="checkbox" id="terms"> I agree to terms and conditions <br><br>
             <tr>
                        <td><input type="submit" value="Register" /></td>
                        
                        <td><input type="reset" value="Reset Page" /></td>
                    </tr>
                     <tr>
                        <td colspan="2">Already registered!! <a href="login">Login Here</a></td>
                    </tr>
            </center>
            </m:form>

</body>
</html>