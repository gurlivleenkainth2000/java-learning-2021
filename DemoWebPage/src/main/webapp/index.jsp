<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<meta charset="utf-8">
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

    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">FOAS</a>
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
				data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item">
						<a class="nav-link active" aria-current="page" href="#">Home</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="#">Map</a>
					</li>
					<!-- <li class="nav-item dropdown">
				<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
				  Dropdown
				</a>
				<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
				  <li><a class="dropdown-item" href="#">Action</a></li>
				  <li><a class="dropdown-item" href="#">Another action</a></li>
				  <li><hr class="dropdown-divider"></li>
				  <li><a class="dropdown-item" href="#">Something else here</a></li>
				</ul>
			  </li> -->
				</ul>
				<div class="d-grid gap-2 d-md-block">
					<a href='${pageContext.request.contextPath}/login.jsp' class="btn btn-sm btn-primary mx-2" type="button">Log In</a>
					<a href="${pageContext.request.contextPath}/register.jsp" class="btn btn-sm btn-primary" type="button">Register</a>
				</div>
			</div>
		</div>
	</nav>

	<div class="container-fluid mt-4 mb-4">
		<div class="container">
			<div class="row">
				<div class="col-4">
					<div class="card">
						<img src="https://b.zmtcdn.com/data/pictures/0/18784840/1ddf698189cd8bace800a3d9ef51c51a_o2_featured_v2.jpg" alt="" loading="lazy" class="card-img-top img-rounded">
						<div class="card-body">
							<div class="row">
								<div class="col-12">
									<div class="d-flex justify-content-between align-items-center">
										<h6>The Table By Basant</h6>
										<h6><span class="badge bg-success">4.2 <i class="fa fa-star text-white"></i></span></h6>
									</div>
								</div>
								<div class="col-12">
									<d class="d-flex justify-content-between align-items-center">
										<p class="text-sm text-muted text-limit">North Indian, Pizza, Fast Food, Burger, Sandwich, Rolls</p>
										<p class="text-sm text-muted"><strong>&#8377; 250</strong></p>
									</d>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-4">
					<div class="card">
						<img src="https://b.zmtcdn.com/data/pictures/8/15008/b986a2b6ec6254c8d53a59c18191dfd8_o2_featured_v2.jpg" alt="" loading="lazy" class="card-img-top img-rounded">
						<div class="card-body">
							<div class="row">
								<div class="col-12">
									<div class="d-flex justify-content-between align-items-center">
										<h6>Hot Breads</h6>
										<h6><span class="badge bg-success">4.3 <i class="fa fa-star text-white"></i></span></h6>
									</div>
								</div>
								<div class="col-12">
									<d class="d-flex justify-content-between align-items-center">
										<p class="text-sm text-muted text-limit">Continental, Chinese, Italian, Bakery,
											Fast Food, Beverages, Desserts</p>
										<p class="text-sm text-muted"><strong>&#8377; 250</strong></p>
									</d>
									
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-4">
					<div class="card">
						<img src="https://b.zmtcdn.com/data/pictures/4/18680874/ddf9ecea94b89cb163d901b50b7fad85_o2_featured_v2.jpg" alt="" loading="lazy" class="card-img-top img-rounded">
						<div class="card-body">
							<div class="row">
								<div class="col-12">
									<div class="d-flex justify-content-between align-items-center">
										<h6>Natural 2</h6>
										<h6><span class="badge bg-success">4.3 <i class="fa fa-star text-white"></i></span></h6>
									</div>
								</div>
								<div class="col-12">
									<d class="d-flex justify-content-between align-items-center">
										<p class="text-sm text-muted text-limit">North Indian, Pizza, Fast Food, Burger, Sandwich, Rolls</p>
										<p class="text-sm text-muted"><strong>&#8377; 300</strong></p>
									</d>
									
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-4">
					<div class="card">
						<img src="https://b.zmtcdn.com/data/pictures/chains/3/18901253/d7cccea2b17ae12c75ee0a3c08425d14_o2_featured_v2.jpg" alt="" loading="lazy" class="card-img-top img-rounded">
						<div class="card-body">
							<div class="row">
								<div class="col-12">
									<div class="d-flex justify-content-between align-items-center">
										<h6>New New York Pizzeria</h6>
										<h6><span class="badge bg-success">4.2 <i class="fa fa-star text-white"></i></span></h6>
									</div>
								</div>
								<div class="col-12">
									<d class="d-flex justify-content-between align-items-center">
										<p class="text-sm text-muted text-limit">Pizza, Burger, Sandwich, Wraps, Fast Food, Beverages</p>
										<p class="text-sm text-muted"><strong>&#8377; 150</strong></p>
									</d>
									
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-4">
					<div class="card">
						<img src="https://b.zmtcdn.com/data/pictures/9/15639/1f005410d033d2d1e421e46df931a064_o2_featured_v2.jpg" alt="" loading="lazy" class="card-img-top img-rounded">
						<div class="card-body">
							<div class="row">
								<div class="col-12">
									<div class="d-flex justify-content-between align-items-center">
										<h6>Rishi Vegetarian Dhaba (RVN)</h6>
										<h6><span class="badge bg-success">3.8 <i class="fa fa-star text-white"></i></span></h6>
									</div>
								</div>
								<div class="col-12">
									<d class="d-flex justify-content-between align-items-center">
										<p class="text-sm text-muted text-limit">North Indian</p>
										<p class="text-sm text-muted"><strong>&#8377; 100</strong></p>
									</d>
									
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-4">
					<div class="card">
						<img src="https://b.zmtcdn.com/data/pictures/chains/0/15090/75d199829038cdcd50e25bf3f43bc5eb_o2_featured_v2.jpg" alt="" loading="lazy" class="card-img-top img-rounded">
						<div class="card-body">
							<div class="row">
								<div class="col-12">
									<div class="d-flex justify-content-between align-items-center">
										<h6>Subway</h6>
										<h6><span class="badge bg-success">4.2 <i class="fa fa-star text-white"></i></span></h6>
									</div>
								</div>
								<div class="col-12">
									<d class="d-flex justify-content-between align-items-center">
										<p class="text-sm text-muted text-limit">Healthy Food, Sandwich, Salad, Wraps, Fast Food</p>
										<p class="text-sm text-muted"><strong>&#8377; 150</strong></p>
									</d>
									
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-4">
					<div class="card">
						<img src="https://b.zmtcdn.com/data/pictures/7/18422227/7c18a730c27f730444b0c332e037ba31_o2_featured_v2.jpg" alt="" loading="lazy" class="card-img-top img-rounded">
						<div class="card-body">
							<div class="row">
								<div class="col-12">
									<div class="d-flex justify-content-between align-items-center">
										<h6>Ice Cream Studio</h6>
										<h6><span class="badge bg-success">4.4 <i class="fa fa-star text-white"></i></span></h6>
									</div>
								</div>
								<div class="col-12">
									<d class="d-flex justify-content-between align-items-center">
										<p class="text-sm text-muted text-limit">Ice Cream, Desserts</p>
										<p class="text-sm text-muted"><strong>&#8377; 150</strong></p>
									</d>
									
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- <div class="row">
			<div class="col-3 d-none d-md-block"></div>
			<div class="col-12 col-md-6">
				
			</div>
			<div class="col-3 d-none d-md-block"></div>
		</div> -->
	</div>

	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.min.js"></script>
</body>
</html>