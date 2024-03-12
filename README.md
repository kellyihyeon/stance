# stance 🏀 

---
농구 동호회 회원들의 출결 및 회비 관리를 위한 웹서비스 입니다. <br>
동호회 활동을 조직화하고 관리하는 데 필요한 기능을 제공하여 팀의 운영을 원활하게 지원합니다.
---

# 개발 목적
## 회원 관리
- as-is 
  - 관리자가 일일 출석을 기록하고 회원들의 출석 현황을 관리하는 데에 불편함이 있어 구글 시트를 사용
  - 그러나 구글 시트에 기록 및 확인하는 과정에서 번거로움과 휴먼 에러 발생
- 대안
  - 회원별 QR 코드를 생성하여 출석을 간편하게 기록하는 방식
  - 출석 현황을 시각화하여 표시하는 기능 추가

# 사용한 기술
- Kotlin, Spring Boot, MySQL, Spring Data JPA

# 주요 기능
- 출결 관리
  - 출석 체크
  - 출결 현황
- 회비 관리
  - 입금 내역
  - 지출 내역

