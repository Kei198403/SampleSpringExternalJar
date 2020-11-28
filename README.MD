# 環境設定
- Java11
- Eclipse Version: 2020-09 (4.17.0)
- lombok.jarをインストールして、eclipse.iniに追記

# eclipse.iniのlombok.jarの設定
```
-Xbootclasspath/a:c:\fullpath\lombok.jar
-javaagent:c:\fullpath\lombok.jar
```

# ファイルの文字コード
UTF-8

# Jar作成
Gradle Tasksでbuild > bootJarを右クリックして、 「Run Gradle Tasks」
