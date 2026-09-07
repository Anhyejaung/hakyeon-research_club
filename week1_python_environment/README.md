# 새 학기 1주차 - Python 개발환경 만들기

## 주제
내 PC에 제대로 된 Python 개발환경 만들기

## 사용 환경
- Windows
- VS Code
- Python 3.13.1
- PowerShell

## 실습 내용
1. Python 설치 여부 확인
2. VS Code에서 Python 파일 실행
3. 가상환경 `.venv` 생성
4. 가상환경 활성화
5. `requests` 패키지 설치
6. 설치된 패키지 확인
7. `requests` 패키지 삭제
8. `requests` 패키지 재설치
9. `requirements.txt` 생성
10. `requirements.txt`를 이용한 패키지 확인
11. 가상환경 종료
12. 가상환경 재활성화

## 실행한 주요 명령어

```powershell
python --version
python main.py
python -m venv .venv
.venv\Scripts\Activate.ps1
pip install requests
pip list
pip uninstall requests
pip install requests
pip freeze > requirements.txt
pip install -r requirements.txt
deactivate
