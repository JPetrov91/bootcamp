#!/usr/bin/expect -f
set timeout 1
set cdate "[exec date]"
spawn java -cp ../../../../../bin main.java.org.activity12.ChatClient

# Send empty line
send "\r"
expect "> "
# 2nd time
send "hello $cdate\r"
expect "> hello $cdate"

# Send empty line
send "\r"
expect ">"

# Send exit
send "exit\r"
expect EOF

spawn java -cp ../../../../../bin main.java.org.activity12.ChatClient

# Send empty line
send "\r"
expect "> "

# 2nd time
send "hello $cdate\r"
expect "> hello $cdate"

# Send empty line
send "\r"
expect "> "

# Send exit
send "quit\r"
expect EOF
exit 0


