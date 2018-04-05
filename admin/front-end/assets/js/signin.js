function SignIn(){
	var login =document.getElementById("login").value;
	var password=document.getElementById("password").value;
	if (login.length==0) {
		alert("введите логин");
		return;
	}
	if (password.length==0) {
		alert("введите password");
		return;
	}
	$.ajax({
		url:"localhost:8000/signin", type:"POST", data:JSON.stringify({login:login, password:password}),
		success:function(data){
			console.log(data);

		}, 
		error:function(err){
			console.log(err);

		}
	})
}