function checkUser(){
	//var userTypedValue=	document.getElementById('user').value;
	
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

$(document).ready(function() {
//	$("#user").blur(checkUser);
});

test();
function   test( ){
	
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
	//alert("hi how are you");
	return 1;
	
}
