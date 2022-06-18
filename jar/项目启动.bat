@echo off
setlocal enabledelayedexpansion
for /f "delims=  tokens=1" %%i in ('netstat -aon ^| findstr "8080"') do (
set a=%%i
goto js
)
:js
taskkill /f /pid "!a:~71,5!"
start jre\bin\java.exe -jar m3u8-0.0.1-SNAPSHOT.jar