<!-- Improved compatibility of back to top link: See: https://github.com/othneildrew/Best-README-Template/pull/73 -->
<a id="readme-top"></a>
<!--
*** Thanks for checking out the Best-README-Template. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Don't forget to give the project a star!
*** Thanks again! Now go create something AMAZING! :D
-->








<!-- ABOUT THE PROJECT -->
## 네이버 메일작성&포스트 글쓰기 자동화
![테스트자동화](https://github.com/user-attachments/assets/25a59fcb-4042-4eb8-a1a2-ef2208a4690e)
<br>


## 설명 
테스트 자동화 기초적인 공부를 한 후, 네이버를 대상으로 시나리오 테스팅을 진행 했습니다.<br>
메일전송&포스트 글쓰기를 대상으로 진행 했습니다.
<br>
<br>

## 개발기간
2024.08.27 ~ 2024.09.02
<br>
<br>


## 기술 스택

<div>
<img src="https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=Selenium&logoColor=white">
<img src="https://img.shields.io/badge/JAVA-3178C6?style=for-the-badge&logo=Java&logoColor=white">

</div>

<br>


## 시나리오 테스트 내용 소개

### 0. 로그인 페이지 객체 패턴
 <img src="https://github.com/user-attachments/assets/36b85596-0317-4894-88c9-209b139adcd5" width="100%" height="60%">
 <br>
 <br>

로그인 같은 경우, 페이지 객체 패턴을 이용하여 코드를 작성 하였다.<br>
Selenium을 사용하여 자동화 로그인 시, 자동방지입력 시스템이 작동되어 로그인을 할 수 없다.<br>
js.executeScript()를 통하여 빠른타이핑이 아닌 붙혀넣기 효과로 구현을 하였다.<br>
sendKeys()같은경우 봇에의해 감지가 되지만, 자바스크립트를 통해 붙혀넣는건 감지하지 못한다.<br>



### 1. 네이버 메일 작성
 <img src="https://github.com/user-attachments/assets/36b85596-0317-4894-88c9-209b139adcd5" width="100%" height="60%">
 <br>
 <br>
 
시나리오 :<br>
1. 네이버 로그인
2. 메일 탭 선택 -> 메일쓰기 버튼 클릭
3. 받는사람, 제목, 내용 입력
4. 보내기 버튼 클릭
<br>
네트워크나 페이지 로딩시간에 따른 지연문제 때문에 전체 엘레멘트에 10초의 명시적 대기시간을 설정 하였다.<br>
우선 로그인 페이지 객체 생성자를 생성하고 생성자를 통하여 로그인을 메소드를 실행한다.<br>
ClassName,LinkText,id 등등을 통해 각종 엘레멘트를 찾고, 메일작성 버튼 클릭시,<br>
새로운 창으로 메일작성 페이지가 열리게된다. 새로운 창이 열릴경우, driver.switchTo() 메소드를 통해,<br>
WindowsHandles[1]번으로 이동을 해주었으며 메일의 받는사람,제목을 작성한후, 내용같은 경우 다른 프레임에 존재하여<br>
siwthchTo().frame(4) 다섯번째 프레임으로 이동 후,내용을 작성하고 다시 기존프레임으로 돌아와 메일 보내기 버튼을 클릭 하도록 구현 하였다.<br>










<br><br>








### 2. 엘리먼트 찾기 및 엘리먼트 대기
 <img src="https://github.com/user-attachments/assets/8497b43b-9c76-4133-96d4-56899c03ee0d" width="100%" height="60%">
 <br>
 <br>
HTML의 id나 class name 등을 통해 웹페이지에서 원하는 엘리먼트를 찾는 방법을 공부하고,<br>
로딩중인 웹 엘리먼트를 로딩후에 찾는 방법에 대해 공부 하였다.<br>
묵시적 대기시간은 WebDriver.Timeouts 인터페이스를 통하여 적용하고 공부 하였으며,<br>
명시적 대기 시간은 ExpectedCondition 인터페이스를 통하여 적용하고 공부 하였다.<br>
<br>
<br>



### 3. 복합액션
 <img src="https://github.com/user-attachments/assets/b25ec38f-8701-4279-84bc-8f4db401f08a" width="80%" height="60%">
 <br>
 <br>
  사용자가 액션을 여러 개 연결해서 순차적으로 실행하는 복합적인 과정에 대하여<br>
  액션을 공부 하였습니다. (EX : Ctrl + 마우스 클릭 / 클릭 + 드래그 앤 드롭)<br>
  Actions 클래스를 사용하면 사용자 동작을 하나의 복합 액션으로 만들 수 있어서,<br>
  Actions 클래스를 사용하였고, 복합 액션을 실행하는 perform() 메소드를 사용하여 실행 하였습니다.
  <br>
  <br>
  


### 4. 자동 스크린샷 캡쳐
 <img src="https://github.com/user-attachments/assets/b38dc079-39a9-4117-8f57-e27afd17bf55" width="100%" height="60%">
  <br>
 <br>
 스크린샷 기능을 통해 테스트가 실패한 당시의 상황을 남길 수 있어서 스크린샷 구현에 대해 공부 하였습니다.<br>
 웹드라이버 라이브러리의 TakesScreenShot 인터페이스는 모든 웹드라이버의 구현체에서 사용이 가능하여 이 인터페이스로 공부 하였습니다.<br>
 실패 시, 스크린샷을 찍고, target 폴더 하위에 파일을 복사하여 저장하는 형식으로 구현 하였습니다.
 
 
  <br><br><br>


### 5. 프레임 간 전환
 <img src="https://github.com/user-attachments/assets/b8259ce9-af10-4209-b862-70480f43f701" width="100%" height="60%">
 <br>
 <br>

하나의 브라우저 창에서 여러개의 HTML 문서를 동시에 볼 수 있게 해주는 프레임에 대한 프레임 간 전환을 공부 하였습니다.<br>
WebDriver 인터페이스의 swithchTo().frame() 메소드를 통하여 프레임을 이동 하였습니다.<br>
첫번째 프레임 이동 후, 바로 두번째 프레임을 찾을 시, 접근을 허용할 수 없어 최상위 컨테이너로 이동 후(defultContent()),<br>
2번째 프레임으로 이동하는 방법으로 구현 했습니다.



<br><br>



### 6. 윈도우 창 전환
 <img src="https://github.com/user-attachments/assets/2020a4cd-1986-47bd-a422-f8a9cf51c7a4" width="100%" height="60%">
 <br>
 <br>
윈도우 간 창 전환에 대하여 공부 하였습니다. WebDriver.TargetLocator 인터페이스를 적용하여 구현 했습니다.<br>
윈도우 창을 열때마다, 윈도우에서 윈도우 창에 대한 식별값을 지정 해줍니다.<br>
gethandleWindow() 메소드를 통하여 현재 실행한 웹 브라우저의 식별 값을 가져옵니다.<br>
그 후 현재 페이지에서 switchTo().window()메소드를 통하여 이동할 페이지의 주소 인덱스를 파라미터로 전달하여 페이지를 이동 합니다.<br>
처음에 열린페이지에서 gethandleWindow() 메소드를 사용하면, 열린페이지의 주소값을 가져오는 줄 알았습니다.<br>
하지만, 셀레늄 같은경우, 초기에 실행한 웹 브라우저만을 바라보고 있기에,<br>
첫번째 윈도우 주소값만 가져와 새로운 창의 주소값은 가져올 수 없었습니다.<br>
그래서 윈도우를 구분하기 위해 getWindowsHandles()메소드를 진행한다. 메소드 실행 시 열린 윈도우의 식별값을 모두 가져온니다.<br>






<br><br>

### 7. 쿠키 핸들링
 <img src="https://github.com/user-attachments/assets/1ec87588-7ee7-479f-9082-32e9dcecfa4a" width="100%" height="100%">
  <img src="https://github.com/user-attachments/assets/3edccb18-94a7-4834-aa4a-0cceb1333baf" width="100%" height="100%">
 <br>
 <br>
최초 로그인할 때 쿠키 정보를 파일에 보관 한 후, 다음번 로그인에는 쿠키를 가져와<br>
드라이버에 추가하는 식으로 반복되는 로그인 과정을 생략할 수 있습니다.<br>
드라이버 세션에 쿠키 정보가 존재하면 로그인 과정을 생략할 수 있는데 서버는 세션을 인증받은 것으로 인식 합니다.<br>
처음 로그인 할때, driver.manage().getCookies()를 호출하여 쿠키정보를 읽고,<br>
FileWriter&BufferdWriter를 통해 파일에 쿠키의 정보를 작성 합니다.<br>
다음번에 로그인할때 해당 파일에 토큰의 정보를 ';' 단위로 끊어 속성별로 하나씩 읽어들여 쿠키의 정보를<br>
드라이버를 통해 브라우저 세션에 추가하여 자동으로 로그인 합니다. (driver.manage().addCookie() 메소드 사용)<br>




<br><br>



### 8. 웹 드라이버 이벤트
  <img src="https://github.com/user-attachments/assets/ac7d1c54-c4bf-4c1c-a6f2-529f380c033e" width="100%" height="60%">
 <br>
 <br>
  셀레늄의 웹 드라이버는 테스트를 수행하는 동안 발생하는 다양한 이벤트를 추적하는 API를 제공 합니다.<br>
  이벤트를 발생 시킬때는, EventFiringWebDriver 클래스, 수신 및 처리할때는 WebDriverEventListener 인터페이스를 사용 했습니다.<br>
  이벤트 리스너 파일(수신 및 처리)을 하나 만들어 WebDriverEventListener 파일을 구현 해주고,<br>
  메인 파일에서 EventFiringWebDriver 인스턴스를 생성하여 register() 메소드를 사용하여 이벤트 리스너 파일을 연결 했습니다.
 
  <br><br><br>


### 9. 접근성 추정
  <img src="https://github.com/user-attachments/assets/982af22d-e96d-4484-91f9-4d8b260f35ad" width="100%" height="60%">
 <br>
 <br>
  구글 접근성 개발자 도구 같은 도구로 기본적인 접근성 여부를 확인할 수 있습니다.<br>
  웹 페이지에 구글 접근성 테스트 라이브러리를 주입해 afterNavigetTo()를 호출때마다, 자동으로<br>
  접근성을 검사하는 코드를 작성 했습니다. 구글 접근성 개발자 도구에서 제공하는 axe_testing.js 파일을<br>
  주입하여 콘솔에 로그가 찍히게 구현 하였습니다.

  <br><br><br>  


### 10.셀레늄 서버 + 리모트 드라이버
  <img src="https://github.com/user-attachments/assets/f992b3e4-8b5c-4b8d-8dea-6f2c7253b855" width="100%" height="60%">
 <br>
 <br>

  다양한 OS와 다양한 브라우저에서 테스팅을 진행하기 위해 셀레늄 서버에 대하여 공부 하였습니다.<br>
  서버는 독립실행형 모드로 구성을 하여 완전한 기능을 갖춘 그리드가 제공이 되었습니다.<br>
  standalone 모드 시, 로컬의 패스 환경과 동일하게 노드가 구성이 되었습니다.(window 및 chrome)<br>
  허브같은경우, 원격드라이버로 허브에 연결을 하고, 허브에서 크롬드라이버와 연결하여 테스트 스크립트를 실행하도록 구현 하였습니다.<br>
  노드는 연습환경에서 추가적으로 구현하기가 어려워(다양한 OS 및 브라우저) Sauce Labs를 통하여 구현 하였습니다.
  
  

  <br><br><br>  


  ### 11. Sauce Labs
  <img src="https://github.com/user-attachments/assets/1af8731e-aee3-4afc-949e-8f88ce1c1460" width="100%" height="60%">
   <br>
 <br>
  크로스 브라우저 테스트를 위한 셀레늄을 그리드 설정하려면 실제 장비나 가상장비에 운영체제와 브라우저를 설치해야한다.<br>
  비용과 운영에 대해 개인환경에서는 구축하기 어렵기 때문에, Sauce Labs를 학습하여 구현 하였다.<br>
  서드파티 클라우드 업체에 손쉽게 다양한 OS와 다양한 브라우저를 테스팅 가능하다.<br>

  첫번쨰로 브라우저 옵션을 설정하고, SauceLabs옵션 정의, 브라우저 옵션에 Sauce Labs 옵션 연결, 주소생성,<br>
  원격드라이버 인스턴스 생성을 하였다. 두번째로 웹페이지로 이동하는 nav를 작성하였고,  세번째로 HTML 요소를 찾고,
  <br>
  네번쨰로 찾은 요소에 대한 작업을 실행 하였다.다섯번째로 두값을 일치하는지 여부를 판단하기 위한 코드 작성,
  <br>
  여섯번째로 세션을 종료해도 되는지 확인 여부 코드작성,  일곱번쨰로 세션종료를 하는 코드를 작성해서 구현 하였다.

  
  <br><br><br>  









