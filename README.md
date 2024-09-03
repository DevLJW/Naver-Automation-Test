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
5. 종료
<br>
네트워크나 페이지 로딩시간에 따른 지연문제 때문에 전체 엘레멘트에 10초의 명시적 대기시간을 설정 하였다.<br>
우선 로그인 페이지 객체 생성자를 생성하고 생성자를 통하여 로그인을 메소드를 실행한다.<br>
ClassName,LinkText,id 등등을 통해 각종 엘레멘트를 찾고, 메일작성 버튼 클릭시,<br>
새로운 창으로 메일작성 페이지가 열리게된다. 새로운 창이 열릴경우, driver.switchTo() 메소드를 통해,<br>
WindowsHandles[1]번으로 이동을 해주었으며 메일의 받는사람,제목을 작성한후, 내용같은 경우 다른 프레임에 존재하여<br>
siwthchTo().frame(4) 다섯번째 프레임으로 이동 후,내용을 작성하고 다시 기존프레임으로 돌아와 메일 보내기 버튼을 클릭 하도록 구현 하였다.<br>

<br><br>

### 2. 네이버 포스트 작성
 <img src="https://github.com/user-attachments/assets/36b85596-0317-4894-88c9-209b139adcd5" width="100%" height="60%">
 <br>
 <br>
 
시나리오 :<br>
1. 네이버 로그인
2. 블로그 탭 선택 -> 글쓰기 버튼 클릭
3. 제목 클릭 후, 내용 입력
4. 글씨모양 -> "우리 딸 손글씨", 글자크기 -> "40" 변경
5. 본문 클릭 후 내용 입력
6. "발행" 버튼 클릭
7. 다이얼로그 출력후 "발행" 버튼 클릭
8. 종료
<br>
네트워크나 페이지 로딩시간에 따른 지연문제 때문에 전체 엘레멘트에 10초의 명시적 대기시간을 설정 하였다.<br>
우선 로그인 페이지 객체 생성자를 생성하고 생성자를 통하여 로그인을 메소드를 실행한다.<br>
ClassName,LinkText,id 등등을 통해 각종 엘레멘트를 찾고, 메일작성 버튼 클릭시,<br>
새로운 창으로 메일작성 페이지가 열리게된다. 새로운 창이 열릴경우, driver.switchTo() 메소드를 통해,<br>
WindowsHandles[1]번으로 이동을 해주었으며 메일의 받는사람,제목을 작성한후, 내용같은 경우 다른 프레임에 존재하여<br>
siwthchTo().frame(4) 다섯번째 프레임으로 이동 후,내용을 작성하고 다시 기존프레임으로 돌아와 메일 보내기 버튼을 클릭 하도록 구현 하였다.<br>

<br><br>

















