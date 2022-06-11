

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Footer</title>
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <meta name="viewport" content="width=device-width,height=device-height,user-scalable=yes, initial-scale=1, minimum-scale=1.0, maximum-scale=3.0" >
        <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
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
        <script>
            $(function ()
            {
                $("#slider1").responsiveSlides
                        ({
                            auto: true,
                            speed: 100,
                            namespace: "callbacks",
                            pager: true,
                        });
            });
        </script>
        <script>
            $(document).ready(function (c)
            {
                $('.alert-close').on('click', function (c)
                {
                    $('.message').fadeOut('slow', function (c)
                    {
                        $('.message').remove();
                    });
                });
            });
        </script>
        <script>
            $(document).ready(function (c)
            {
                $('.alert-close1').on('click', function (c)
                {
                    $('.message1').fadeOut('slow', function (c)
                    {
                        $('.message1').remove();
                    });
                });
            });
        </script>
    </head>
    <body>
        <div class="footer" style="background: rgba(0,0,0,0.4);">
            <div class="footer-middle" style="background: rgba(0,0,0,0.4);">
                <div class="container">
                    <div class="footer-middle-in">
                        <h6>Trụ Sở</h6>
                        <p>Công ty Cổ phần Đầu tư và Công nghệ HieuHoaKiet,Đà Nẵng K108 Nguyễn Chánh,Phường Hòa Minh,Quận Liên Chiểu,TP. Đà Nẵng.
                            Điện thoại: 0934754627 Hoặc 01216309942,Hà Tuấn Kiệt
                        </p>
                    </div>
                    <div class="footer-middle-in">
                        <h6>Thông Tin Chúng Tôi</h6>
                        <p>
                            Giấy ĐKKD số: 0104630479 Do Sở Kế hoạch và Đầu tư Thành phố Đà Nẵng cấp lần đầu ngày 12/09/2018 
                            Giấy phép ICP số 3399/GP-STTTT do Sở Thông tin và Truyền thông Đà Nẵng cấp ngày 4 tháng 9 năm 2018. 
                        </p>
                    </div>
                    <div class="footer-middle-in">
                        <h6>Dịch Vụ CSKH</h6>
                        <p>
                            Tổng đài CSKH: 1900 1881
                        </p>
                        <p>
                            Email: hotro@batdongsandanang.com.vn | cskh@batdongsandanang.com.vn
                        </p>
                    </div>
                    <div class="footer-middle-in">
                        <h6>Chịu trách nhiệm nội dung: </h6>
                        <p>
                            Mít Tờ Hiếu -Hà Tuấn Kiệt-Huỳnh Đức Hóa.
                        </p>
                    </div>
                    <div class="clearfix"></div>
                </div>
            </div>
            <p class="footer-class" style="background: rgba(0,0,0,0.4);"><a href="index.jsp" target="_blank"></a>Doanh Nghiệp Bất Động Sản <strong>DTU</strong></p>
            <script type="text/javascript">
                $(document).ready(function ()
                {
                    $().UItoTop({easingType: 'easeOutQuart'});
                });
            </script>
            <a href="#" id="toTop" style="display: block;background:url(images/up.png) no-repeat"> <span id="toTopHover" style="opacity: 1;"> </span></a>

        </div>
    </body>
</html>
