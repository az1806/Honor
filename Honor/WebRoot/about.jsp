<%@page import="com.entity.GongSi"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
List<GongSi> gs=(List<GongSi>)request.getAttribute("list");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="zh-cn">
<head>
    <title>某某家具设计公司企业官网-模板之家</title>
    ﻿<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="format-detection" content="telephone=no">
<meta name="renderer" content="webkit">
<meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="alternate icon" type="image/png" href="images/favicon.png">
<link rel='icon' href='favicon.ico' type='image/x-ico' />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" href="css/default.min.css?t=227" />
<!--[if (gte IE 9)|!(IE)]><!-->
<script type="text/javascript" src="lib/jquery/jquery.min.js"></script>
<!--<![endif]-->
<!--[if lte IE 8 ]>
<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="lib/amazeui/amazeui.ie8polyfill.min.js"></script>
<![endif]-->
<script type="text/javascript" src="lib/handlebars/handlebars.min.js"></script>
<script type="text/javascript" src="lib/iscroll/iscroll-probe.js"></script>
<script type="text/javascript" src="lib/amazeui/amazeui.min.js"></script>
<script type="text/javascript" src="lib/raty/jquery.raty.js"></script>
<script type="text/javascript" src="js/main.min.js?t=1"></script>
</head>
<body>
<header>
    <div class="header-top">
        <div class="width-center">
            <div class="header-logo "><img src="images/logo.png" alt=""></div>
            <div class="header-title div-inline">
                <strong>某某家具设计公司</strong>
                <span>www.cssmoban.com</span>
            </div>

            <div class="search-box div-inline">
                <div class="input-box"><input type="text" name="" placeholder="             请输入关键字"></div>
                <div class="search-botton"></div>
            </div>
        </div>
    </div>
    <div class="header-nav">
        <button class="am-show-sm-only am-collapsed font f-btn" data-am-collapse="{target: '.header-nav'}">Menu <i
                class="am-icon-bars"></i></button>
        <nav>
        <ul class="header-nav-ul am-collapse am-in">
            <li class="on"><a href="index.html" name="index">首页</a></li>
            <li><a href="about.html" name="about">关于我们</a></li>
            <li><a href="productlist.html" name="show">产品展示</a></li>
            <li><a href="article_list.html" name="new">新闻资讯</a></li>
            <li><a href="contact.html" name="message">联系我们</a>
                <div class="secondary-menu">

                    <ul><li><a href="message.html" class="message"></a></li></ul>
                </div>
            </li>
        </ul>




        </nav>
    </div>

</header>
<div class="am-slider am-slider-default" data-am-flexslider="{playAfterPaused: 8000}">
    <ul class="am-slides">
        <li><img src="./images/banner2.jpg" alt="" ></li>
        <li><img src="./images/banner2.jpg" alt="" ></li>
        <li><img src="./images/banner2.jpg" alt="" ></li>
        <li><img src="./images/banner2.jpg" alt="" ></li>
    </ul>
</div>

<section class="about-section">
    <div>
        <span>
            <article>公司介绍</article>
            <h6>COMPANY INTRODUCTION</h6>
        </span>
        <span></span>
    </div>
    <div></div>
    <div class="about-content">
        <div class="about-image"> <img src="./images/banner3.jpg" alt=""></div>

        <article>
        <%for(int i=0;i<gs.size();i++) {%>
        <p><%= gs.get(i).getJieshao() %></p>
        <%} %>
        </article>


    </div>

    <div class="about-box">
        <div class="about-leftbox">
            <img src="images/banner4.jpg" alt="">
        </div>
        <div class="about-rightbox">
            <h1>企业文化</h1>
            <p>CORPORATE CULTURE</p>
            <article>我们的家居一直秉承绿色的核心理念，以“贴近生活、用心服务、用爱做事”为企业核心文化价值。所有家具确保以最环保、安全、绿色为基础色调和核心基因，全心全意为您打造一个安全的、贴心的、精致的生活空间，环保、安全、精致不仅是对产品的用心打造，更是对员工、事业伙伴、用户、社会的责任和担当。</article>
        </div>
    </div>

    <div class="about-team">
        <div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
            <p >设计团队</p>
            <span>DESIGN TEAM</span>
        </div>
        <div class="about-team-headimg">
        <div class="am-u-sm-12 am-u-md-6 am-u-lg-3">
            <img src="images/team1.png" alt="">
            <p>史密斯KIM</p>
            <span>首席金牌设计师</span>
        </div>
        <div class="am-u-sm-12 am-u-md-6 am-u-lg-3">
            <img src="images/team2.png" alt="">
            <p>刘凯丽</p>
            <span>首席金牌设计师</span>
        </div>
        <div class="am-u-sm-12 am-u-md-6 am-u-lg-3">
            <img src="images/team3.png" alt="">
            <p>小李子</p>
            <span>首席金牌设计师</span>
        </div>
        <div class="am-u-sm-12 am-u-md-6 am-u-lg-3">
            <img src="images/team4.png" alt="">
            <p>Lisa</p>
            <span>首席金牌设计师</span>
        </div>
        </div>
        <div class="about-slogan">
            <div>
            <p></p>
            </div>
        </div>
    </div>
</section>


﻿<footer>
    <div>
        <div class="footer-info">
            <div class="footer-content">
                <img src="images/qccode.png" alt="">
               <div>
                <p>招商热线:0714-8868331</p>
                <div class="footer-box">
                    <i class="icon-tel"></i>
                    <span>公司电话:</span>
                    <span>0714-8868331</span>
                </div>
                <div class="footer-box">
                    <i class="icon-email"></i>
                    <span>公司邮箱:</span>
                    <span>123@dayeyunalading.com</span>
                </div>
                <div class="footer-box">
                    <i class="icon-address"></i>
                    <span>公司地址:</span>
                    <span>湖北省XXX市XXX大道小区B栋201</span>
                </div>
               </div>
            </div>
        </div>
        <style>
        .footer-bottom a{color:#F1404B}
        </style>
        <div class="footer-bottom"><div style="text-align:center;color:#fff;line-height:100px;"><span><a href="http://www.haothemes.com/" target="_blank" title="好主题">好主题</a>提供 - More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></span></div></div>
    </div>
</footer>
</body>
</html>