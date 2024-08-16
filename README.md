# java_test

### ソースコードの実行方法（ターミナルの実行コマンド）
binの配下に移動
```
cd .\java_test\bin\
```

ソース実行(当日を表示)
```
java linux_command.cal
```

または、

ソース実行(指定日を表示)
```
java linux_command.cal 月 年
```
例: java linux_command.cal 8 2024


### 工夫した点、アピールポイント等
1.実際のcalコマンドで当日を表示したときと同じように、当日の日付には、背景色がつくようにしました。
2.引数で月、年を指定すると、指定された年月のカレンダーが表示されます。また、引数の数や、引数の月の指定が不正な数字の場合は、メッセージを返すようにしました。
