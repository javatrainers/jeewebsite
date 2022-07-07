
function checkUserid(){
	console.log("inside check userid function");
	// READ what customer typed in userid text box
	//var useridInput=document.getElementById("userid").value();
	var useridInput=$("#userid").val(); // jquery
	
	if(useridInput=="")
	{
		// customr didnt type userid
		// WRITE message for customer on userid text box
		//$("#userid").val("please enter userid"); 
		document.getElementById("userid").style="background:red";	
		$("#userid").css("background","red");
	}
	else if(useridInput=="john" || useridInput=="jane" )
	{
		alert("Userid already taken");
		document.getElementById("userid").style="background:red";
	}
	else if(useridInput.length < 6 )
	{
		alert("Userid must be atleast 6 characters long");
		document.getElementById("userid").style="background:red";
	}
	else{
		document.getElementById("userid").style="background:white";
	}	
	
	
}


function add( a , b ){
	if(a == 0)
		return false;
	
	var sum=a+b;
	return sum;
}

test();
function   test( ){
	var result=add(10,20);
	console.log(" sum result is :"+result);
	// basic primitive data type
	var v="john";
	v=true;
	
	var b=true;
	var c='x';
	var d= 10;
	var e=10.0;
	
	// arrays	
	var f=["john","jane","mike","andy","ron"];
	console.log(	f[3] );
	// System.out.print
	console.log("welcome to javascript");
	// object data type
	// no semicolon...
	// use comma to separate multiple variable and functions
	var student={
		name : "john"
		,
		age : 10
		,
		grade : 2
		,
		learn : function(  ){
			console.log("attending class");
		}
		,
		teach : function(  ){
			console.log("teaching class");
		}
		
	};
	
	student.name;
	student.learn();
	//alert("hi how are you");
	return 1;
	
}
controlFlow();
function controlFlow(){
	console.log("inside control flow");
	try{
		var z=10/2;
		
	}catch(err){
		console.log("error occured");
	}
	finally{
		console.log("done with try catch finally");
	}
	
	
	var a=10;
	var b=20;
	var c=20;
	var d=20;
	// false  or   true = true
	if(a==b   ||   c==d )
		console.log(" they are same");
	else
		console.log(" they are different");
	
	for ( var x=0 ; x < 5 ; x ++){
		console.log("hi");
	}
	
	while(false){
		console.log("hi")
	}
	
	do{
		console.log("hi")
	}while(false);
	
	var y=2;
	switch(y){
		case 1:
			console.log("hi");
			break;
		case 2:
			console.log("bye");
			break;
	}
}


function checkUser() {
	var ajaxJavascriptObject={
        url: '/checkUser',
        type: 'post',
        data: 'userid='+$("#uid").val(),
        context: this,
        success: function (data) {
               if(data=="unavailable")
		       alert("userid already taken");
        },
        error: function (data) {
                  console.log("failure");
        }
    };
    $.ajax(ajaxJavascriptObject);
}





function checkUser(){
	// val() = reading customer typed value in uid text box
	var userTypedValue=	$('#user').val();
	
	if( userTypedValue == "" ){
		// val( input ) = write message in uid text box
		$('#user').val("please enter userid");
	}
	else if( userTypedValue=="john" || userTypedValue=="jane")
	{
		//alert("userid already taken");
		//document.getElementById('user').style="background:red";
		$("#user").css("background","red");
		$("#registerButton").slideUp( 5000 ); // 5000 milli sec=5 sec
	}
	else{ // mike
		$("#registerButton").slideDown( 5000 );
		//document.getElementById('user').style="background:white";
		$("#user").css("background","white");
	}	

}

// change background color of userid text box to yellow
// when someone clicks on userid text box

//event listeners are tracked in ready function
$(document).ready(function() {
//	$("#userid").click( changeColor );
//	$("#userid").blur( isUseridTyped );
	//$("#userid").keypress( useridTyping );
	//$("#password").click(checkUserid);
});
function isUseridTyped (){
	var cusTyped=$("#userid").val();
	if(cusTyped == "")
		$("#reg").slideUp(5000); // 5000 milli seconds = 5 seconds
	else
		$("#reg").slideDown(5000);
	
}
function useridTyping(){
	var cusTyped=$("#userid").val();
	console.log(cusTyped);
}
function changeColor(){
	$("#userid").css("background","green");
}
