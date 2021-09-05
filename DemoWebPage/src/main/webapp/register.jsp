<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<meta name="description" content="Food Ordering Aplication">
	<meta name="author" content="Dev Gurlivleen Singh Kainth">
	<title>Food Ordering WebApp</title>

	<!-- Bootstrap Cdn -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet">
	<!-- Fonts -->
	<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet">
	<!-- Icons Cdn -->
	<link href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500&display=swap" rel="stylesheet">
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

	<!-- <link href="css/style.css" rel="stylesheet" type="text/css"> -->
	<style>
		body {
			height: 100vh;
			display: flex;
			align-items: center;
			justify-content: center;
		}

		.input-group-text {
			border-top-right-radius: 0;
			border-bottom-right-radius: 0;
		}

		.input-group-text i {
			width: 2rem;
			font-size: 24px;
		}

		.img-shadow {
			filter: drop-shadow(6px 6px 12px #a0a0a0);
		}
	</style>
</head>

<body class="bg-light">
	
	<%! String password, email, name; %>
	
	<%
		System.out.print("Url: ");
		String[] urlParams = request.getRequestURI().split("/");
		boolean disabled = false;
		
		try {
			name = request.getParameter("name") == null ? "" : request.getParameter("name");
			password = request.getParameter("password") == null ? "" : request.getParameter("password");
			email = request.getParameter("email") == null ? "" : request.getParameter("email");
		} catch(NullPointerException e) {
			password = "";
			email = "";
			name = "";
		}
	%>

	<div class="container-fluid">
		<div class="row w-100 m-0">
			<div class="col-12 col-sm-7">
				<div class="card border-0 bg-light">
					<img src="${pageContext.request.contextPath}/img/register.svg" alt="" class="card-img-top img-shadow"
						height="512px" width="512px">
				</div>
			</div>
			<div class="col-12 col-sm-4">
				<div class="card shadow">
					<div class="card-header bg-white">
						<div class="d-flex flex-column justify-content-center align-items-center">
							<h3 class="mb-1">FOAS</h3>
							<h5 class="text-sm text-muted mb-0">Register</h5>
						</div>
					</div>
					<div class="card-body p-4 mt-4">
						<form action="register" method="post">
							<div class="form-group mb-3">
								<div class="input-group input-group-alternative">
									<div class="input-group-prepend">
										<span class="input-group-text"><i class="fa fa-user"></i></span>
									</div>
									<input class="form-control" placeholder="Name" type="text" name="name" value="<%= name %>">
								</div>
							</div>
							<div class="form-group mb-3">
								<div class="input-group input-group-alternative">
									<div class="input-group-prepend">
										<span class="input-group-text"><i class="fa fa-envelope"></i></span>
									</div>
									<input class="form-control" placeholder="Email" type="text" name="email" value="<%= email %>">
								</div>
							</div>
							<div class="form-group">
								<div class="input-group input-group-alternative">
									<div class="input-group-prepend">
										<span class="input-group-text"><i class="fa fa-key"></i></span>
									</div>
									<input class="form-control" placeholder="Password" type="password"
										name="password" value="<%= password %>">
								</div>
							</div>

							<div class="${message.alertClass} text-center mt-2" role="alert">
								<small>${message.message}</small>
							</div>
							<div class="d-flex justify-content-between align-items-center"
								style="margin-top: 9em;">
								<a type="button" href="${pageContext.request.contextPath}/login.jsp" class="btn btn-secondary">Sign In instead</a>
								<button type="submit" class="btn btn-primary">
									Sign Up
								</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.min.js"></script>
</body>

</html>