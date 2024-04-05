<!doctype html>
<html lang="ko">
	<head>
		<meta charset="utf-8" />

		<title>민속박물관</title>
		<meta id="ogTitle" property="og:title" content="민속박물관" />
		<meta property="og:description" content="" />
		<meta property="og:image" id="ogImage" content="http://adventure.lotteworld.com/common_mus/images/logo_sns.png" />
		<meta property="og:url" content="http://adventure.lotteworld.com/museum/main/index.do?" />

		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<meta name="viewport" content="width=device-width,initial-scale=1.0,user-scalable=no,maximum-scale=1.0,minimum-scale=1.0,target-densitydpi=medium-dpi" />
		<meta name="author" content="http://adventure.lotteworld.com" />
		<meta name="keywords" content="" />
		<meta name="description" content="" />
		<meta name="format-detection" content="telephone=no" />
		<meta property="og:type" content="article" />
		<meta property="og:site_name" content="민속박물관" />
		<link rel="shortcut icon" href="/common/images/favicon.ico" type="image/x-icon" />
		<link rel="icon" href="/common/images/favicon.ico" type="image/x-icon" />
		<link rel="stylesheet" href="/common_mus/css/swiper.min.css" />
		<link rel="stylesheet" href="/common_mus/css/mCustomScrollbar.css" />
		<link rel="stylesheet" href="/common_mus/css/mus_style.css" />
		<script type="text/javascript" src="/common_mus/js/jquery-1.8.2.min.js"></script>
		<script type="text/javascript" src="/common_mus/js/TweenMax.js"></script>
		<script type="text/javascript" src="/common_mus/js/placeholders.min.js"></script>
		<script type="text/javascript" src="/common_mus/js/swiper.min.js"></script>
		<script type="text/javascript" src="/common_mus/js/jquery.mCustomScrollbar.js"></script>
		<script type="text/javascript" src="/common_mus/js/jquery.touchFlow.js"></script>
		<script type="text/javascript" src="/common_mus/js/script.js"></script>
		<script type="text/javascript" src="/common/js/browser.js"></script>
		<script type="text/javascript" src="/common_mus/js/lib/jquery/jquery.cookies.js"></script>
		<script type="text/javascript" src="/common_mus/js/lib/ezValidation/jquery.ez.validation-1.3.4.js"></script>
		<script type="text/javascript" src="/common/js/kakao.min.js"></script>
		<script type='text/javascript' src="https://members.lpoint.com/api/js/serialize.object.js"></script>
		<script type='text/javascript' src="https://members.lpoint.com/api/js/json2.js"></script>
		<script type='text/javascript' src="https://members.lpoint.com/api/js/lotte.sso.api.js"></script>
		<script type="text/javascript" src="/common/js/sso_common.js?ver=20200313"></script>
		<!-- Google tag (gtag.js) --> <script async src="https://www.googletagmanager.com/gtag/js?id=G-LBXRTTGMK6"></script> <script> window.dataLayer = window.dataLayer || []; function gtag(){dataLayer.push(arguments);} gtag('js', new Date()); gtag('config', 'G-LBXRTTGMK6'); </script>

		<script type="text/javascript">
			$(document).ready(function(){
				//모바일이 아니고 IE가 9이하이고 오늘 하루값이 없을때 보여진다.
				//IEVerChk()
				var isChk = getCookie("browserUpgradePop");
				isChk = isChk == "" ? "true" : isChk;

				if(isChk == "true" && IEVerChk())
				{
					$(".blackBg").fadeIn(300);
					$("#browserUpContainer").fadeIn(300);
				}
				//브라우져 오늘 하루 닫기
				$("#browser_today_close").on("change", function(){
					var trgtId = jQuery(this).data("trgtId");
					if ( trgtId )
					{
						if ( jQuery(this).is(":checked") )
						{
							setCookie(trgtId, "false", 1);
						}
						else
						{
							setCookie(trgtId, "true", 1);
						}
					}
				});
			});
		</script>
		<!--[if lt IE 9]>
			<script type="text/javascript" src="/common/js/html5shiv.js"></script>
			<script type="text/javascript" src="/common/js/selectivizr.js"></script>
		<![endif]-->
	</head>
	<body data-drv-seq="270" data-device-type="web">
		<a href="#cBody" class="goCon" >본문바로가기</a>
		<div id="wrapper">
			<div id="util">
				<div class="container">
					<div class="right">
						<div class="links">
							<a href="http://adventure.lotteworld.com/kor/main/index.do" target="_blank" title="롯데월드 어드벤처 새창열기">롯데월드 어드벤처</a>
							<a href="http://adventure.lotteworld.com/icerink/main/index.do" target="_blank" title="아이스링크 새창열기">아이스링크</a>
						</div>
						<div class="login">
							<a href="https://adventure.lotteworld.com/museum/member/login/index.do">Login</a>
								</div>
					</div>
				</div>
			</div><!-- // util -->
			<div id="header">
				<div class="container">
					<h1><a href="/museum/main/index.do"><img src="/common_mus/images/logo.png" alt="롯데월드 민속박물관 로고" /></a></h1>
					<div class="gnbArea">
						<ul id="gnb" class="gnb">
							<li>
								<a href="javascript:" class="oneD" target="_self" >이용안내</a>
									<div class="twoD">
													<a class="" href="/museum/usage-guide/introduce/contentsid/535/index.do" target="_self" >
													박물관 소개</a>
												<div class="thrD">
												<!-- 이전 뎊스가 5이면 닫아준다. -->
													</div>
												<a class="" href="/museum/usage-guide/service/contentsid/539/index.do" target="_self" >
													관람안내</a>
												<div class="thrD">
												<!-- 이전 뎊스가 5이면 닫아준다. -->
													</div>
												<a class="" href="/museum/usage-guide/rental/contentsid/552/index.do" target="_self" >
													대관안내</a>
												<div class="thrD">
												<!-- 이전 뎊스가 5이면 닫아준다. -->
													</div>
												<a class="" href="/museum/usage-guide/location/index.do" target="_self" >
													오시는 길</a>
												<div class="thrD">
												<!-- 이전 뎊스가 5이면 닫아준다. -->
													</div>
												<a class="thrBt" href="javascript:" target="_self" >
													<span>
													부대시설</span>
													</a>
												<div class="thrD">
												<a href="/museum/usage-guide/convenience/contentsid/575/index.do" target="_self" >저자거리</a>
												<a href="/wedding/" target="_blank" >전통혼례</a>
												<a href="/museum/usage-guide/souvenir_shop/contentsid/592/index.do" target="_self" >민속기념품점</a>
												<!-- 이전 뎊스가 5이면 닫아준다. -->
															</div>
														</div>
												</li>
											<li>
								<a href="javascript:" class="oneD" target="_self" >전시</a>
									<div class="twoD">
													<a class="" href="/museum/gallery/permanent_exhibition/contentsid/597/index.do" target="_self" >
													상설전시</a>
												<div class="thrD">
												<!-- 이전 뎊스가 5이면 닫아준다. -->
													</div>
												<a class="" href="/museum/gallery/special/list.do" target="_self" >
													특별전시</a>
												<div class="thrD">
												</div>
												</li>
											<li>
								<a href="javascript:" class="oneD" target="_self" >교육프로그램</a>
									<div class="twoD">
													<a class="thrBt" href="javascript:" target="_self" >
													<span>
													역사교육</span>
													</a>
												<div class="thrD">
												<a href="/museum/edu-program/edu/list.do" target="_self" >프로그램</a>
												<!-- 이전 뎊스가 5이면 닫아준다. -->
													</div>
												<a class="" href="/museum/edu-program/craft/list.do" target="_self" >
													전통공예체험</a>
												<div class="thrD">
												</div>
												</li>
											<li>
								<a href="javascript:" class="oneD" target="_self" >소통·소식</a>
									<div class="twoD">
													<a class="" href="/museum/communication/notice/list.do" target="_self" >
													새소식</a>
												<div class="thrD">
												<!-- 이전 뎊스가 5이면 닫아준다. -->
													</div>
												<a class="" href="/museum/communication/edu-ptsct/list.do" target="_self" >
													교육후기</a>
												<div class="thrD">
												<!-- 이전 뎊스가 5이면 닫아준다. -->
													</div>
												<a class="" href="/museum/communication/photo/list.do" target="_self" >
													포토갤러리</a>
												<div class="thrD">
												<!-- 이전 뎊스가 5이면 닫아준다. -->
													</div>
												<a class="" href="/museum/communication/faq/list.do" target="_self" >
													FAQ</a>
												<div class="thrD">
												<!-- 이전 뎊스가 5이면 닫아준다. -->
													</div>
												<a class="" href="/museum/communication/visit-before-inquire/write.do" target="_self" >
													이용문의</a>
												<div class="thrD">
												</div>
							</li>
						</ul>
						<div class="leftArea">
							<p class="tit">운영시간</p>
							<dl>
								<dt>평일</dt>
								<dd>11:00 ~ 19:00</dd>
								<dt>주말/공휴일</dt>
								<dd>11:00 ~ 20:00</dd>
							</dl>
						</div>
					</div>
				</div>
				<div class="gnbBg"></div>
			</div><!-- // header -->

			<!-- 모바일 헤더 -->
			<div class="mHeader">
				<div>
					<a href="javascript:" class="menuBtn"><img src="/common_mus/images/btn/m_gnb_btn.png" alt="" /></a>
					<h1 class="logo">
						<a href="/museum/main/index.do"><img src="/common_mus/images/m_logo.png" alt="" /></a>
					</h1>
				</div>
			</div>

			<div class="mMenuArea">
				<div class="top">
					<a href="https://adventure.lotteworld.com/museum/member/login/index.do" class="loginBt">로그인</a>
						<a href="javascript:" class="closeBt"><img src="/common_mus/images/btn/m_close_btn.gif" alt="" /></a>
				</div>
				<div class="links">
					<div>
						<a href="http://adventure.lotteworld.com/kor/main/index.do" class="lotteworld" target="_blank"></a>
						<a href="http://adventure.lotteworld.com/icerink/main/index.do" class="rink" target="_blank"></a>
					</div>
				</div>

				<div class="gnbArea">
					<a data-dpth="3"  href="javascript:" class="oneD " target="_self" >이용안내</a>
									<div class="twoD" style="display:;">
									<a data-dpth="4" class=""  href="/museum/usage-guide/introduce/contentsid/535/index.do" class="" target="_self" >박물관 소개</a>
										<div class="thrD" >
											<!-- 5 end. -->
										</div>
										<a data-dpth="4" class=""  href="/museum/usage-guide/service/contentsid/539/index.do" class="" target="_self" >관람안내</a>
										<div class="thrD" >
											<!-- 5 end. -->
										</div>
										<a data-dpth="4" class=""  href="/museum/usage-guide/rental/contentsid/552/index.do" class="" target="_self" >대관안내</a>
										<div class="thrD" >
											<!-- 5 end. -->
										</div>
										<a data-dpth="4" class=""  href="/museum/usage-guide/location/index.do" class="" target="_self" >오시는 길</a>
										<div class="thrD" >
											<!-- 5 end. -->
										</div>
										<a data-dpth="4" class="thrBt"  href="javascript:" class="" target="_self" >부대시설</a>
										<div class="thrD " style="display:;">
											<a data-dpth="5" href="/museum/usage-guide/convenience/contentsid/575/index.do" target="_self" >저자거리</a>
											<a data-dpth="5" href="/wedding/" target="_blank" >전통혼례</a>
											<a data-dpth="5" href="/museum/usage-guide/souvenir_shop/contentsid/592/index.do" target="_self" >민속기념품점</a>
											</div>
										</div>
									<a data-dpth="3"  href="javascript:" class="oneD " target="_self" >전시</a>
									<div class="twoD" style="display:;">
									<a data-dpth="4" class=""  href="/museum/gallery/permanent_exhibition/contentsid/597/index.do" class="" target="_self" >상설전시</a>
										<div class="thrD" >
											<!-- 5 end. -->
										</div>
										<a data-dpth="4" class=""  href="/museum/gallery/special/list.do" class="" target="_self" >특별전시</a>
										<div class="thrD" >
											</div>
										</div>
									<a data-dpth="3"  href="javascript:" class="oneD " target="_self" >교육프로그램</a>
									<div class="twoD" style="display:;">
									<a data-dpth="4" class="thrBt"  href="javascript:" class="" target="_self" >역사교육</a>
										<div class="thrD " style="display:;">
											<a data-dpth="5" href="/museum/edu-program/edu/list.do" target="_self" >프로그램</a>
											<!-- 5 end. -->
										</div>
										<a data-dpth="4" class=""  href="/museum/edu-program/craft/list.do" class="" target="_self" >전통공예체험</a>
										<div class="thrD" >
											</div>
										</div>
									<a data-dpth="3"  href="javascript:" class="oneD " target="_self" >소통·소식</a>
									<div class="twoD" style="display:;">
									<a data-dpth="4" class=""  href="/museum/communication/notice/list.do" class="" target="_self" >새소식</a>
										<div class="thrD" >
											<!-- 5 end. -->
										</div>
										<a data-dpth="4" class=""  href="/museum/communication/edu-ptsct/list.do" class="" target="_self" >교육후기</a>
										<div class="thrD" >
											<!-- 5 end. -->
										</div>
										<a data-dpth="4" class=""  href="/museum/communication/photo/list.do" class="" target="_self" >포토갤러리</a>
										<div class="thrD" >
											<!-- 5 end. -->
										</div>
										<a data-dpth="4" class=""  href="/museum/communication/faq/list.do" class="" target="_self" >FAQ</a>
										<div class="thrD" >
											<!-- 5 end. -->
										</div>
										<a data-dpth="4" class=""  href="/museum/communication/visit-before-inquire/write.do" class="" target="_self" >이용문의</a>
										<div class="thrD" >
											</div>
						</div>
						</div>
			</div>

			<div id="cBody">
				<div class="mainVisArea swiper-container">
    <div class="swiper-wrapper">
      <a
              href="/museum/usage-guide/introduce/contentsid/535/index.do"
              class="swiper-slide"
              target="_self"
            >
              <img
                src="/image/2020/5/202005111050316900.jpg"
                data-mbl-img-path="/image/2020/5/202005111050318930.jpg"
                data-web-img-path="/image/2020/5/202005111050316900.jpg"
                class="web_mbl_img"
                style="width:100%;"
              />
            </a>
          <a
              href="/museum/gallery/permanent_exhibition/contentsid/597/index.do"
              class="swiper-slide"
              target="_self"
            >
              <img
                src="/image/2019/2/201902220555000140.jpg"
                data-mbl-img-path="/image/2019/2/201902220555000920.jpg"
                data-web-img-path="/image/2019/2/201902220555000140.jpg"
                class="web_mbl_img"
                style="width:100%;"
              />
            </a>
          <a
              href="#"
              class="swiper-slide"
              target="_self"
            >
              <img
                src="/image/2020/5/202005130508091810.jpg"
                data-mbl-img-path="/image/2020/5/202005130508093220.jpg"
                data-web-img-path="/image/2020/5/202005130508091810.jpg"
                class="web_mbl_img"
                style="width:100%;"
              />
            </a>
          </div>
    <div class="swiper-pagination"></div>
      <div class="swiper-button-next"></div>
      <div class="swiper-button-prev"></div>
    </div>
<div class="mainTodayArea">
  <div class="container">
    <a href="/museum/usage-guide/service/contentsid/539/index.do">
      <p class="mTit">운영시간</p>
      <div class="time">
        <p class="tit">평일</p>
        <p class="txt">11:00 - 19:00</p>
      </div>
      <div class="time">
        <p class="tit">주말/공휴일</p>
        <p class="txt">11:00 - 20:00</p>
      </div>
    </a>
  </div>
</div>

<div class="mainCon mainCon1">
  <div class="inner">
    <p class="mainTit">
      시대별 문화를<br />
      즐길 수 있는 전시
    </p>
    <p class="mainTxt">현재 진행 중인 전시를 알아보세요.</p>
    <ul class="mainCon1List">
      <!-- 운영: 597  개발: 505 -->
      <li>
        <a href="/museum/gallery/permanent_exhibition/contentsid/597/index.do">
          <div class="img">
            <img src="/common_mus/images/icon/mainCon1_img1.jpg" alt="" />
          </div>
          <div class="txtArea">
            <p class="tit">상설전시</p>
          </div>
        </a>
      </li>
      <li>
        <a href="/museum/gallery/special/list.do">
          <div class="img">
            <img src="/common_mus/images/icon/mainCon1_img2.jpg" alt="" />
          </div>
          <div class="txtArea">
            <p class="tit">특별전시</p>
          </div>
        </a>
      </li>
    </ul>
    <div class="mainCon1Bg">
      <div class="t1"></div>
      <div class="t2"></div>
    </div>
  </div>
</div>
<!-- // mainCon1 -->

<div class="mainCon mainCon2">
  <div class="inner">
    <p class="mainTit">
      민속박물관의 즐겁고<br />
      다양한 프로그램
    </p>
    <p class="mainTxt">다양한 프로그램을 확인해보세요.</p>
    <ul class="mainCon2List">
      <li>
        <a href="/museum/edu-program/edu/list.do">
          <div class="img">
            <img
              src="/common_mus/images/icon/mainCon2_img1.jpg"
              alt=""
              class="pc"
            />
            <img
              src="/common_mus/images/icon/mainCon2_img1_m.jpg"
              alt=""
              class="mobile"
            />
          </div>
          <div class="txtArea">
            <p class="tit">전통문화/역사교육</p>
          </div>
        </a>
      </li>
      <li>
        <a href="/museum/edu-program/craft/list.do">
          <div class="img">
            <img
              src="/common_mus/images/icon/mainCon2_img2.jpg"
              alt=""
              class="pc"
            />
            <img
              src="/common_mus/images/icon/mainCon2_img2_m.jpg"
              alt=""
              class="mobile"
            />
          </div>
          <div class="txtArea">
            <p class="tit">전통공예체험</p>
          </div>
        </a>
      </li>
      <li>
        <a href="/museum/communication/photo/list.do">
          <div class="img">
            <img
              src="/common_mus/images/icon/mainCon2_img3.jpg"
              alt=""
              class="pc"
            />
            <img
              src="/common_mus/images/icon/mainCon2_img3_m.jpg"
              alt=""
              class="mobile"
            />
          </div>
          <div class="txtArea">
            <p class="tit">문화행사</p>
          </div>
        </a>
      </li>
    </ul>
  </div>
</div>

<div class="mainCon mainCon3">
  <div class="inner">
    <p class="mainTit">민속박물관 소식을 한눈에!</p>
    <p class="mainTxt">오늘의 민속박물관 소식을 만나보세요.</p>
    <div class="mainNews">
      <div class="left">
        <p class="tit">민속박물관 소식</p>

        <div class="newsCon">
              <a
                href="/museum/communication/notice/view.do?pageIndex=1&detailsKey=140"
              >
                <p class="tit">[롯데월드X제로월드] 두번째 방탈출 &lt;바람,우리는 그저 바람이었소&gt; 오픈</p>
                <p class="txt"
                  >


</p
                >
                <p class="date">
                  2022.11.09</p>
              </a>
            </div>
          <ul class="newsList">
          <li>
                <a
                  href="/museum/communication/notice/view.do?pageIndex=1&detailsKey=126"
                  >[롯데월드X플레이더월드] 모바일 방탈출 &lt;화연 : 조선 최고의 소리꾼&gt;</a
                >
                <span class="date">
                  2022.02.22</span>
              </li>
            <li>
                <a
                  href="/museum/communication/notice/view.do?pageIndex=1&detailsKey=120"
                  >[롯데월드X제로월드] 방탈출 &lt;아랑 餓浪 : 굶주린 이리&gt;</a
                >
                <span class="date">
                  2021.10.21</span>
              </li>
            <li>
                <a
                  href="/museum/communication/notice/view.do?pageIndex=1&detailsKey=113"
                  >민속박물관 주차 변경 안내</a
                >
                <span class="date">
                  2021.06.16</span>
              </li>
            </ul>

        <a href="/museum/communication/notice/list.do" class="newsMoreBt"></a>
      </div>
      <div class="right">
        <div class="utilDiv">
          <a href="/museum/communication/visit-before-inquire/write.do"
            >이용 문의</a
          >
          <a href="/museum/usage-guide/location/index.do">오시는 길</a>
        </div>
        <div class="bannerDiv">
          <p class="tit">
            우리 고유의 옛멋과<br />
            품격을 선도합니다
          </p>
          <a href="/wedding/guide/contentsid/372/index.do" target="_blank"
            >전통혼례 바로가기</a
          >
        </div>
      </div>
    </div>
  </div>
</div>

<script type="text/javascript" src="/common_mus/js/main.js"></script>
<style>
  .muPopup {
    display:none;
    z-index: 9999;
    border: 5px solid #444;
  }

  .muPopup .popImg img {
    width: 100%;
  }

  .muPopup a.btn_close,
  .muPopup a.btn_close2 {
    display: block;
    float: left;
    width: 50%;
    padding: 20px 0;
    text-align: center;
    background-color: #353d40;
  }

  .muPopup a.btn_close + a.btn_close2 {
    background-color: #005e3c;
  }

  .muPopup span {
    text-align: center;
    color: #fff;
  }

  .muPopup p:after {
    content: "";
    display: block;
    clear: both;
    height: 0;
    visibility: hidden;
  }

  @media (max-width: 768px) {
    .muPopup {
      width: 90%;
      left:50%;
      transform:translateX(-50%);
      right:inherit!important;
    }

    .muPopup .popImg img {
      max-width: 100% !important;
    }
  }
</style>
<div id="pop_layer1" style="position:absolute;top:2%;right:6%;z-index:10000" class="muPopup">
  <div class="popImg" style="position: relative;">
    <a href="https://adventure.lotteworld.com/museum/communication/notice/view.do?pageIndex=1&detailsKey=120&q=" title="[롯데월드X제로월드] 방탈출 <아랑 餓浪 : 굶주린 이리>">
      <img src="/common_mus/images/icon/popup_mui_20240219.jpg" alt="[롯데월드X제로월드] 방탈출 <아랑 餓浪 : 굶주린 이리>" />
    </a>
  </div>
  <p style="margin-top: -5px;">
    <a href="#" onClick="setCookie('pop_20240219','Y',1); document.getElementById('pop_layer1').style.display='none'; return false;" class="btn_close">
      <span>오늘 하루 열지않기</span>
    </a>
    <a href="#" onClick="document.getElementById('pop_layer1').style.display='none'; return false;" class="btn_close2">
      <span class="close">닫기</span>
    </a>
  </p>
</div>
<div id="pop_layer2" style="position:absolute;top:2%;right:31%;z-index:10001" class="muPopup">
  <div class="popImg" style="position: relative;">
    <a href="https://adventure.lotteworld.com/museum/communication/notice/view.do?pageIndex=1&detailsKey=174&q=" titlle="[겨울방학] 전래동화시리즈 <흥부와 놀부> 공연 안내">
      <img src="/common_mus/images/icon/popup_mui_20240111.jpg" alt="겨울방학 특별선물 흥부와 놀부" />
    </a>
  </div>
  <p style="margin-top: -5px;">
    <a href="#" onClick="setCookie('pop_20240111','Y',1); document.getElementById('pop_layer2').style.display='none'; return false;" class="btn_close"><span>오늘 하루 열지않기</span></a>
    <a href="#" onClick="document.getElementById('pop_layer2').style.display='none'; return false;" class="btn_close2"><span class="close">닫기</span></a>
  </p>
</div>
<div id="pop_layer3" style="position:absolute;top:1%;right:45%;z-index:10000;" class="muPopup">
  <div class="popImg" style="position: relative;">
    <img src="/common_mus/images/icon/popup_mui_20230627.jpg" alt="고려실 운영 중단 안내" />
  </div>
  <p style="margin-top: -5px;">
    <a
      href="#"
      onClick="setCookie('pop_20230627','Y',1); document.getElementById('pop_layer3').style.display='none'; return false;"
      class="btn_close"
      ><span>오늘 하루 열지않기</span></a
    >
    <a
      href="#"
      onClick="document.getElementById('pop_layer3').style.display='none'; return false;"
      class="btn_close2"
      ><span class="close">닫기</span></a
    >
  </p>
</div>
<script type="text/javascript">
  function setCookie(name, value, expiredays) {
    var todayDate = new Date();
    todayDate.setDate(todayDate.getDate() + expiredays);
    document.cookie =
      name +
      "=" +
      escape(value) +
      "; path=/; expires=" +
      todayDate.toGMTString() +
      ";";
  }

  function getCookie(name) {
    var wcname = name + "=";
    var wcstart, wcend, end;
    var i = 0;

    while (i <= document.cookie.length) {
      wcstart = i;
      wcend = i + wcname.length;
      if (document.cookie.substring(wcstart, wcend) == wcname) {
        if ((end = document.cookie.indexOf(";", wcend)) == -1)
          end = document.cookie.length;
        return document.cookie.substring(wcend, end);
      }

      i = document.cookie.indexOf("", i) + 1;

      if (i == 0) break;
    }
    return "";
  }
  var sdate = new Date("2024-02-19 09:00:00");
  var edate = new Date("2024-12-31 23:59:00");
  if (
    getCookie("pop_20240219") != "Y" &&
    Date.now() < edate &&
    Date.now() > sdate
  ) {
    document.getElementById("pop_layer1").style.display = "block";
  }


  var sdate2 = new Date("2024-01-11T09:00:00+09:00");
  var edate2 = new Date("2024-02-04T16:00:00+09:00");
  if (
    getCookie("pop_20240111") != "Y" &&
    Date.now() < edate2 &&
    Date.now() > sdate2
  ) {
    document.getElementById("pop_layer2").style.display = "block";
  }

  var sdate3 = new Date("2023-06-27T09:00:00+09:00");
  var edate3 = new Date("2023-07-03T23:58:00+09:00");
  if (
    getCookie("pop_20230627") != "Y" &&
    Date.now() < edate3 &&
    Date.now() > sdate3
  ) {
    document.getElementById("pop_layer3").style.display = "block";
  }
</script>
</div><!-- // cBody -->
			<div id="footer">
				<div class="container">
					<div class="top">
						<div class="links">
							<a href="/kor/lotteworld/introduce/business/contentsid/350/index.do">롯데월드 소개</a>
							<a href="/kor/lotteworld/introduce/alliance/contentsid/353/index.do">기업 제휴 및 입점 문의</a>
							<a href="/kor/lotteworld/agreement-of-utilization/homepage/contentsid/356/index.do">이용약관</a>
							<a href="/kor/lotteworld/processing-of-personal-information/homepage/index.do" class="cRed">개인정보처리방침</a>							
							<a href="/museum/sitemap/index.do">사이트맵</a>
						</div>
					</div>
					<div class="bottom">
						<div class="left">
							<div>
								<p><span>서울특별시 송파구 올림픽로 240 호텔롯데 롯데월드</span><span>대표자 : 최홍훈</span></p>
								<p><span>사업자등록번호 : 219-85-00014</span><span>통신판매업신고번호 : 송파 제5513호</span><span>전화 : 1661-2000</span></p>
								<p class="copyright">COPYRIGHT 2018 LOTTEWORLD. ALL RIGHTS RESERVED.</p>
							</div>
						</div>
						<div class="familySite">
							<select id="selectFamilySite" title="계열사 관련 사이트 새창열기">
								<option value="">계열사 관련 사이트</option>
								<option value="https://www.lotte.co.kr/main.do">LOTTE Family</option>
								<option value="https://www.lottewellfood.com/">롯데웰푸드</option>
								<option value="https://mall.lottechilsung.co.kr/display/displayShop.lecs?displayNo=CF1A07A01&stonType=P">롯데칠성음료(음료BG)</option>
								<option value="https://company.lottechilsung.co.kr/kor/main/index.do">롯데칠성음료(주류BG)</option>
								<option value="https://www.lotteshopping.com/main">롯데백화점</option>
								<option value="https://company.lottemart.com/">롯데마트</option>
								<option value="https://www.lotteon.com/p/display/main/lottefresh">롯데슈퍼</option>
								<option value="https://www.7-eleven.co.kr/">코리아세븐</option>
								<option value="https://www.e-himart.co.kr/app/display/showDisplayShop?originReferrer=himartindex">롯데하이마트</option>
								<option value="https://www.lottehomeshopping.com/user/main/index.lotte">롯데홈쇼핑</option>
								<option value="https://www.lotteon.com/p/display/main/lotteon">롯데쇼핑e-커머스</option>
								<option value="https://www.lottecinema.co.kr/NLCHS">롯데시네마</option>
								<option value="https://store-kr.uniqlo.com/">FRL코리아</option>
								<option value="https://www.lottecon.co.kr/">롯데건설</option>
								<option value="https://www.lottecm.com/ko/main.do">롯데건설 CM사업본부</option>
								<option value="https://www.lotteglogis.com/">롯데글로벌로지스</option>
								<option value="https://www.lotterentacar.net/hp/kor/main/index.do">롯데렌탈</option>
								<option value="http://www.lottemembers.com/">롯데멤버스</option>
								<option value="https://kr.lottedfs.com/main/index.do">롯데면세점</option>
								<option value="https://kr.lottedfs.com/main/index.do">롯데면세점부산</option>
								<option value="https://kr.lottedfs.com/main/index.do">롯데면세점제주</option>
								<option value="https://www.lottepnd.com/main.do">롯데물산</option>
								<option value="https://www.lottemuseum.com/">롯데뮤지엄</option>
								<option value="http://www.lotteineos.com/">롯데이네오스화학</option>
								<option value="https://www.lotte.co.kr/csv/main.do">롯데사회공헌사이트</option>
								<option value="https://www.lotteintl.com/">롯데상사</option>
								<option value="https://www.lotteskyhill.com/">롯데스카이힐 C.C</option>
								<option value="https://www.asahibeerk.com/">롯데아사히주류</option>
								<option value="https://www.lotteal.co.kr/">롯데알미늄</option>
								<option value="https://www.lottemcc.com/index.do">롯데엠시시</option>
								<option value="https://www.lotteworld.com/gate.html">롯데월드</option>
								<option value="https://www.lottelmsc.com/">롯데피플네트웍스</option>
								<option value="https://www.lotteacademy.co.kr/login/loginForm.do">롯데인재개발원</option>
								<option value="http://www.lottedevelop.com/">롯데자산개발</option>
								<option value="https://www.giantsclub.com/html/">롯데자이언츠</option>
								<option value="https://www.lottefinechem.com/">롯데정밀화학</option>
								<option value="https://www.ldcc.co.kr/">롯데정보통신</option>
								<option value="https://www.lottejtb.com/">롯데제이티비</option>
								<option value="https://www.lotternd.com/kor/main/main.html">롯데중앙연구소 </option>
								<option value="https://www.lottegrs.com/main.jsp">롯데지알에스</option>
								<option value="https://recruit.lotte.co.kr/">롯데채용사이트</option>
								<option value="https://www.lottecap.com/ma/ma/MAMA00100">롯데캐피탈</option>
								<option value="https://www.lottechem.com/">롯데케미칼</option>
								<option value="https://www.lotteconcerthall.com/kor">롯데콘서트홀</option>
								<option value="https://www.lottehotel.com/global/ko.html">롯데호텔</option>
								<option value="https://www.daehong.com/">대홍기획</option>
								<option value="https://www.lottehotel.com/busan-hotel/ko.html">부산롯데호텔</option>
								<option value="https://kr.canon/main">캐논코리아 주식회사</option>
								<option value="https://www.fujifilm.co.kr/main.do">한국후지필름</option>
							</select>
						</div>
					</div>
				</div>
			</div><!-- // footer -->
			<p class="blackBg" ></p>			
			<div class="ajaxLoader" style="display:none;z-index:10001;">
	   			<img src="/common/images/ajax-loader.gif" style="position:fixed;">
			</div>
			<div class="topBtn"><a href="javascript:"><img src="/common_mus/images/btn/top_btn.png" alt="" /></a></div>
			
		<div class="layerPop browserUp" id="browserUpContainer" style="display:none;">
				<div class="popHead">브라우저 업데이트 안내</div>
				<div class="popBody">
					<div class="txt">
						<p>
							롯데월드 어드벤처 홈페이지는 고객님에게 원활한 서비스를 안정적으로<br />
							제공하기 위해 최선을 다하고 있으며, 고객님의 소중한 정보들을 보호하기 위해 노력하고 있습니다.
						</p>
						<p>
							현재 고객님의 브라우저에는 원활한 서비스를 제공하기 어렵습니다.<br />
							본 홈페이지를 이용하기 위해서는 <span>보안과 속도가 강화된 브라우저로 업그레이드</span> 하시기 바랍니다.
						</p>
					</div>
					<div class="browserEx">
						<div class="list"><a href="https://www.microsoft.com/ko-kr/download/internet-explorer-11-for-windows-7-details.aspx" target="_blank" title="새창 열림">MS Explore 11</a></div>
						<div class="list"><a href="https://www.google.co.kr/chrome/index.html" target="_blank" title="새창 열림">Goole Chrome</a></div>
						<div class="list"><a href="https://www.mozilla.org/ko/firefox/new/" target="_blank" title="새창 열림">Firefox</a></div>
					</div>
				</div>
				<div class="check">
					<input type="checkbox" id="browser_today_close" value="Y" title="오늘 하루" data-trgt-id="browserUpgradePop" /><!----><label for="browser_today_close">오늘 하루 보지 않기</label>
				</div>
				<a href="javascript:" class="popClose"><img src="/common/images/btn/popClose_icon2.png" alt="팝업 닫기" /></a><!-- layerPop 팝업 닫기 버튼 -->
			</div>
		<script type="text/javascript">
			$(document).ready(function(){
				//모바일이 아니고 IE가 9이하이고 오늘 하루값이 없을때 보여진다.		
				//IEVerChk()
				var isChk = getCookie("browserUpgradePop");
				isChk = isChk == "" ? "true" : isChk;
				if(isChk == "true" && IEVerChk())
				{
					$(".blackBg").fadeIn(300);
					$("#browserUpContainer").fadeIn(300);
				}
				//브라우져 오늘 하루 닫기
				$("#browser_today_close").on("change", function(){
					var trgtId = jQuery(this).data("trgtId");
					if ( trgtId )
					{
						if ( jQuery(this).is(":checked") )
						{
							setCookie(trgtId, "false", 1);
						}
						else
						{
							setCookie(trgtId, "true", 1);
						}
					}
				});
				
				//계열사 관련 사이트
				$("#selectFamilySite").change(function(){
					var siteUrl = $(this).val() || '';
					if(siteUrl != ''){
						SSO_COMMON.GoFamilySite(siteUrl);
					}
				});
			});
		</script>
		
		<script data-main="/common_mus/js/site" type="text/javascript" src="/common_mus/js/lib/requireJs/require.js"></script>
		<script async src="https://www.googletagmanager.com/gtag/js?id=UA-120902673-7"></script>
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());

  gtag('config', 'UA-120902673-7');
</script>		
	</body>
</html>