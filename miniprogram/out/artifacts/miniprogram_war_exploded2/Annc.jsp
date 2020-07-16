<!--<%@ page language="java" contentType="text/html; charset=UTF-8"
             pageEncoding="UTF-8"%>-->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <!-- basic -->

    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- mobile metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="initial-scale=1, maximum-scale=1">
    <!-- site metas -->
    <title>公司公告</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">

    <script type="text/javascript" src="${APP_PATH}/static/js/jquery-3.0.0.min.js"></script>

    <link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js" type=""></script>

    <!-- bootstrap css -->
    <link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/bootstrap.min.css">
    <!-- style css -->
    <link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/style.css">
    <!-- Responsive-->
    <link rel="stylesheet" href="${APP_PATH}/static/css/responsive.css">
    <!-- fevicon -->
    <%--<link rel="icon" href="static/images/fevicon.png" type="image/gif" />--%>
    <!-- Scrollbar Custom CSS -->
    <link rel="stylesheet" href="${APP_PATH}/static/css/jquery.mCustomScrollbar.min.css">
    <!-- Tweaks for older IEs-->
    <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
    <!-- fonts -->
    <link href="https://fonts.googleapis.com/css?family=Poppins:400,700|Righteous&display=swap" rel="stylesheet">
    <!-- owl stylesheets -->
    <link rel="stylesheet" href="${APP_PATH}/static/css/owl.carousel.min.css">
    <%--<link rel="stylesheet" href="static/css/owl.theme.default.min.css">--%>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" media="screen">
</head>
<body>
<!-- header section start -->
<div class="header_section">
    <div class="header_main">
        <div class="mobile_menu">
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <div class="logo_mobile"><a href="index.jsp"><img src="${APP_PATH}static/images/aode-logo.png" alt=""></a></div>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
            </nav>
        </div>
        <div class="container-fluid">
            <div class="logo"><a href="index.jsp"><img src="${APP_PATH}/static/images/aode-logo.png" alt=""></a></div>
            <div class="menu_main">
                <ul>
                    <li class="active"><a href="index.jsp">管理员首页</a></li>
                    <li><a href="AboutUs.jsp">关于我们</a></li>
                    <li><a href="Annc.jsp">公司公告</a></li>
                    <li><a href="Activities.jsp">活动页面</a></li>
                </ul>
            </div>
        </div>
    </div>
    <!-- banner section start -->
    <div class="banner_section layout_padding">
        <div id="carouselExampleSlidesOnly" class="carousel slide" data-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <div class="container">
                        <h1 class="banner_taital">公司公告</h1>
                        <p class="banner_text">There are many variations of passages of Lorem Ipsum available, but the majority have sufferedThere are ma available, but the majority have suffered</p>
                        <div class="read_bt"><a href="#">Get A Quote</a></div>
                    </div>
                </div>
                <div class="carousel-item">
                    <div class="container">
                        <h1 class="banner_taital">Adventure</h1>
                        <p class="banner_text">There are many variations of passages of Lorem Ipsum available, but the majority have sufferedThere are ma available, but the majority have suffered</p>
                        <div class="read_bt"><a href="#">Get A Quote</a></div>
                    </div>
                </div>
                <div class="carousel-item">
                    <div class="container">
                        <h1 class="banner_taital">Adventure</h1>
                        <p class="banner_text">There are many variations of passages of Lorem Ipsum available, but the majority have sufferedThere are ma available, but the majority have suffered</p>
                        <div class="read_bt"><a href="#">Get A Quote</a></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- banner section end -->
</div>
<!-- header section end -->
<!-- services section start -->
<div class="services_section layout_padding">
    <div class="container">
        <h1 class="services_taital">Services </h1>
        <p class="services_text">There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration</p>
        <div class="services_section_2">
            <div class="row">
                <div class="col-md-4">
                    <div><img src="${APP_PATH}/static/images/img-1.png" class="services_img" alt=""></div>
                    <div class="btn_main"><a href="#">Rafting</a></div>
                </div>
                <div class="col-md-4">
                    <div><img src="${APP_PATH}/static/images/img-2.png" class="services_img" alt=""></div>
                    <div class="btn_main active"><a href="#">Hiking</a></div>
                </div>
                <div class="col-md-4">
                    <div><img src="${APP_PATH}/static/images/img-3.png" class="services_img" alt=""></div>
                    <div class="btn_main"><a href="#">Camping</a></div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- services section end -->
<div class="tlinks">Collect from <a href="http://www.cssmoban.com/" >建站模板</a></div>
<!-- about section start -->
<div class="about_section layout_padding">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-6">
                <div class="about_taital_main">
                    <h1 class="about_taital">About Us</h1>
                    <p class="about_text">There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All </p>
                    <div class="readmore_bt"><a href="#">Read More</a></div>
                </div>
            </div>
            <div class="col-md-6 padding_right_0">
                <div><img src="${APP_PATH}/static/images/about-img.png" class="about_img" alt=""></div>
            </div>
        </div>
    </div>
</div>
<!-- about section end -->
<!-- blog section start -->
<div class="blog_section layout_padding">
    <div class="container">
        <h1 class="blog_taital">See Our  Video</h1>
        <p class="blog_text">many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which</p>
        <div class="play_icon_main">
            <div class="play_icon"><a href="#"><img src="${APP_PATH}/static/images/play-icon.png" alt=""></a></div>
        </div>
    </div>
</div>
<!-- blog section end -->
<!-- client section start -->
<div class="client_section layout_padding">
    <div class="container">
        <h1 class="client_taital">Testimonial</h1>
        <div class="client_section_2">
            <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <div class="client_main">
                            <div class="box_left">
                                <p class="lorem_text">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugia</p>
                            </div>
                            <div class="box_right">
                                <div class="client_taital_left">
                                    <div class="client_img"><img src="${APP_PATH}/static/images/client-img.png" alt=""></div>
                                    <div class="quick_icon"><img src="${APP_PATH}/static/images/quick-icon.png" alt=""></div>
                                </div>
                                <div class="client_taital_right">
                                    <h4 class="client_name">Dame</h4>
                                    <p class="customer_text">Customer</p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="client_main">
                            <div class="box_left">
                                <p class="lorem_text">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugia</p>
                            </div>
                            <div class="box_right">
                                <div class="client_taital_left">
                                    <div class="client_img"><img src="${APP_PATH}/static/images/client-img.png" alt=""></div>
                                    <div class="quick_icon"><img src="${APP_PATH}/static/images/quick-icon.png" alt=""></div>
                                </div>
                                <div class="client_taital_right">
                                    <h4 class="client_name">Dame</h4>
                                    <p class="customer_text">Customer</p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="client_main">
                            <div class="box_left">
                                <p class="lorem_text">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugia</p>
                            </div>
                            <div class="box_right">
                                <div class="client_taital_left">
                                    <div class="client_img"><img src="${APP_PATH}/static/images/client-img.png" alt=""></div>
                                    <div class="quick_icon"><img src="${APP_PATH}/static/images/quick-icon.png" alt=""></div>
                                </div>
                                <div class="client_taital_right">
                                    <h4 class="client_name">Dame</h4>
                                    <p class="customer_text">Customer</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- client section start -->
<!-- choose section start -->
<div class="choose_section layout_padding">
    <div class="container">
        <h1 class="choose_taital">Why Choose Us</h1>
        <p class="choose_text">There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All </p>
        <div class="read_bt_1"><a href="#">Read More</a></div>
        <div class="newsletter_box">
            <h1 class="let_text">Let Start Talk with Us</h1>
            <div class="getquote_bt"><a href="#">Get A Quote</a></div>
        </div>
    </div>
</div>
<!-- choose section end -->
<!-- footer section start -->
<div class="footer_section layout_padding">
    <div class="container">
        <div class="location_main">
            <div class="logo"><a href="index.jsp"><img src="${APP_PATH}/static/images/aode.img.jpg" alt=""></a></div>
            <div class="call_text"><img src="${APP_PATH}/static/images/mail-icon.png" alt=""></div>
            <div class="call_text"><a href="#">demo@aode.com</a></div>
        </div>
        <div class="social_icon">
            <ul>
                <li><a href="#"><img src="${APP_PATH}/static/images/fb-icon.png" alt=""></a></li>
                <li><a href="#"><img src="${APP_PATH}/static/images/twitter-icon.png" alt=""></a></li>
                <li><a href="#"><img src="${APP_PATH}/static/images/linkedin-icon.png" alt=""></a></li>
                <li><a href="#"><img src="${APP_PATH}/static/images/instagram-icon.png" alt=""></a></li>
            </ul>
        </div>
    </div>
</div>
<!-- footer section end -->
<!-- copyright section start -->
<div class="copyright_section">
    <div class="container">
        <p class="copyright_text"> 扫描上方二维码关注“广东东软奥德科技”公众号，随时随地获取最新消息 </p>
    </div>
</div>
<!-- copyright section end -->
<!-- Javascript files-->
<script src="${APP_PATH}/static/js/jquery.min.js" type=""></script>
<script src="${APP_PATH}/static/js/popper.min.js" type=""></script>
<script src="${APP_PATH}/static/js/bootstrap.bundle.min.js" type=""></script>
<script src="${APP_PATH}/static/js/jquery-3.0.0.min.js" type=""></script>
<script src="${APP_PATH}/static/js/plugin.js" type=""></script>
<!-- sidebar -->
<script src="${APP_PATH}/static/js/jquery.mCustomScrollbar.concat.min.js" type=""></script>
<script src="${APP_PATH}/static/js/custom.js" type=""></script>
<!-- javascript -->
<%--<script src="static/js/owl.carousel.js"></script>--%>
<script src="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js" type=""></script>
</body>
</html>