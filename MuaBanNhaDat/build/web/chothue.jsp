<%-- 
    Document   : chothue
    Created on : Dec 17, 2018, 7:38:49 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
        <script src="js/jquery.min.js"></script>
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />

        <link rel="stylesheet" type="text/css" media="all" href="csschothue/general.css" />
        <link rel="stylesheet" type="text/css" media="all" href="csschothue/style.min.css" />
        <link rel="stylesheet" type="text/css" media="all" href="csschothue/post.css" />
        <link rel="stylesheet" type="text/css" media="all" href="csschothue/basis.css" />



        <meta name="viewport" content="width=device-width,height=device-height,user-scalable=yes, initial-scale=1, minimum-scale=1.0, maximum-scale=3.0" >
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
        <script type="text/javascript" src="js/move-top.js"></script>
        <script type="text/javascript" src="js/easing.js"></script>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.2/css/all.css" />
        <script type="text/javascript">
            jQuery(document).ready(function ($)
            {
                $(".scroll").click(function (event)
                {
                    event.preventDefault();
                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
                });
            });
        </script>
        <!--slider-script-->
        <script src="js/responsiveslides.min.js"></script>
        <script>
            $(function ()
            {
                $("#slider1").responsiveSlides({
                    auto: true,
                    speed: 100,
                    namespace: "callbacks",
                    pager: true,
                });
            });
        </script>
        <!--//slider-script-->
        <script>$(document).ready(function (c)
            {
                $('.alert-close').on('click', function (c) {
                    $('.message').fadeOut('slow', function (c) {
                        $('.message').remove();
                    });
                });
            });
        </script>
        <script>
            $(document).ready(function (c) {
                $('.alert-close1').on('click', function (c) {
                    $('.message1').fadeOut('slow', function (c) {
                        $('.message1').remove();
                    });
                });
            });
        </script>
        <style>
            label
            {
                color:white;
            }
            #btnHuyPost:hover , input[type=submit]:hover
            {
                color:aqua;
                background:rgba(0,0,0,0.7);
            }
        </style>
    </head>
    <body style="background:url(video/bann.jpg) fixed">
        <jsp:include page="header.jsp"></jsp:include>

            <link href="/Styles/JqueryFileUpload/Default/jquery.fileupload-ui.css" rel="stylesheet" type="text/css" />
            <form action="ChoThue" method="post" enctype="multipart/form-data">
                <div id="wrapper" class="">
                    <div class="main set-relative">
                        <div class="row clearfix ">
                            <div class="col-gr-100per">
                                <div id="MainContent_PostNews1_pnDangtin">

                                    <div class="post-title">
                                        <h4 class="title text-uppercase fweight-bold" style="color:white;background:rgba(0,0,0,0.4)" >Th??ng tin c?? b???n
                                        </h4>
                                    </div>
                                    <div class="post-field">
                                        <label class="first" style="color:white;">Lo???i nh?? ?????t (<span class="red-clr">*</span>)</label>
                                        <div class="post-field-option set-relative">
                                            <select name="loainhadat" class="form-control" style="background:rgba(0,0,0,0.4);color:white;" >
                                                <option >Ch???n Lo???i nh?? ?????t</option>
                                                <option value="1">+Cho thu?? c??n h??? chung c??</option>
                                                <option value="2">+Cho thu?? nh?? ri??ng</option>
                                                <option value="3">+Cho thu?? nh?? m???t ph???</option>
                                                <option value="4">+Cho thu?? nh?? tr???,ph??ng tr???</option>
                                                <option value="5">+Cho thu?? v??n ph??ng </option>
                                                <option value="6">+Cho thu?? c???a h??ng,ki ???t</option>
                                                <option value="7">+Cho thu?? nh?? kho</option>
                                                <option value="8">+Cho thu?? nh?? x?????ng,?????t</option>
                                            </select>
                                            <span style="color: red; position: absolute; line-height: 40px; left: 0; top: 30px; display: none;" id="spanLoainhadat">B???n c???n nh???p lo???i nh?? ?????t</span>
                                        </div>
                                    </div>

                                    <div class="post-field mg-top-0" style="padding-top: 25px;">
                                        <label class="first" >Gi??</label>
                                        <input name="gia" type="text" id="txtDiadiem" class="form-control" style="width:210px;background:rgba(0,0,0,0.4)"  />
                                    </div>
                                    <div class="post-field mg-top-0" style="padding-top: 25px;">
                                        <label class="first" >Di???n T??ch(m<sup>2</sup>)</label>
                                        <input name="dientich" type="text" id="txtDiadiem" class="form-control" style="width:210px;background:rgba(0,0,0,0.4)" />
                                    </div>

                                    <div class="post-field">
                                        <label class="first">?????a ??i???m (<span class="red-clr">*</span>)</label>
                                        <div class="post-field-option">
                                            <input name="diadiem" style="background:rgba(0,0,0,0.4)" type="text" id="txtDiadiem" class="form-control" />
                                        </div>
                                    </div>
                                    <div class="clearfix"></div>
                                    <div style="background:rgba(0,0,0,0.4);color:white;padding:26px;margin-top:30px;">
                                        <h4>TH??NG TIN KH??C</h4>
                                    </div>
                                    <div class="post-field huongnha">
                                        <label class="first  pull-left" >M???t ti???n (m<sup>2</sup>)</label>
                                        <div class="post-field-option">
                                            <input name="matien" type="text" maxlength="6" id="txtMattien" style="background: rgba(0,0,0,0.4)" class="form-control w-230  pull-left" />
                                            <label class="mg-left-40 mg-right-5  pull-left" >???????ng tr?????c nh?? (m<sup>2</sup>)</label>
                                            <input name="duongtruocnha" type="text" maxlength="6" id="txtDuongtruocnha" class="form-control w-230  pull-left" style="background: rgba(0,0,0,0.4)" />
                                            <label class="mg-left-40 mg-right-5 pull-left">H?????ng nh??</label>
                                            <select name="huongnha" style="color:white; background: rgba(0,0,0,0.4)" id="cboDirectionPost" class="form-control w-230 mg-right-0">
                                                <option>Kh??ng X??c ?????nh</option>
                                                <option value="1">????ng </option>
                                                <option value="2">T??y </option>
                                                <option value="3">Nam </option>
                                                <option value="4">B???c </option>
                                                <option value="5">????ng-B???c</option>
                                                <option value="6">T??y-B???c</option>
                                                <option value="7">T??y-Nam</option>
                                                <option value="8">????ng-Nam</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="post-field huongnha">
                                        <label class="first  pull-left">S??? t???ng</label>
                                        <div class="post-field-option">
                                            <input name="sotang" type="text" maxlength="1" id="txtMattien" class="form-control w-230  pull-left" style="margin-right: 75px;background: rgba(0,0,0,0.4)" />
                                            <label class="mg-left-40 mg-right-5  pull-left">S??? ph??ng</label>

                                            <input name="sophong" type="text" maxlength="2" id="txtDuongtruocnha" class="form-control w-230  pull-left" style="margin-right: 18px;background: rgba(0,0,0,0.4)" />
                                            <label class="mg-left-40 mg-right-5 pull-left">S??? toilet</label>
                                            <input name="sotoilet" type="text" maxlength="2" id="txtDuongtruocnha" class="form-control w-230  pull-left" style="background: rgba(0,0,0,0.4)" />
                                        </div>
                                    </div>

                                    <div class="clearfix"></div>
                                    <div style="background:rgba(0,0,0,0.4);color:white;padding:26px;margin-top:30px;">
                                        <h4>M?? T??? CHI TI???T</h4>
                                    </div>

                                    <div class="post-field mg-bottom-20">
                                        <label class="first">Ti??u ????? (<span class="red-clr">*</span>)</label>
                                        <div class="post-field-option">
                                            <input name="tieude" style="background:rgba(0,0,0,0.4)" type="text" maxlength="150" id="txtTieude" class="form-control" />
                                            <span style="color: Red; display: none; margin-top: 2px; float: left;" id="spanTieude">B???n c???n nh???p ti??u ?????</span>
                                            <span style="color: Red; display: none; margin-top: 2px; float: left;" id="spanLimit">Ti??u ????? ph???i nh???p ??t nh???t 5 ch???!</span>
                                            <span style="color: Red; display: none; margin-top: 2px; float: left;" id="spanMaxCharacter">Ti??u ????? kh??ng ???????c nh???p qu?? 150 k?? t???!</span>
                                        </div>
                                    </div>
                                    <div class="post-field set-relative mg-top-0">
                                        <label class="first">
                                            <span style="letter-spacing: -0.5px">N???i dung m?? t???</span> (<span class="red-clr">*</span>)
                                            <br />
                                            <span class="note" >L??u ??: t???i ??a ch??? 3000 k?? t???</span>
                                        </label>
                                        <div id="boxarea" class="post-field-option">
                                            <textarea name="mota" style="background:rgba(0,0,0,0.4)" id="tarNoidung" cols="60" rows="5" maxlength="3000" class="form-control" style="padding: 8px 15px 25px;"></textarea>
                                            <span style="color: Red; display: none;" id="spanNoidungmota">N???i dung kh??ng ???????c b??? tr???ng!</span>
                                            <span style="color: Red; display: none;" id="spanLimited">N???i dung ph???i l???n h??n 100 k?? t???!</span>
                                            <div id="tarNoidung_counter" class="counter-noidung" style="background:rgba(0,0,0,0.4);color:white;">
                                                1/3000 k?? t???
                                            </div>
                                        </div>
                                    </div>
                                    <div class="post-field" style="min-height:inherit;">
                                        <label>????ng t???i h??nh ???nh(*)</label>
                                    </div>
                                    <div class="post-field">
                                        <input name="hinhanh" type="file" style="width:264px;height:40px;border:1px solid white;padding-top: 7px;border-radius: 4px;" multiple />
                                    </div>
                                    
                                    <div class="clearfix"></div>
                                    <div style="background:rgba(0,0,0,0.4);color:white;padding:26px;margin-top:30px;">
                                        <h4>TH??NG TIN LI??N H???</h4>
                                    </div>

                                    <div class="post-field mg-bottom-20">
                                        <label class="first">H??? t??n (<span class="red-clr">*</span>)</label>
                                        <div class="post-field-option">
                                            <input name="hoten" type="text" id="txtHovaten" class="form-control w-390" style="background:rgba(0,0,0,0.4)" />
                                        </div>
                                    </div>
                                    <div class="post-field mg-bottom-20">
                                        <label class="first">?????a Ch??? (<span class="red-clr">*</span>)</label>
                                        <div class="post-field-option">
                                            <input name="diachi" type="text" id="txtHovaten" class="form-control w-390" style="background:rgba(0,0,0,0.4)" />
                                        </div>
                                    </div>
                                    <div class="post-field mg-bottom-20">
                                        <label class="first">??i???n Tho???i (<span class="red-clr">*</span>)</label>
                                        <div class="post-field-option">
                                            <input name="dienthoai" type="text" id="txtHovaten" class="form-control w-390" style="background:rgba(0,0,0,0.4)" />
                                        </div>
                                    </div>
                                    <div class="post-field mg-bottom-20">
                                        <label class="first">Email (<span class="red-clr">*</span>)</label>
                                        <div class="post-field-option">
                                            <input name="email" type="text" id="txtHovaten" class="form-control w-390" style="background:rgba(0,0,0,0.4)" />
                                        </div>
                                    </div>
                                    <div class="clear"></div>
                                    <div >
                                        <span>
                                            <input type="submit" style="font-size: 30px;width: 166px;border: 1px solid white;border-radius: 5px;background: rgba(0,0,0,0.4);color: white;"  value="????ng Tin">
                                        </span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </form>
            <script type="text/javascript">

                $(function ()
                {
                    $('#btnHuyPost').click(function () {
                        if (confirm("B???n c?? ch???c ch???n mu???n h???y ?"))
                        {
                            location.reload(true);
                        }
                    })
                })
            </script>




        <jsp:include page="footer.jsp"></jsp:include>

    </body>
</html>
