

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
                        <h6>Tr??? S???</h6>
                        <p>C??ng ty C??? ph???n ?????u t?? v?? C??ng ngh??? HieuHoaKiet,???? N???ng K108 Nguy???n Ch??nh,Ph?????ng H??a Minh,Qu???n Li??n Chi???u,TP. ???? N???ng.
                            ??i???n tho???i: 0934754627 Ho???c 01216309942,H?? Tu???n Ki???t
                        </p>
                    </div>
                    <div class="footer-middle-in">
                        <h6>Th??ng Tin Ch??ng T??i</h6>
                        <p>
                            Gi???y ??KKD s???: 0104630479 Do S??? K??? ho???ch v?? ?????u t?? Th??nh ph??? ???? N???ng c???p l???n ?????u ng??y 12/09/2018 
                            Gi???y ph??p ICP s??? 3399/GP-STTTT do S??? Th??ng tin v?? Truy???n th??ng ???? N???ng c???p ng??y 4 th??ng 9 n??m 2018. 
                        </p>
                    </div>
                    <div class="footer-middle-in">
                        <h6>D???ch V??? CSKH</h6>
                        <p>
                            T???ng ????i CSKH: 1900 1881
                        </p>
                        <p>
                            Email: hotro@batdongsandanang.com.vn | cskh@batdongsandanang.com.vn
                        </p>
                    </div>
                    <div class="footer-middle-in">
                        <h6>Ch???u tr??ch nhi???m n???i dung: </h6>
                        <p>
                            M??t T??? Hi???u -H?? Tu???n Ki???t-Hu???nh ?????c H??a.
                        </p>
                    </div>
                    <div class="clearfix"></div>
                </div>
            </div>
            <p class="footer-class" style="background: rgba(0,0,0,0.4);"><a href="index.jsp" target="_blank"></a>Doanh Nghi???p B???t ?????ng S???n <strong>DTU</strong></p>
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
