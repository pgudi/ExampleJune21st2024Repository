Run("notepad.exe","C:\Windows")
Sleep(2000)
Send("Selenium is an Automation Tool, Used to Automate UI components.")
Send("{ENTER}")
Send("Selenium supports PAge Object Model to write TestScripts.")
Sleep(2000)
WinClose("*Untitled - Notepad")
Sleep(2000)
ControlClick("Notepad","&Save","Button1")
Sleep(2000)
ControlSetText("Save As","*.txt","Edit1",
"E:\GitRepository5\CurrentWorkSpace
\ExampleJune21st2024Repository\AutoIT\Sample.txt")
Sleep(2000)
ControlClick("Save As","&Save","Button2")
Sleep(2000)
if(WinExists("Confirm Save As")) Then
    ControlClick("Confirm Save As","&Yes","Button1")	
EndIf
Sleep(2000)

