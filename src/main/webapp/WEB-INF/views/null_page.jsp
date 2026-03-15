<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Error Page</title>

    <!-- Bootstrap 5 CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body{
            background:#f8f9fa;
            height:100vh;
            display:flex;
            align-items:center;
            justify-content:center;
        }
        .error-box{
            text-align:center;
        }
        .error-title{
            font-size:60px;
            font-weight:600;
            color:#333;
        }
        .error-sub{
            font-size:32px;
            font-weight:500;
            margin-bottom:15px;
        }
        .error-msg{
            color:#666;
            margin-bottom:25px;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="error-box">

        <h1 class="error-title">Oops! Sorry</h1>

        <h2 class="error-sub">Something went wrong !!</h2>

        <p class="error-msg">
            Sorry, an error has occured, Requested page not found!
        </p>

        <a href="index.jsp" class="btn btn-primary me-3">
            Take Me Home
        </a>

        <a href="contact.jsp" class="btn btn-outline-primary">
            Contact Support
        </a>

    </div>
</div>

</body>
</html>