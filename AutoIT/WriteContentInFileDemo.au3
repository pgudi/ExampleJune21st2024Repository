Run("notepad.exe","C:\Windows")
Sleep(2000)
Send("Selenium is an Automation Tool, Used to Automate UI components.")
Send("{ENTER}")
Send("Selenium supports PAge Object Model to write TestScripts.")
Sleep(2000)
WinClose("*Untitled - Notepad")
Sleep(2000)
ControlClick("Notepad","Do&n't Save","Button2")
Sleep(2000)