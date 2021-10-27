function validateUserid(){
	var userTyped=document.getElementById( "user").value ;
	if( userTyped.length < 6 || userTyped.length > 30 ){
		alert("userid must be between 6 and 30 characters long");
		document.getElementById( "user").style="background:red";
	}
	else
	{
		document.getElementById( "user").style="background:white";
	}
}


function validatelogin(){
	// collect whatever customer typed in the login section
	
	var customerEnteredUid=document.getElementById("user").value;
	//var customerEnteredUid=$("#uid").val();
	
	var customerEnteredpwd=document.getElementById("pwd").value;
	//var customerEnteredpwd=$("#pwd").val();
	
	// verify all login info is entered correctly
	if(customerEnteredUid == ""  )
	{
		//$("#uid").val("please enter");
		document.getElementById("user").style.background="red";
		//$("#uid").css("background","purple");
		alert(" userid is mandatory");
		return false;
	}
	else if (customerEnteredpwd == ""  )
	{
		document.getElementById("pwd").style.background="blue";
		alert(" password is mandatory");
		return false;
	}
	else
		return true;
	
}



var customerclick="";
function hoverfilter(){
   console.log("customer mouse is now hovering over filter website section");
}
function shoe(){
	customerclick="shoe";
	console.log("customer is loooking for "+customerclick);
}
function cellphone(){
	customerclick="cellphone";
	console.log("customer is loooking for "+customerclick);
}
function uidTest(){
	console.log("customer is about to type usrid");
}
function uidFocus(){
	console.log("customer is now focusing on userid textbox");
}
function uidBlur(){
	console.log("customer lost focus from userid textbox");
}

function filterClicked(){
	console.log("customer just clicked filter section of webpage");
}
var xyz=123;

function   test( a, b  ){
	
	// basic primitive data type
	var v="john";
	v=true;
	
	var b=true;
	var c='x';
	var d= 10;
	var e=10.0;
		
	var f=[1,4,5,6];
	console.log(f [3] );
	// System.out.print
	console.log("welcome to javascript");
	// object data type
	var student={
		name : "john",
		age : 10,
		grade : 2,
		learn : function(  ){
			console.log("attending class");
		}
	};
	
	student.name;
	student.learn();
	alert("hi");
	add(123,12);
	return 1;
	
}

add(1,2);
function add( a, b){

	for(i=0; i < 3;i++)
		console.log("hello :"+i);
	
	if ( a == b ){
		console.log("same");
	}
	else{
		console.log("not same");
	}
	
	while(true){
		console.log("in while loop");
		break;
	}
	
	do{
		console.log("in do while loop");
		break;
	}while(true);
	 
	try{
		var aa=abc.split("a");
	}catch(e){
		console.log("error caught");
	}finally{
		console.log("finally block");
	}
	
	var email="abcd.com";
	console.log(email);
	email=email.replace("a","c");
	console.log(email);
	var arr=email.split("@");
	console.log(arr);
/*	
	if(email.indexOf("@")  == -1 )
		alert("invalid email id"); // popup window
	else
		alert("valid email id");
*/
	
}

function clickLogo(){
	alert("double click with jquery");
}


function abc(){
	alert("customer is moving mouse on userid text box");
}









/*
checkDevice();
function checkDevice(){
	var a=window.navigator.userAgent;
//	alert(a);
}

$(document).ready(function() {
	$("#loginsubmit").click(validatelogin);
	$("#reguid").blur(checkUser);
	$(".prodDisplay").click(animate);
	loginAttemptCheck();
	
});

function checkUser(){

	var checkUserAjaxObj={
	        url: '/doesUserExist',
	        type: 'post',
	        data: {
	        	registerUser:$("#reguid").val()
			},
	        context: this,
		    success: function (data) {
	        		if(data=="true")
	        			alert("userid already taken");
	        		else
	        			alert("userid available");
		        },
	        error: function (data) {
	        	console.log("failure");
	        }
	};
	
	$.ajax(  checkUserAjaxObj  );
	
}
function animate(){
	$(".prodDisplay").slideUp(10000);
}
*/



/*
	var customerEnteredUid=$("#uid").val();
	var customerEnteredpwd=$(".pass").val();
	if(customerEnteredUid == "" || customerEnteredpwd == "")
		alert(" userid and password is mandatory");
	if(customerEnteredUid.indexOf("@")  == -1 ){
		alert("invalid userid id");
		$("#uid").css("background","red");
		$("#submit").hide();
	}
	$("#uid") - access html element by "id" attribute
	$(".pass") - access html element by "class" attribute
	$("label") - access html element by element name
	$("#products").fadeOut(3000);
	$("#uid").css("background","blue");
	$("#uid").val("set value");
	
*/	
	
	
/*
function loginAttemptCheck(){

	var loginAttemptCheck={
	        url: '/loginAttempt',
	        type: 'get',
	        context: this,
		    success: function (data) {
					$("#loginAttemptDisplay").text("login attempts:"+data);
		        },
	        error: function (data) {
	        	console.log("failure");
	        }
	};
	
	$.ajax(  loginAttemptCheck  );
	
}

*/



