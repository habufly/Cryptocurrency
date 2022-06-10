<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
            <c:set var="contextRoot" value="${pageContext.request.contextPath}" />
            <jsp:include page="../NavBar/CoinShellNavBar.jsp" />

            <head>
                <meta charset="UTF-8">
                <title>My Shell</title>
                <style type="text/css">
                    /* The side navigation menu */
                    
                    .sidebar {
                        margin: 0;
                        padding: 0;
                        width: 200px;
                        background-color: #f1f1f1;
                        position: fixed;
                        height: 100%;
                        overflow: auto;
                    }
                    /* Sidebar links */
                    
                    .sidebar a {
                        display: block;
                        color: black;
                        padding: 16px;
                        text-decoration: none;
                    }
                    /* Active/current link */
                    
                    .sidebar a.active {
                        background-color: #04AA6D;
                        color: white;
                    }
                    /* Links on mouse-over */
                    
                    .sidebar a:hover:not(.active) {
                        background-color: #555;
                        color: white;
                    }
                    /* Page content. The value of the margin-left property should match the value of the sidebar's width property */
                    
                    div.content {
                        margin-left: 200px;
                        padding: 1px 16px;
                        height: 1000px;
                    }
                    /* On screens that are less than 700px wide, make the sidebar into a topbar */
                    
                    @media screen and (max-width: 700px) {
                        .sidebar {
                            width: 100%;
                            height: auto;
                            position: relative;
                        }
                        .sidebar a {
                            float: left;
                        }
                        div.content {
                            margin-left: 0;
                        }
                    }
                    /* On screens that are less than 400px, display the bar vertically, instead of horizontally */
                    
                    @media screen and (max-width: 400px) {
                        .sidebar a {
                            text-align: center;
                            float: none;
                        }
                    }
                    
                    body {
                        padding-top: 82px;
                    }
                    
                    .buttonPic img {
                        /* 	position: absolute; */
                        border-style: none;
                        width: 200px;
                        height: 200px;
                        object-fit: cover;
                    }
                </style>

            </head>

            <body>

                <!-- side bar 側邊欄位 -->
                <div class="sidebar">
                    <a href="${contextRoot}/shop/myshell">My Shell</a>
                    <a href="${contextRoot}/shellshop">Shop</a>
                </div>


                <!--Page content-->
                <div class="container" style="margin-top: 30px; background-color: #fff; border-radius: 30px;">
                    <div class="col-9">

                        <!-- "簽到" 跳轉頁面 -->
                        <!-- <div> -->
                        <%-- <a href="OK?Id=${sessionScope.login.id}"><button>簽到</button></a> --%>
                            <!-- </div> -->


                            <!-- "圖片" 跳轉頁面 -->
                            <h1>Punch-In List</h1>
                            <div class="buttonPic">
                                <a href="OK?Id=${sessionScope.login.id}"><img src="https://i.pinimg.com/564x/07/6b/2d/076b2dd9557795ba4c215d23e7d09c6b.jpg" alt=""></a>
                            </div>


                    </div>
                </div>
                </div>


            </body>

            </style>